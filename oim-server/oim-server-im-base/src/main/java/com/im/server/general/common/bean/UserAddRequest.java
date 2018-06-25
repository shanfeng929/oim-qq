package com.im.server.general.common.bean;

import java.util.Date;

import javax.persistence.Entity;

import com.im.base.bean.BaseBean;

/**
 * 用添加联系人的请求信息
 * 
 * @author XiaHui
 * @date 2017-11-24 10:40:15
 */
@Entity(name = "im_user_add_request")
public class UserAddRequest extends BaseBean {

	private String requestUserId;// 添加联系人的请求用户
	private String addUserId;// 被添加的用户
	private String userCategoryId;// 分组id
	private String remark;// 备注名
	private String verifyType;// 当时设定的验证方式
	private Date createDateTime;// 建立时间
	private String question;// 问题(当验证方式为回答问题时)
	private String answer;// 答案(当验证方式为回答问题时)
	private String handleType;// 处理结果：0:未处理 1:同意 2:拒绝 3:忽略
	private Date handleDateTime;// 处理时间
	private String message;// 附加消息

	/** 0:未处理 **/
	public static final String handle_type_untreated = "0";
	/** 1:同意 **/
	public static final String handle_type_accept = "1";
	/** 2:拒绝 **/
	public static final String handle_type_reject = "2";
	/** 3:忽略 **/
	public static final String handle_type_ignore = "3";

	public String getRequestUserId() {
		return requestUserId;
	}

	public void setRequestUserId(String requestUserId) {
		this.requestUserId = requestUserId;
	}

	public String getAddUserId() {
		return addUserId;
	}

	public void setAddUserId(String addUserId) {
		this.addUserId = addUserId;
	}

	public String getUserCategoryId() {
		return userCategoryId;
	}

	public void setUserCategoryId(String userCategoryId) {
		this.userCategoryId = userCategoryId;
	}

	public String getVerifyType() {
		return verifyType;
	}

	public void setVerifyType(String verifyType) {
		this.verifyType = verifyType;
	}

	public Date getCreateDateTime() {
		return createDateTime;
	}

	public void setCreateDateTime(Date createDateTime) {
		this.createDateTime = createDateTime;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public String getHandleType() {
		return handleType;
	}

	public void setHandleType(String handleType) {
		this.handleType = handleType;
	}

	public Date getHandleDateTime() {
		return handleDateTime;
	}

	public void setHandleDateTime(Date handleDateTime) {
		this.handleDateTime = handleDateTime;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}
