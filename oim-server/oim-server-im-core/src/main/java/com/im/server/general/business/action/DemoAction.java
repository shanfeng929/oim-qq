package com.im.server.general.business.action;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.im.server.general.common.dao.DemoDAO;
import com.onlyxiahui.common.message.Head;
import com.onlyxiahui.general.annotation.action.ActionMapping;
import com.onlyxiahui.general.annotation.action.MethodMapping;
import com.onlyxiahui.net.session.SocketSession;

/**
 * 
 * @author XiaHui
 *
 */
@Component
@ActionMapping(value = "1.00")
public class DemoAction {
	@Resource
	DemoDAO demoDAO;
	
	@MethodMapping(value = "1.1.0001")
	public void demo(SocketSession socketSession, Head head) {
		demoDAO.demo();
	}
}
