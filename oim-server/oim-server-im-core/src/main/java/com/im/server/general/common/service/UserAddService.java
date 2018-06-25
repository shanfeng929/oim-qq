package com.im.server.general.common.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.im.server.general.business.push.UserCategoryMemberPush;
import com.im.server.general.business.push.UserPush;
import com.im.server.general.common.bean.UserAddRequest;
import com.im.server.general.common.bean.UserAddVerifyAnswer;
import com.im.server.general.common.bean.UserCategoryMember;
import com.im.server.general.common.bean.UserHarassSetting;
import com.im.server.general.common.dao.UserAddRequestDAO;
import com.im.server.general.common.dao.UserAddVerifyAnswerDAO;
import com.im.server.general.common.dao.UserAddVerifyQuestionDAO;
import com.im.server.general.common.dao.UserCategoryMemberDAO;
import com.im.server.general.common.dao.UserHarassSettingDAO;
import com.im.server.general.common.manager.UserCategoryManager;
import com.im.server.general.common.manager.UserCategoryMemberManager;
import com.im.server.general.common.manager.UserHarassSettingManager;
import com.onlyxiahui.common.message.result.ResultMessage;
import com.onlyxiahui.im.message.data.setting.UserAddVerifySetting;
import com.onlyxiahui.im.message.data.setting.VerifyAnswer;
import com.onlyxiahui.im.message.data.setting.VerifyQuestion;
import com.onlyxiahui.im.message.data.user.UserAddPushRequestData;
import com.onlyxiahui.im.message.data.user.UserAddPushResponseData;
import com.onlyxiahui.im.message.data.user.UserAddRequestData;
import com.onlyxiahui.im.message.data.user.UserAddResponseData;

/**
 * 
 * @author: XiaHui
 * @date 2018-04-22 18:57:11
 */
@Service
@Transactional
public class UserAddService {
	protected final Logger logger = LogManager.getLogger(this.getClass());

	@Resource
	private UserHarassSettingDAO userHarassSettingDAO;
	@Resource
	private UserAddVerifyQuestionDAO userAddVerifyQuestionDAO;
	@Resource
	private UserHarassSettingManager userHarassSettingManager;
	@Resource
	private UserCategoryMemberDAO userCategoryMemberDAO;
	@Resource
	private UserAddRequestDAO userAddRequestDAO;
	@Resource
	private UserAddVerifyAnswerDAO userAddVerifyAnswerDAO;
	@Resource
	private UserCategoryMemberPush userCategoryMemberPush;
	@Resource
	private UserCategoryManager userCategoryManager;
	@Resource
	private UserCategoryMemberManager userCategoryMemberManager;
	@Resource
	private UserPush userPush;

	/**
	 * 获取用户被添加为联系人的验证设置
	 * 
	 * @author: XiaHui
	 * @param userId
	 * @return
	 * @createDate: 2018-04-22 19:09:39
	 * @update: XiaHui
	 * @updateDate: 2018-04-22 19:09:39
	 */
	public ResultMessage getUserAddVerifySetting(String userId) {

		ResultMessage rm = new ResultMessage();
		List<VerifyQuestion> questionList = null;
		UserAddVerifySetting setting = userHarassSettingDAO.getByUserId(userId, UserAddVerifySetting.class);

		if (setting == null) {
			setting = new UserAddVerifySetting();
			setting.setUserId(userId);
			setting.setVerifyType(UserHarassSetting.verify_type_auth);
		}

		String type = setting.getVerifyType();
		if (UserHarassSetting.verify_type_confirm.equals(type)) {
			questionList = userAddVerifyQuestionDAO.getListByUserId(userId, VerifyQuestion.class);
		}

		if (null == questionList) {
			questionList = new ArrayList<VerifyQuestion>();
		}

		rm.put("verifySetting", setting);
		rm.put("questionList", questionList);
		return rm;
	}

