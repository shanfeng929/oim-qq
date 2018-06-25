package com.im.server.general.business.action;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.im.server.general.business.thread.SocketThread;
import com.onlyxiahui.common.message.Head;
import com.onlyxiahui.common.message.result.ResultMessage;
import com.onlyxiahui.general.annotation.action.ActionMapping;
import com.onlyxiahui.general.annotation.action.MethodMapping;
import com.onlyxiahui.general.annotation.parameter.Define;
import com.onlyxiahui.im.message.data.AddressData;

/**
 * 
 * @author XiaHui
 *
 */
@Component
@ActionMapping(value = "1.503")
public class VoiceAction {

	@Resource
	private SocketThread socketThread;


	@MethodMapping(value = "1.1.0001")
	public ResultMessage getVoiceServerPort() {
		AddressData voiceAddress = new AddressData();
		int port = socketThread.getPort();
		voiceAddress.setPort(port);
		ResultMessage message = new ResultMessage();
		message.put("voiceAddress", voiceAddress);
		return message;
	}

	@MethodMapping(value = "1.1.0002")
	public ResultMessage getUserVoiceAddress(@Define("userId") String userId) {
		AddressData voiceAddress = socketThread.getVoiceAddress(userId);
		ResultMessage message = new ResultMessage();
		message.put("voiceAddress", voiceAddress);
		return message;
	}

	@MethodMapping(value = "1.1.0003")
	public void voiceRequest(
			Head head,
			@Define("receiveUserId") String receiveUserId,
			@Define("sendUserId") String sendUserId) {
		ResultMessage message = new ResultMessage();
		message.put("receiveUserId", receiveUserId);
		message.put("sendUserId", sendUserId);
		
		message.setHead(head);
	}

	@MethodMapping(value = "1.1.0004")
	public void voiceResponse(
			Head head,
			@Define("receiveUserId") String receiveUserId,
			@Define("sendUserId") String sendUserId,
			@Define("actionType") String actionType) {
		ResultMessage message = new ResultMessage();
		message.put("receiveUserId", receiveUserId);
		message.put("sendUserId", sendUserId);
		message.put("actionType", actionType);
		
		message.setHead(head);
	}
}
