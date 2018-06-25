package com.im.server.general.business.mq;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;

import com.im.server.general.common.manager.UserSessionKeyManager;
import com.onlyxiahui.common.lib.util.OnlyJsonUtil;

/**
 * 这个用于扩展，统一发送消息，未来做扩展，多台服务器的时候用mq
 * 
 * @author XiaHui
 * @date 2017-11-23 17:55:57
 */
@Component
public class MessageQueueWriteHandler {

	@Resource
	RabbitTemplate messageRabbitTemplate;

	@Resource
	UserSessionKeyManager userSessionKeyManager;

	public void push(Object data) {
		String json = OnlyJsonUtil.objectToJson(data);
		MessageData messageData = new MessageData();
		messageData.setType(MessageData.type_all);
		messageData.setData(json);
		String message = OnlyJsonUtil.objectToJson(messageData);
		messageRabbitTemplate.convertAndSend("oim.server.fanout.message.exchange", "", message);
	}

	public void push(String key, Object data) {
		String json = OnlyJsonUtil.objectToJson(data);
		List<String> ids = userSessionKeyManager.getServerKeyList(key);

		MessageData messageData = new MessageData();
		messageData.setType(MessageData.type_one);
		messageData.setData(json);
		messageData.setKey(key);
		String message = OnlyJsonUtil.objectToJson(messageData);
		for (String id : ids) {
			messageRabbitTemplate.convertAndSend("oim.server.topic.message.exchange", id, message);
		}
	}

	public void push(List<String> keyList, Object data) {
		String json = OnlyJsonUtil.objectToJson(data);
		for (String key : keyList) {
			List<String> ids = userSessionKeyManager.getServerKeyList(key);
			MessageData messageData = new MessageData();
			messageData.setType(MessageData.type_all);
			messageData.setData(json);
			messageData.setKey(key);
			String message = OnlyJsonUtil.objectToJson(messageData);
			for (String id : ids) {
				messageRabbitTemplate.convertAndSend("oim.server.topic.message.exchange", id, message);
			}
		}
	}

	public void pushWithout(String key, Object data) {
		String json = OnlyJsonUtil.objectToJson(data);
		MessageData messageData = new MessageData();
		messageData.setType(MessageData.type_without_one);
		messageData.setKey(key);
		messageData.setData(json);
		String message = OnlyJsonUtil.objectToJson(messageData);
		messageRabbitTemplate.convertAndSend("oim.server.fanout.message.exchange", "", message);

	}

	public void pushWithout(List<String> keyList, Object data) {
		String json = OnlyJsonUtil.objectToJson(data);
		MessageData messageData = new MessageData();
		messageData.setType(MessageData.type_without_list);
		messageData.setKeyList(keyList);
		messageData.setData(json);
		String message = OnlyJsonUtil.objectToJson(messageData);
		messageRabbitTemplate.convertAndSend("oim.server.fanout.message.exchange", "", message);
	}
}
