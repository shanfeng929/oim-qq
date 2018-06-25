package com.im.server.general.business.mq;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.im.server.bridge.net.WriteHandler;

/**
 * @author: XiaHui
 * @date: 2018-03-01 16:14:37
 */
@Component
public class WriteHandlerImpl implements WriteHandler {

	@Resource
	MessageQueueWriteHandler messageQueueWriteHandler;

	@Override
	public void push(Object data) {
		messageQueueWriteHandler.push(data);
	}

	@Override
	public void push(String key, Object data) {
		messageQueueWriteHandler.push(key, data);
	}

	@Override
	public void push(List<String> keyList, Object data) {
		messageQueueWriteHandler.push(keyList, data);
	}

	@Override
	public void pushWithout(String key, Object data) {
		messageQueueWriteHandler.push(key, data);
	}

	@Override
	public void pushWithout(List<String> keyList, Object data) {
		messageQueueWriteHandler.pushWithout(keyList, data);
	}
}
