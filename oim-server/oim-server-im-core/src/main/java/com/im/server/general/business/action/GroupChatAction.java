package com.im.server.general.business.action;

import javax.annotation.Resource;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;

import com.im.server.general.common.service.GroupChatLogService;
import com.im.server.general.common.service.GroupChatService;
import com.onlyxiahui.common.message.Head;
import com.onlyxiahui.common.message.result.ResultMessage;
import com.onlyxiahui.general.annotation.action.ActionMapping;
import com.onlyxiahui.general.annotation.action.MethodMapping;
import com.onlyxiahui.general.annotation.parameter.Define;
import com.onlyxiahui.im.message.data.PageData;
import com.onlyxiahui.im.message.data.chat.Content;
import com.onlyxiahui.im.message.data.query.ChatQuery;
import com.onlyxiahui.net.session.SocketSession;
import com.onlyxiahui.query.page.DefaultPage;

@Component
@ActionMapping(value = "1.500")
public class GroupChatAction {
	
	protected final Logger logger = LogManager.getLogger(this.getClass());
	
	@Resource
	GroupChatLogService groupChatLogService;
	@Resource
	GroupChatService groupChatService;
	
	/**
	 * 发送群聊信息
	 * @author: XiaHui
	 * @param head
	 * @param userId
	 * @param groupId
	 * @param content
	 * @createDate: 2018-04-28 11:22:11
	 * @update: XiaHui
	 * @updateDate: 2018-04-28 11:22:11
	 */
	@MethodMapping(value = "1.1.2001")
	public void groupChat(Head head,
			@Define("userId") String userId,
			@Define("groupId") String groupId,
			@Define("content") Content content) {
		groupChatService.groupChat(head.getKey(), userId, groupId, content);
	}
	
	
	/**
	 * 获取群聊记录
	 * @author: XiaHui
	 * @param socketSession
	 * @param groupId
	 * @param chatQuery
	 * @param pageData
	 * @return
	 * @createDate: 2018-04-28 11:22:22
	 * @update: XiaHui
	 * @updateDate: 2018-04-28 11:22:22
	 */
	@MethodMapping(value = "1.1.2004")
	public Object queryGroupChatLog(
			SocketSession socketSession,
			@Define("groupId") String groupId,
			@Define("chatQuery") ChatQuery chatQuery,
			@Define("page") PageData pageData) {
		//String userId = socketSession.getKey();
		DefaultPage page = new DefaultPage();
		page.setPageSize(pageData.getPageSize());
		page.setPageNumber(pageData.getPageNumber());
		ResultMessage  message = groupChatLogService.queryGroupChatContentList(groupId, chatQuery, page);
		return message;
	}
}
