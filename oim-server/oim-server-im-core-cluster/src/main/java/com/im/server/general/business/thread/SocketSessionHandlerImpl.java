package com.im.server.general.business.thread;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.im.server.bridge.session.SocketSessionHandler;
import com.im.server.general.business.push.PersonalPush;
import com.im.server.general.business.session.SocketSessionBox;
import com.im.server.general.common.manager.UserSessionKeyManager;
import com.im.server.general.common.service.UserService;
import com.onlyxiahui.net.session.SocketSession;

/**
 * @author XiaHui
 * @date 2015年3月10日 上午8:53:57
 */
@Component
public class SocketSessionHandlerImpl implements SocketSessionHandler {

	@Resource
	SocketSessionBox socketSessionBox;
	@Resource
	PersonalPush personalPush;
	@Resource
	UserSessionKeyManager userSessionKeyManager;
	@Resource
	UserService userService;

	@Override
	public void put(SocketSession socketSession) {
		String key = socketSession.getKey();
		if (socketSessionBox.isSingleSession()) {
			CopyOnWriteArraySet<SocketSession> set = socketSessionBox.remove(key);
			if (set != null && !set.isEmpty()) {
				Map<String, Object> client = new HashMap<String, Object>();
				client.put("clientType", "");
				client.put("clientVersion", "");
				client.put("onlineTime", "");

				personalPush.pushOtherOnline(set, client, true);
			}
		}
		socketSessionBox.put(socketSession.getKey(), socketSession);
		userSessionKeyManager.put(socketSession);
	}

	@Override
	public boolean hasSession(String key) {
		return userSessionKeyManager.hasSession(key);
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
			
			userSessionKeyManager.removeSession(socketSession);
			
			if (null != key&&!hasSession(key)) {
				userService.removeUser(key);
			}
		}
	}
}
