package com.im.server.general.common.manager;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.im.server.general.ServerInfo;
import com.onlyxiahui.net.session.SocketSession;

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
			String serverId = serverInfo.getId();

			commonCache.addInSet(userId, serverId);
			commonCache.addInSet(serverId, userId);
		}
	}

	public boolean hasSession(String key) {
		Set<Serializable> set = commonCache.getSet(key);
		return (null != set && !set.isEmpty());

	}

	public void removeSession(SocketSession socketSession) {
		String userId = socketSession.getKey();
		if (null != userId && !userId.isEmpty()) {

			String serverId = serverInfo.getId();
			commonCache.deleteSet(userId, serverId);
			commonCache.deleteSet(serverId, userId);
		}
	}

	public List<String> getServerKeyList(String key) {
		List<String> list = new ArrayList<String>();
		Set<Serializable> resultSet = commonCache.getSet(key);
		for (Serializable i : resultSet) {
			if (null != i) {
				list.add(i.toString());
			}
		}
		return list;
	}
}