	public ResultMessage userAddRequest(String key, UserAddRequestData request, List<VerifyAnswer> answerList) {
		ResultMessage rm = new ResultMessage();

		String requestUserId = request.getRequestUserId();
		String requestCategoryId = request.getUserCategoryId();
		String requestRemark = request.getRemark();

		String addUserId = request.getAddUserId();

		String requestAnswer = request.getAnswer();

		UserHarassSetting setting = userHarassSettingManager.getUserHarassSetting(addUserId);

		String verifyType = setting.getVerifyType();
		String settingAnswer = setting.getAnswer();

		String handleType = UserAddRequest.handle_type_untreated;

		if (UserHarassSetting.verify_type_any.equals(verifyType)) {
			String addCategoryId = userCategoryManager.getOrCreateDefaultCategoryId(addUserId);
			String addRemark = "";

			handleType = UserAddRequest.handle_type_accept;
			UserAddRequest userAddRequest = addUserAddRequest(handleType, request, answerList, setting);

			bothContact(key, requestUserId, requestCategoryId, requestRemark, addUserId, addCategoryId, addRemark);
			handleUserAddResponse(key, userAddRequest, "");
		} else if (UserHarassSetting.verify_type_answer.equals(verifyType)) {

			if (null == null || requestAnswer.isEmpty()) {
				rm.addWarning("001", "请回答问题！");
				return rm;
			}

			String ra = requestAnswer.toLowerCase().trim();
			String sa = settingAnswer.toLowerCase().trim();

			if (!ra.equals(sa)) {
				rm.addWarning("002", "回答不正确！");
				return rm;
			}

			handleType = UserAddRequest.handle_type_accept;
			UserAddRequest userAddRequest = addUserAddRequest(handleType, request, answerList, setting);

			String addCategoryId = userCategoryManager.getOrCreateDefaultCategoryId(addUserId);
			String addRemark = "";
			bothContact(key, requestUserId, requestCategoryId, requestRemark, addUserId, addCategoryId, addRemark);
			handleUserAddResponse(key, userAddRequest, "");
		} else if (UserHarassSetting.verify_type_auth.equals(verifyType)) {
			UserAddRequest userAddRequest = addUserAddRequest(handleType, request, answerList, setting);

			String requestId = userAddRequest.getId();// 请求记录id

			UserAddPushRequestData pushRequest = new UserAddPushRequestData();
			pushRequest.setRequestId(requestId);
			pushRequest.setRequestUserId(requestUserId);
			pushRequest.setAddUserId(addUserId);
			pushRequest.setVerifyType(verifyType);
			pushRequest.setQuestion(setting.getQuestion());
			pushRequest.setAnswer(requestAnswer);
			pushRequest.setMessage(request.getMessage());
			// 推送添加请求
			userPush.pushUserAddRequest(key, pushRequest, answerList, addUserId);
		} else if (UserHarassSetting.verify_type_confirm.equals(verifyType)) {
			UserAddRequest userAddRequest = addUserAddRequest(handleType, request, answerList, setting);

			String requestId = userAddRequest.getId();// 请求记录id

			UserAddPushRequestData pushRequest = new UserAddPushRequestData();
			pushRequest.setRequestId(requestId);
			pushRequest.setRequestUserId(requestUserId);
			pushRequest.setAddUserId(addUserId);
			pushRequest.setVerifyType(verifyType);
			pushRequest.setQuestion(setting.getQuestion());
			pushRequest.setAnswer(requestAnswer);
			pushRequest.setMessage(request.getMessage());
			// 推送添加请求
			userPush.pushUserAddRequest(key, pushRequest, answerList, addUserId);
		}
		return rm;
	}

	private boolean bothContact(
			String key,
			String requestUserId,
			String requestCategoryId,
			String requestRemark,
			String addUserId,
			String addCategoryId,
			String addRemark) {

		boolean mark = true;

		userCategoryMemberManager.bothContact(requestUserId, requestCategoryId, requestRemark, addUserId, addCategoryId, addRemark);
		// 推送添加成功消息
		UserCategoryMember requestMember = new UserCategoryMember();
		requestMember.setOwnUserId(requestUserId);
		requestMember.setMemberUserId(addUserId);
		requestMember.setRemark(requestRemark);
		requestMember.setUserCategoryId(requestCategoryId);
		userCategoryMemberPush.pushAddUserCategoryMember(key, requestMember, requestUserId);

		UserCategoryMember addMember = new UserCategoryMember();
		addMember.setOwnUserId(addUserId);
		addMember.setMemberUserId(requestUserId);
		addMember.setRemark(addRemark);
		addMember.setUserCategoryId(addCategoryId);
		userCategoryMemberPush.pushAddUserCategoryMember(key, addMember, addUserId);
		return mark;
	}

