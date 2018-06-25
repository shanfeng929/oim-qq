package com.im.server.general.business.push;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.im.server.bridge.net.WriteHandler;
import com.onlyxiahui.common.message.Head;
import com.onlyxiahui.common.message.push.PushMessage;

@Service
public class VoicePush {

	@Resource
	WriteHandler writeHandler;


	public void pushReceivedVoiceAddress(String userId) {
		Head head = new Head();
		head.setAction("1-503");
		head.setMethod("1.2.0005");
		head.setTime(System.currentTimeMillis());
		PushMessage message = new PushMessage();
		message.setHead(head);
		writeHandler.push(userId, message);
	}
}
