package com.im.server.register.center.business.session;

import com.onlyxiahui.net.session.SocketSession;



/**
 * 
 * @author: XiaHui
 * @date 2018-03-01 11:15:11
 */
public interface SocketSessionHandler {
	
	public void put(SocketSession socketSession);
	
	public boolean hasSession(String key);
	
	public void removeSession(SocketSession socketSession);
	
}
