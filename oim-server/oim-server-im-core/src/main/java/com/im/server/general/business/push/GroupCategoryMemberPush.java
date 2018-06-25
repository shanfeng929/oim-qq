package com.im.server.general.business.push;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.im.server.bridge.net.WriteHandler;
import com.onlyxiahui.common.message.Head;
import com.onlyxiahui.common.message.push.PushMessage;

/**
 * @author: XiaHui
 * @date: 2016年8月26日 上午9:21:41
 */
@Service
public class GroupCategoryMemberPush {
	@Resource
	WriteHandler writeHandler;
	
	public void pushAddUser(String groupId,String userId,List<String> userIdList){
		PushMessage message=new PushMessage();
		Head head=new Head();
		head.setAction("1.203");
		head.setMethod("1.2.0002");
		head.setTime(System.currentTimeMillis());
		message.setHead(head);
		message.put("userId", userId);
		message.put("groupId", groupId);
		writeHandler.push(userIdList, message);
	}
}
