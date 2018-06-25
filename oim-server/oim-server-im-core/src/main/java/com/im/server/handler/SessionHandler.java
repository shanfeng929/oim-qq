package com.im.server.handler;

import javax.annotation.Resource;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;

import com.im.server.bridge.session.SocketSessionHandler;
import com.onlyxiahui.net.session.SocketSession;

/**
 * @author: XiaHui
 * @date: 2016年8月17日 下午5:47:10
 */
@Component
public class SessionHandler {

	protected final Logger logger = LogManager.getLogger(this.getClass());

	@Resource
	SocketSessionHandler socketSessionHandler;

	public void removeSession(SocketSession socketSession) {
		socketSessionHandler.removeSession(socketSession);
	}
}
