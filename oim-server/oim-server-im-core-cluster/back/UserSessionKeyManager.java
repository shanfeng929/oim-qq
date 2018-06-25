package com.im.server.general.common.manager;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.im.server.ServerInfo;
import com.only.net.session.SocketSession;

/**
 * @author: XiaHui
 * @date: 2018-03-02 13:08:04
 */
@Component
public class UserSessionKeyManager {

	@Resource
	CommonCache commonCache;

	@Resource
	ServerInfo serverInfo;

	public void put(SocketSession socketSession) {
		String userId = socketSession.getKey();
		if (null != userId && !userId.isEmpty()) {
			commonCache.addSet(userId, serverInfo.getId());
		}
	}

	public boolean hasSession(String key) {
		Set<Serializable> allSet = commonCache.getSet(key);
		return (null!=allSet&&!allSet.isEmpty());

	}

	public void removeSession(SocketSession socketSession) {
		String userId = socketSession.getKey();
		if (null != userId && !userId.isEmpty()) {
			commonCache.deleteSet(userId, serverInfo.getId());
		}
	}

	public Set<String> getServerKeySet(String key) {
		Set<String> set = new HashSet<String>();
		Set<Serializable> allSet = commonCache.getSet(key);
		if (null != allSet) {
			for (Serializable s : allSet) {
				if (null != s) {
					set.add(s.toString());
				}
			}
		}
		return set;
	}
}
