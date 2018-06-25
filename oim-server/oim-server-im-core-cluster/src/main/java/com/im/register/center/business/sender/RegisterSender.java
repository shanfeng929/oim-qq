package com.im.register.center.business.sender;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.im.register.center.module.NetModule;
import com.onlyxiahui.common.message.Head;
import com.onlyxiahui.im.message.client.Message;
import com.onlyxiahui.net.data.action.DataBackAction;

/**
 * @author XiaHui
 * @date 2018-04-30 22:00:15
 */
@Component
public class RegisterSender {

	@Resource
	NetModule netModule;
	
	public void auth(String serverId, DataBackAction dataBackAction) {
		
		Map<String,Object> server=new HashMap<String,Object>();
		server.put("id", serverId);
		Message message = new Message();

		message.put("serverInfo", server);
		Head head = new Head();
		head.setAction("1.100");
		head.setMethod("1.1.0001");
		head.setTime(System.currentTimeMillis());
		message.setHead(head);
		netModule.write(message, dataBackAction);
	}
}
