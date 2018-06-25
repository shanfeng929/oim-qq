package com.im.server.general.business.action;

import javax.annotation.Resource;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;

import com.im.server.general.common.service.LastChatService;
import com.onlyxiahui.common.message.Head;
import com.onlyxiahui.common.message.result.ResultMessage;
import com.onlyxiahui.general.annotation.action.ActionMapping;
import com.onlyxiahui.general.annotation.action.MethodMapping;
import com.onlyxiahui.general.annotation.parameter.Define;
import com.onlyxiahui.net.session.SocketSession;

@Component
@ActionMapping(value = "1.500")
public class ChatAction {

	protected final Logger logger = LogManager.getLogger(this.getClass());
	@Resource
	LastChatService lastChatService;

	/**
	 * 获取最近聊天列表（含对象id和类型）<br>
	 * 此接口获取的最近列表只包含最近聊天对象的类型（用户或者群等）和聊天对象的id<br>
	 * @author: XiaHui
	 * @param head
	 * @param socketSession
	 * @return
	 * @createDate: 2017年4月26日 下午1:55:00
	 * @update: XiaHui
	 * @updateDate: 2017年4月26日 下午1:55:00
	 */
	@MethodMapping(value = "1.1.0001")
	public Object getLastChatList(Head head,
			SocketSession socketSession,
			@Define("userId") String userId,
			@Define("type") String type,
			@Define("count") int count) {
		userId = socketSession.getKey();
		ResultMessage message = lastChatService.getLastChatList(userId, type, count);
		return message;
	}
	
	/**
	 * 获取最近聊天列表（含对象信息）<br>
	 * 此接口获取的最近聊天列表含聊天对象的详细信息。
	 * @author: XiaHui
	 * @param head
	 * @param socketSession
	 * @param userId
	 * @param type
	 * @param count
	 * @return
	 * @createDate: 2018-04-28 11:05:24
	 * @update: XiaHui
	 * @updateDate: 2018-04-28 11:05:24
	 */
	@MethodMapping(value = "1.1.0002")
	public Object getLastChatWithDataList(Head head,
			SocketSession socketSession,
			@Define("userId") String userId,
			@Define("type") String type,
			@Define("count") int count) {
		userId = socketSession.getKey();
		ResultMessage message = lastChatService.getLastChatWithDataList(userId, type, count);
		return message;
	}

	/**
	 * 获取最近聊天列表（含最后聊天内容）<br>
	 * 此接口包含聊天对象详细信息和聊天内容
	 * @author: XiaHui
	 * @param head
	 * @param socketSession
	 * @param userId
	 * @param type
	 * @param count
	 * @return
	 * @createDate: 2018-04-28 11:02:50
	 * @update: XiaHui
	 * @updateDate: 2018-04-28 11:02:50
	 */
	@MethodMapping(value = "1.1.0003")
	public Object getLastChatWithContentList(Head head,
			SocketSession socketSession,
			@Define("userId") String userId,
			@Define("type") String type,
			@Define("count") int count) {
		userId = socketSession.getKey();
		ResultMessage message = lastChatService.getLastChatWithContentList(userId, type, count);
		return message;
	}

	/**
	 * 删除聊天记录
	 * 
	 * @param head
	 * @param socketSession
	 * @param userId
	 * @param chatId
	 * @param type
	 * @return
	 */
	@MethodMapping(value = "1.1.0004")
	public Object removeLastChat(Head head,
			SocketSession socketSession,
			@Define("userId") String userId,
			@Define("chatId") String chatId,
			@Define("type") String type) {
		// String userId = socketSession.getKey();
		ResultMessage message = new ResultMessage();
		lastChatService.remove(userId, chatId, type);
		return message;
	}
}
