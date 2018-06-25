package com.im.server.register.center.business.session;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.im.server.register.center.business.service.SessionService;
import com.onlyxiahui.net.session.SocketSession;

/**
 * 
 * @author XiaHui
 * @date 2018-04-30 08:20:24
 */
@Component
public class SocketSessionHandlerImpl implements SocketSessionHandler {

	@Resource
	SocketSessionBox socketSessionBox;
	@Resource
	SessionService  sessionService;

	@Override
	public void put(SocketSession socketSession) {
		String key = socketSession.getKey();
		if (socketSessionBox.isSingleSession()) {
			socketSessionBox.remove(key);
		}
		socketSessionBox.put(socketSession.getKey(), socketSession);
	}

	@Override
	public boolean hasSession(String key) {
		return socketSessionBox.hasSession(key);
	}

	/**
	 * 移除客户端会话
	 */
	@Override
	public void removeSession(SocketSession socketSession) {
		String key = socketSession.getKey();
		//移除本服务器的客户端连接
		socketSessionBox.remove(socketSession);
		//本服务器是否还有同一个用户的连接
		boolean has = socketSessionBox.hasSession(key);
		if (!has) {
			sessionService.remove(socketSession);
		}
	}
}
