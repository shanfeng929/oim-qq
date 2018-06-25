package com.im.server.handler;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.im.server.register.center.business.session.SocketSessionHandler;
import com.onlyxiahui.net.session.SocketSession;

/**
 * @author: XiaHui
 * @date: 2016年8月17日 下午5:47:10
 */
@Component
public class SessionHandler {


	@Resource
	SocketSessionHandler socketSessionHandler;

	public void removeSession(SocketSession socketSession) {
		socketSessionHandler.removeSession(socketSession);
	}
}
