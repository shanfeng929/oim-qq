package com.im.server.handler;

import com.onlyxiahui.net.session.SocketSession;

/**
 * @author: XiaHui
 * @date: 2018-04-25 13:53:56
 */
public interface MessageInterceptor {

	boolean previousHandle() throws Exception;

	void afterCompletion(Object message, SocketSession socketSession);
}
