package com.im.server.general.business.action;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.im.server.general.business.push.GroupPush;
import com.im.server.general.common.bean.Group;
import com.im.server.general.common.bean.GroupCategory;
import com.im.server.general.common.bean.GroupCategoryMember;
import com.im.server.general.common.bean.GroupHead;
import com.im.server.general.common.bean.GroupMember;
import com.im.server.general.common.service.GroupHeadService;
import com.im.server.general.common.service.GroupService;
import com.im.server.general.common.service.UserService;
import com.onlyxiahui.common.message.Head;
import com.onlyxiahui.common.message.Info;
import com.onlyxiahui.common.message.result.ResultMessage;
import com.onlyxiahui.general.annotation.action.ActionMapping;
import com.onlyxiahui.general.annotation.action.MethodMapping;
import com.onlyxiahui.general.annotation.parameter.Define;
import com.onlyxiahui.im.message.data.PageData;
import com.onlyxiahui.im.message.data.query.GroupQuery;
import com.onlyxiahui.im.message.data.user.UserData;
import com.onlyxiahui.net.session.SocketSession;
import com.onlyxiahui.query.page.DefaultPage;

/**
 * 描述：
 * 
 * @author XiaHui
 * @date 2014年6月14日 下午9:31:55
 * @version 0.0.1
 */
@Component
@ActionMapping(value = "1.201")
public class GroupAction {

	@Resource
	private GroupService groupService;
	@Resource
	private UserService userService;
	@Resource
	private GroupHeadService groupHeadService;
	@Resource
	GroupPush groupPush;

	/**
	 * 获取群分组列表（仅分组信息）
	 * @author: XiaHui
	 * @param socketSession
	 * @return
	 * @createDate: 2018-04-24 22:32:49
	 * @update: XiaHui
	 * @updateDate: 2018-04-24 22:32:49
	 */
	@MethodMapping(value = "1.1.0001")
	public ResultMessage getGrouCategoryList(SocketSession socketSession) {
		ResultMessage message = new ResultMessage();
		String userId = socketSession.getKey();
		List<GroupCategory> groupCategoryList = groupService.getGroupCategoryListByUserId(userId);
		message.put("groupCategoryList", groupCategoryList);
		return message;
	}

	/**
	 * 获取群列表
	 * @author: XiaHui
	 * @param socketSession
	 * @return
	 * @createDate: 2018-04-24 22:33:27
	 * @update: XiaHui
	 * @updateDate: 2018-04-24 22:33:27
	 */
	@MethodMapping(value = "1.1.0002")
	public ResultMessage getGroupCategoryMemberGroupList(SocketSession socketSession) {
		ResultMessage message = new ResultMessage();
		String userId = socketSession.getKey();
		List<Group> groupList = groupService.getGroupCategoryMemberGroupListByUserId(userId);
		message.put("groupList", groupList);
		return message;
	}

	/**
	 * 获取群分组成员（群和群分组关系）
	 * @author: XiaHui
	 * @param socketSession
	 * @return
	 * @createDate: 2018-04-24 22:33:40
	 * @update: XiaHui
	 * @updateDate: 2018-04-24 22:33:40
	 */
	@MethodMapping(value = "1.1.0003")
	public ResultMessage getGroupCategoryMemberList(SocketSession socketSession) {
		ResultMessage message = new ResultMessage();
		String userId = socketSession.getKey();
		List<GroupCategoryMember> groupCategoryMemberList = groupService.getGroupCategoryMemberListByUserId(userId);
		message.put("groupCategoryMemberList", groupCategoryMemberList);
		return message;
	}

