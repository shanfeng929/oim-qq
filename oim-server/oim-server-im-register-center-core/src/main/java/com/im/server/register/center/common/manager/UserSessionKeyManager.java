package com.im.server.register.center.common.manager;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

/**
 * @author: XiaHui
 * @date: 2018-03-02 13:08:04
 */
@Component
public class UserSessionKeyManager {

	@Resource
	CommonCache commonCache;

	public boolean hasSession(String key) {
		Set<Object> set = commonCache.getSet(key);
		return (null != set && !set.isEmpty());

	}

	public void removeSession(String userId, String serverId) {
		if (null != userId && !userId.isEmpty() && null != serverId && !serverId.isEmpty()) {
			commonCache.deleteSet(userId, serverId);
			commonCache.deleteSet(serverId, userId);
		}
	}

	public List<String> getKeyList(String key) {
		List<String> list = new ArrayList<String>();
		Set<Object> resultSet = commonCache.getSet(key);
		for (Object i : resultSet) {
			if (null != i) {
				list.add(i.toString());
			}
		}
		return list;
	}

	public void removeAllSession(String serverId) {
		if (null != serverId && !serverId.isEmpty()) {
			List<String> userIds = getKeyList(serverId);
			for (String userId : userIds) {
				commonCache.deleteSet(userId, serverId);
				commonCache.deleteSet(serverId, userId);
			}
		}
	}
}
