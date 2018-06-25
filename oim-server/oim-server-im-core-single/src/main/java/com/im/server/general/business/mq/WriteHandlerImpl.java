package com.im.server.general.business.mq;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.im.server.bridge.net.WriteHandler;
import com.im.server.general.business.session.SocketSessionBox;

/**
 * @author: XiaHui
 * @date: 2018-03-01 16:14:37
 */
@Component
public class WriteHandlerImpl implements WriteHandler {

	@Resource
	SocketSessionBox socketSessionBox;

	@Override
	public void push(Object data) {
		socketSessionBox.push(data);
	}

	@Override
	public void push(String key, Object data) {
		socketSessionBox.push(key, data);
	}

	@Override
	public void push(List<String> keyList, Object data) {
		socketSessionBox.push(keyList, data);
	}

	@Override
	public void pushWithout(String key, Object data) {
		socketSessionBox.push(key, data);
	}

	@Override
	public void pushWithout(List<String> keyList, Object data) {
		socketSessionBox.pushWithout(keyList, data);
	}

}
