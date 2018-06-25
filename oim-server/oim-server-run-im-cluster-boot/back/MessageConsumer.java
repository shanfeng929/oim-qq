package com.im.task;

import java.io.IOException;

import javax.annotation.Resource;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.core.ChannelAwareMessageListener;

import com.im.server.general.business.mq.MessageData;
import com.im.server.general.business.mq.MessageQueueReadHandler;
import com.only.common.lib.util.OnlyJsonUtil;
import com.rabbitmq.client.Channel;

/**
 * @author: XiaHui
 * @date: 2018-03-02 11:27:23
 */
public class MessageConsumer implements ChannelAwareMessageListener {

	@Resource
	MessageQueueReadHandler messageQueueReadHandler;

	@Override
	public void onMessage(Message message, Channel channel) throws Exception {
		try {
			String json = new String(message.getBody());
			MessageData md = OnlyJsonUtil.jsonToObject(json, MessageData.class);
			String key = md.getKey();
			String data = md.getData();
			messageQueueReadHandler.push(key, data);
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			channel.basicAck(message.getMessageProperties().getDeliveryTag(), false);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
