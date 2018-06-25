package com.im.server.register.center.business.service;

import javax.annotation.Resource;

import com.im.server.register.center.business.bean.ServerInfo;
import com.im.server.register.center.business.session.SocketSessionHandler;
import com.im.server.register.center.common.manager.UserSessionKeyManager;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.onlyxiahui.common.message.result.ResultMessage;
import com.onlyxiahui.net.session.SocketSession;

/**
 * @author Only
 * @date 2016年5月20日 上午11:45:04
 */
@Service
@Transactional
public class SessionService {


	@Resource
	SocketSessionHandler socketSessionHandler;
	@Resource
	UserSessionKeyManager userSessionKeyManager;

	public ResultMessage auth(SocketSession socketSession, ServerInfo serverInfo) {
		ResultMessage message = new ResultMessage();
		socketSession.setAuth(true);
		socketSession.setKey(serverInfo.getId());
		putSocketSession(socketSession);
		return message;
	}

	public void remove(SocketSession socketSession) {
		String serverId = socketSession.getKey();
		userSessionKeyManager.removeAllSession(serverId);
	}

	private void putSocketSession(SocketSession socketSession) {
		socketSessionHandler.put(socketSession);
	}
}
