package com.im.server.general.business.push;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.im.server.bridge.net.WriteHandler;
import com.im.server.general.common.bean.UserCategoryMember;
import com.onlyxiahui.common.message.Head;
import com.onlyxiahui.common.message.push.PushMessage;

/**
 * @author: XiaHui
 * @date: 2016年8月26日 上午9:21:41
 */
@Service
public class UserCategoryMemberPush {
	@Resource
	WriteHandler writeHandler;
	
	public void pushAddUserCategoryMember(String key,UserCategoryMember userCategoryMember,String userId){
		Head head=new Head();
		head.setAction("1.103");
		head.setMethod("1.2.0001");
		head.setKey(key);
		head.setTime(System.currentTimeMillis());
		PushMessage message=new PushMessage();
		message.setHead(head);
		message.put("userCategoryMember", userCategoryMember);
		writeHandler.push(userId, message);
	}
}
