package com.im.server.bridge.user;

import java.util.List;

import com.onlyxiahui.im.message.data.user.UserData;

/**
 * @author: XiaHui
 * @date: 2018-04-10 3:29:07
 */
public interface UserStore {

	public void put(UserData userData);
	
	public void updateStatus(String userId,String status);
	
	public List<UserData> queryList();
}