	/**
	 * 获取群分组、群列表、群列表成员
	 * @author: XiaHui
	 * @param socketSession
	 * @return
	 * @createDate: 2018-04-24 22:34:06
	 * @update: XiaHui
	 * @updateDate: 2018-04-24 22:34:06
	 */
	@MethodMapping(value = "1.1.0004")
	public ResultMessage getGroupCategoryWithGroupList(SocketSession socketSession) {
		ResultMessage message = new ResultMessage();
		String userId = socketSession.getKey();
		List<GroupCategory> groupCategoryList = groupService.getGroupCategoryListByUserId(userId);
		List<GroupCategoryMember> groupCategoryMemberList = groupService.getGroupCategoryMemberListByUserId(userId);
		List<Group> groupList = groupService.getGroupCategoryMemberGroupListByUserId(userId);

		message.put("groupCategoryMemberList", groupCategoryMemberList);
		message.put("groupCategoryList", groupCategoryList);
		message.put("groupList", groupList);
		return message;
	}

	/**
	 * 获取群信息
	 * @author: XiaHui
	 * @param socketSession
	 * @param groupId
	 * @return
	 * @createDate: 2018-04-24 22:34:53
	 * @update: XiaHui
	 * @updateDate: 2018-04-24 22:34:53
	 */
	@MethodMapping(value = "1.1.0005")
	public ResultMessage getGroupById(SocketSession socketSession,
			@Define("groupId") String groupId) {
		ResultMessage message = new ResultMessage();
		Group group = groupService.getGroupById(groupId);
		GroupHead groupHead=groupHeadService.getGroupHeadByGroupId(groupId);
		message.put("group", group);
		message.put("groupHead", groupHead);
		return message;
	}

	/**
	 * 条件查询群
	 * @author: XiaHui
	 * @param groupQuery
	 * @param page
	 * @return
	 * @createDate: 2018-04-24 22:35:04
	 * @update: XiaHui
	 * @updateDate: 2018-04-24 22:35:04
	 */
	@MethodMapping(value = "1.1.0006")
	public ResultMessage queryGroupDataList(
			@Define("groupQuery") GroupQuery groupQuery,
			@Define("page") PageData page) {
		ResultMessage message = new ResultMessage();
		DefaultPage defaultPage = new DefaultPage();
		defaultPage.setPageNumber(page.getPageNumber());
		defaultPage.setPageSize(page.getPageSize());

		List<Group> groupList = groupService.queryGroupList(groupQuery, defaultPage);

		List<String> ids=new ArrayList<String>();
		
		for(Group d:groupList){
			ids.add(d.getId());
		}
		List<GroupHead> groupHeadList=groupHeadService.getGroupHeadListByGroupIds(ids);
		
		page.setTotalCount(defaultPage.getTotalCount());
		page.setTotalPage(defaultPage.getTotalPage());

		message.put("groupHeadList", groupHeadList);
		message.put("groupList", groupList);
		message.put("page", page);
		return message;
	}

	/**
	 * 新增群
	 * @author: XiaHui
	 * @param head
	 * @param socketSession
	 * @param group
	 * @param groupCategoryMember
	 * @return
	 * @createDate: 2018-04-24 22:35:16
	 * @update: XiaHui
	 * @updateDate: 2018-04-24 22:35:16
	 */
	@MethodMapping(value = "1.1.0008")
	public Object addGroup(Head head, SocketSession socketSession,
			@Define("group") Group group,
			@Define("groupCategoryMember") GroupCategoryMember groupCategoryMember) {
		String userId = socketSession.getKey();
		ResultMessage message  = groupService.add(head.getKey(), userId, group, groupCategoryMember);
		return message;
	}

	/**
	 * 修改群
	 * @author: XiaHui
	 * @param head
	 * @param socketSession
	 * @param group
	 * @return
	 * @createDate: 2018-04-24 22:35:24
	 * @update: XiaHui
	 * @updateDate: 2018-04-24 22:35:24
	 */
	@MethodMapping(value = "1.1.0009")
	public Object update(
			Head head,
			SocketSession socketSession,
			@Define("group") Group group) {
		Info info = groupService.update(group);
		List<GroupMember> list = groupService.getGroupMemberListByGroupId(group.getId());
		List<String> ids = new ArrayList<String>();
		for (GroupMember gm : list) {
			ids.add(gm.getUserId());
		}
		groupPush.pushUpdateGroup(head.getKey(), group, ids);
		ResultMessage message = new ResultMessage();
		message.setInfo(info);
		message.put("group", group);
		return message;
	}

