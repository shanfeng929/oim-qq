package com.im.server.general.business.session;

import org.springframework.stereotype.Component;

import com.onlyxiahui.net.server.SessionBox;

@Component
public class SocketSessionBox extends SessionBox{

	public SocketSessionBox(){
		this.setSingleSession(false);
	}
}
