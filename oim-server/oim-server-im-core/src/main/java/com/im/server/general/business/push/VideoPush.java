package com.im.server.general.business.push;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.im.server.bridge.net.WriteHandler;
import com.onlyxiahui.common.message.Head;
import com.onlyxiahui.common.message.push.PushMessage;

@Service
public class VideoPush {

	@Resource
	WriteHandler writeHandler;

	/**
	 * 服务器收到客户端视频后
	 * 
	 * @param userId
	 */
	public void pushReceivedVideoAddress(String userId) {
		Head head = new Head();
		head.setAction("1.502");
		head.setMethod("1.2.0002");
		head.setTime(System.currentTimeMillis());
		PushMessage message = new PushMessage();
		message.setHead(head);
		writeHandler.push(userId, message);
	}
	
	public void pushRequestVideo(String key,String receiveUserId,String sendUserId) {
		Head head = new Head();
		head.setAction("1.502");
		head.setMethod("1.2.0004");
		head.setTime(System.currentTimeMillis());
		head.setKey(key);
		
		PushMessage message = new PushMessage();
		message.setHead(head);
		message.put("receiveUserId", receiveUserId);
		message.put("sendUserId", sendUserId);
		writeHandler.push(receiveUserId, message);
	}
	
	public void pushResponseVideo(String key,String sendUserId, String receiveUserId,String actionType) {
		Head head = new Head();
		head.setAction("1.502");
		head.setMethod("1.2.0005");
		head.setTime(System.currentTimeMillis());
		head.setKey(key);
		
		PushMessage message = new PushMessage();
		message.setHead(head);
		message.put("receiveUserId", receiveUserId);
		message.put("sendUserId", sendUserId);
		message.put("actionType", actionType);
		writeHandler.push(receiveUserId, message);
	}
}
