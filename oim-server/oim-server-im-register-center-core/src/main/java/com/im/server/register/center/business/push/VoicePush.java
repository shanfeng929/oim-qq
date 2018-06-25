package com.im.server.register.center.business.push;

import org.springframework.stereotype.Service;

import com.onlyxiahui.common.message.Head;
import com.onlyxiahui.common.message.push.PushMessage;

@Service
public class VoicePush {

	

	public void pushReceivedVoiceAddress(String userId) {
		Head head = new Head();
		head.setAction("1-503");
		head.setMethod("1.2.0005");
		head.setTime(System.currentTimeMillis());
		PushMessage message = new PushMessage();
		message.setHead(head);
	}
}
