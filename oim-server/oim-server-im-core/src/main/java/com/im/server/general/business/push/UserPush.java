package com.im.server.general.business.push;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.im.server.bridge.net.WriteHandler;
import com.onlyxiahui.common.message.Head;
import com.onlyxiahui.common.message.push.PushMessage;
import com.onlyxiahui.im.message.data.setting.VerifyAnswer;
import com.onlyxiahui.im.message.data.user.UserAddPushRequestData;
import com.onlyxiahui.im.message.data.user.UserAddPushResponseData;
import com.onlyxiahui.im.message.data.user.UserData;

/**
 * @author: XiaHui
 * @date: 2016年8月26日 上午9:21:41
 */
@Service
public class UserPush {
	@Resource
	WriteHandler writeHandler;

	public void pushUserStatus(String key, String userId, String status, List<String> userIdList) {
		Head head = new Head();
		head.setAction("1.101");
		head.setMethod("1.2.0008");
		head.setKey(key);
		head.setTime(System.currentTimeMillis());
		PushMessage message = new PushMessage();
		message.setHead(head);
		message.put("userId", userId);
		message.put("status", status);
		writeHandler.push(userIdList, message);
	}

	public void pushUserUpdate(Head h, String userId, List<String> userIdList) {
		Head head = new Head();
		head.setAction("1.101");
		head.setMethod("1.2.0009");
		head.setKey(h.getKey());
		head.setTime(System.currentTimeMillis());
		PushMessage message = new PushMessage();
		message.setHead(head);
		message.put("userId", userId);
		writeHandler.push(userIdList, message);
	}

	public void pushUserUpdate(Head head, UserData userData, List<String> userIdList) {
		PushMessage message = new PushMessage();
		message.setHead(head);
		message.put("userData", userData);
		writeHandler.push(userIdList, message);
	}

	/**
	 * 推送收到请求被添加为联系人消息
	 * @author: XiaHui
	 * @param key
	 * @param request
	 * @param answerList
	 * @param userId
	 * @createDate: 2018-04-25 11:24:32
	 * @update: XiaHui
	 * @updateDate: 2018-04-25 11:24:32
	 */
	public void pushUserAddRequest(String key, UserAddPushRequestData request, List<VerifyAnswer> answerList, String userId) {
		Head head = new Head();
		head.setAction("1.101");
		head.setMethod("1.2.0015");
		head.setKey(key);
		head.setTime(System.currentTimeMillis());
		PushMessage message = new PushMessage();
		message.setHead(head);
		message.put("request", request);
		message.put("answerList", answerList);
		writeHandler.push(userId, message);
	}
	
	/**
	 * 请求添加为联系人，被添加人处理后推送给请求人
	 * @author: XiaHui
	 * @param key
	 * @param response
	 * @param userId
	 * @createDate: 2018-04-25 11:23:28
	 * @update: XiaHui
	 * @updateDate: 2018-04-25 11:23:28
	 */
	public void pushUserAddResponse(String key, UserAddPushResponseData response,  String userId) {
		Head head = new Head();
		head.setAction("1.101");
		head.setMethod("1.2.0016");
		head.setKey(key);
		head.setTime(System.currentTimeMillis());
		PushMessage message = new PushMessage();
		message.setHead(head);
		message.put("response", response);
		writeHandler.push(userId, message);
	}
}