	private UserAddRequest addUserAddRequest(String handleType, UserAddRequestData request, List<VerifyAnswer> answerList, UserHarassSetting setting) {

		String requestUserId = request.getRequestUserId();
		String requestCategoryId = request.getUserCategoryId();
		String requestRemark = request.getRemark();

		String addUserId = request.getAddUserId();
		String requestAnswer = request.getAddUserId();

		String verifyType = setting.getVerifyType();
		// String settingAnswer = setting.getAnswer();

		UserAddRequest userAddRequest = new UserAddRequest();
		userAddRequest.setRequestUserId(requestUserId);
		userAddRequest.setAddUserId(addUserId);
		userAddRequest.setUserCategoryId(requestCategoryId);
		userAddRequest.setRemark(requestRemark);
		userAddRequest.setVerifyType(verifyType);
		userAddRequest.setCreateDateTime(new Date());
		userAddRequest.setQuestion(setting.getQuestion());
		userAddRequest.setAnswer(requestAnswer);
		userAddRequest.setHandleType(handleType);
		userAddRequest.setHandleDateTime(new Date());
		userAddRequest.setMessage(request.getMessage());

		userAddRequestDAO.save(userAddRequest);

		if (UserHarassSetting.verify_type_confirm.equals(verifyType) && null != answerList && !answerList.isEmpty()) {
			Map<String, VerifyQuestion> questionMap = new HashMap<String, VerifyQuestion>();
			List<VerifyQuestion> questionList = userAddVerifyQuestionDAO.getListByUserId(addUserId, VerifyQuestion.class);
			if (null != questionList && !questionList.isEmpty()) {
				for (VerifyQuestion q : questionList) {
					questionMap.put(q.getId(), q);
				}
			}
			String requestId = userAddRequest.getId();// 请求消息的id(对应UserAddRequest中的id)

			List<UserAddVerifyAnswer> list = new ArrayList<UserAddVerifyAnswer>();
			for (VerifyAnswer a : answerList) {

				String questionId = a.getQuestionId();// 问题id(对应UserAddVerifyQuestion中的id)
				String question = "";// 问题
				String answer = a.getAnswer();// 答案
				VerifyQuestion q = questionMap.get(questionId);
				if (null != q) {
					question = q.getQuestion();
				}
				UserAddVerifyAnswer bean = new UserAddVerifyAnswer();
				bean.setRequestId(requestId);
				bean.setRequestUserId(requestUserId);
				bean.setAddUserId(addUserId);
				bean.setQuestionId(questionId);
				bean.setQuestion(question);
				bean.setAnswer(answer);
				bean.setCreateDateTime(new Date());
				list.add(bean);
			}

			if (!list.isEmpty()) {
				userAddVerifyAnswerDAO.saveList(list);
			}
		}
		return userAddRequest;
	}

	public ResultMessage userAddResponse(String key, UserAddResponseData response) {

		ResultMessage rm = new ResultMessage();

		String requestId = response.getRequestId();// 请求记录id
		// String requestUserId = response.getRequestUserId();// 添加联系人的请求用户
		// String addUserId = response.getAddUserId();// 被添加的用户
		String addCategoryId = response.getUserCategoryId();// 分组id
		String addRemark = response.getRemark();// 备注名

		String handleType = response.getHandleType();// 处理结果：0:未处理 1:同意 2:拒绝
														// 3:忽略
		String message = response.getMessage();// 附加消息

		UserAddRequest userAddRequest = userAddRequestDAO.get(requestId);
		if (null != userAddRequest) {

			String requestUserId = userAddRequest.getRequestUserId();// 添加联系人的请求用户
			String addUserId = userAddRequest.getAddUserId();// 被添加的用户

			userAddRequest.setHandleType(handleType);
			userAddRequestDAO.update(userAddRequest);

			if (UserAddRequest.handle_type_accept.equals(handleType)) {
				String requestCategoryId = userAddRequest.getUserCategoryId();
				String requestRemark = userAddRequest.getRemark();
				if (null == addCategoryId || addCategoryId.isEmpty()) {
					addCategoryId = userCategoryManager.getOrCreateDefaultCategoryId(addUserId);
				}
				bothContact(key, requestUserId, requestCategoryId, requestRemark, addUserId, addCategoryId, addRemark);
			}
			handleUserAddResponse(key, userAddRequest, message);
		}
		return rm;
	}

	/**
	 * 推送被添加为好友的响应消息
	 * 
	 * @author: XiaHui
	 * @param key
	 * @param userAddRequest
	 * @param message
	 * @createDate: 2018-04-25 11:39:49
	 * @update: XiaHui
	 * @updateDate: 2018-04-25 11:39:49
	 */
	private void handleUserAddResponse(String key, UserAddRequest userAddRequest, String message) {
		String handleType = userAddRequest.getHandleType();
		String requestId = userAddRequest.getId();// 请求记录id
		String requestUserId = userAddRequest.getRequestUserId();// 添加联系人的请求用户
		String addUserId = userAddRequest.getAddUserId();// 被添加的用户

		UserAddPushResponseData pushResponse = new UserAddPushResponseData();
		pushResponse.setRequestId(requestId);// 请求记录id
		pushResponse.setRequestUserId(requestUserId);// 添加联系人的请求用户
		pushResponse.setAddUserId(addUserId);// 被添加的用户
		pushResponse.setHandleType(handleType);// 处理结果：0:未处理 1:同意 2:拒绝 3:忽略
		pushResponse.setMessage(message);// 附加消息
		userPush.pushUserAddResponse(key, pushResponse, requestUserId);
	}
}