	/**
	 * 获取群成员列表
	 * @author: XiaHui
	 * @param groupId
	 * @return
	 * @createDate: 2018-04-24 22:35:34
	 * @update: XiaHui
	 * @updateDate: 2018-04-24 22:35:34
	 */
	@MethodMapping(value = "1.1.0010")
	public ResultMessage getGroupMemberListWithUserDataList(@Define("groupId") String groupId) {
		List<GroupMember> groupMemberList = groupService.getGroupMemberListByGroupId(groupId);
		List<UserData> userDataList = userService.getGroupMemberUserDataListByGroupId(groupId);
		userService.setUserStatus(userDataList);

		ResultMessage message = new ResultMessage();
		message.put("groupMemberList", groupMemberList);
		message.put("userDataList", userDataList);
		return message;
	}

	/**
	 * 修改群头像
	 * @author: XiaHui
	 * @param groupHead
	 * @return
	 * @createDate: 2018-04-24 22:35:47
	 * @update: XiaHui
	 * @updateDate: 2018-04-24 22:35:47
	 */
	@MethodMapping(value = "1.1.0011")
	public Object uploadHead(@Define("groupHead") GroupHead groupHead) {
		return groupHeadService.uploadHead(groupHead);
	}

	
	@MethodMapping(value = "1.1.0012")
	public ResultMessage getGroupHead(@Define("groupId") String groupId) {
		GroupHead groupHead = groupHeadService.getGroupHeadByGroupId(groupId);
		ResultMessage message = new ResultMessage();
		message.put("groupHead", groupHead);
		return message;
	}

	/**
	 * 获取群头像列表
	 * @author: XiaHui
	 * @param userId
	 * @return
	 * @createDate: 2018-04-28 11:30:01
	 * @update: XiaHui
	 * @updateDate: 2018-04-28 11:30:01
	 */
	@MethodMapping(value = "1.1.0013")
	public ResultMessage getGroupHeadList(@Define("userId") String userId) {
		List<GroupHead> headList = groupHeadService.getGroupCategoryMemberGroupHeadListByUserId(userId);
		ResultMessage message = new ResultMessage();
		message.put("headList", headList);
		return message;
	}

	/**
	 * 获取群成员关系列表
	 * @author: XiaHui
	 * @param groupId
	 * @return
	 * @createDate: 2018-04-24 22:36:09
	 * @update: XiaHui
	 * @updateDate: 2018-04-24 22:36:09
	 */
	@MethodMapping(value = "1.1.0014")
	public ResultMessage getGroupMemberList(@Define("groupId") String groupId) {
		List<GroupMember> groupMemberList = groupService.getGroupMemberListByGroupId(groupId);
		ResultMessage message = new ResultMessage();
		message.put("groupMemberList", groupMemberList);
		return message;
	}

	/**
	 * 获取群成员详细列表
	 * @author: XiaHui
	 * @param groupId
	 * @return
	 * @createDate: 2018-04-24 22:36:34
	 * @update: XiaHui
	 * @updateDate: 2018-04-24 22:36:34
	 */
	@MethodMapping(value = "1.1.0015")
	public ResultMessage getGroupUserDataList(@Define("groupId") String groupId) {
		List<UserData> userDataList = userService.getGroupMemberUserDataListByGroupId(groupId);
		userService.setUserStatus(userDataList);
		ResultMessage message = new ResultMessage();
		message.put("userDataList", userDataList);
		return message;
	}

	/**
	 * 获取用户在各个群的权限
	 * 
	 * @author XiaHui
	 * @date 2017年6月8日 下午3:31:25
	 * @param socketSession
	 * @param userId
	 * @return
	 */
	@MethodMapping(value = "1.1.0016")
	public ResultMessage getUserInGroupMemberList(
			SocketSession socketSession,
			@Define("userId") String userId) {
		userId = socketSession.getKey();
		List<GroupMember> groupMemberList = groupService.getUserInGroupMemberList(userId);
		ResultMessage message = new ResultMessage();
		message.put("groupMemberList", groupMemberList);
		return message;
	}
}
