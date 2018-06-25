package com.im.server.register.center.business.action;

import javax.annotation.Resource;

import com.im.server.register.center.business.bean.ServerInfo;

import org.springframework.stereotype.Component;

import com.onlyxiahui.common.message.result.ResultMessage;
import com.onlyxiahui.general.annotation.action.ActionMapping;
import com.onlyxiahui.general.annotation.action.MethodMapping;
import com.onlyxiahui.general.annotation.parameter.Define;
import com.onlyxiahui.net.session.SocketSession;
import com.im.server.register.center.business.service.SessionService;

/**
 * 
 * @author XiaHui
 * @date 2018-04-30 08:00:14
 */
@Component
@ActionMapping(value = "1.100")
public class RegisterAction {



	@Resource
	private SessionService sessionService;
	

	@MethodMapping(value = "1.1.0001" , isIntercept = false)
	public ResultMessage auth(
			SocketSession socketSession,
			@Define("serverInfo") ServerInfo serverInfo) {
		ResultMessage message =sessionService.auth(socketSession, serverInfo);
		return message;
	}
}
