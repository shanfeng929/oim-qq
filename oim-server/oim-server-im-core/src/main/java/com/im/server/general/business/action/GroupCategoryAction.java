package com.im.server.general.business.action;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.im.server.general.common.bean.GroupCategory;
import com.im.server.general.common.service.GroupCategoryService;
import com.onlyxiahui.common.message.result.ResultMessage;
import com.onlyxiahui.general.annotation.action.ActionMapping;
import com.onlyxiahui.general.annotation.action.MethodMapping;
import com.onlyxiahui.general.annotation.parameter.Define;
import com.onlyxiahui.net.session.SocketSession;

/**
 * 描述：
 * 
 * @author XiaHui
 * @date 2016年1月8日 下午8:12:59
 * @version 0.0.1
 */
@Component
@ActionMapping(value = "1.202")
public class GroupCategoryAction {

	@Resource
	private GroupCategoryService groupCategorySerivce;

	/**
	 * 新建群分组
	 * 
	 * @author: XiaHui
	 * @param socketSession
	 * @param groupCategory
	 * @return
	 * @createDate: 2018-04-24 22:44:46
	 * @update: XiaHui
	 * @updateDate: 2018-04-24 22:44:46
	 */
	@MethodMapping(value = "1.1.0001")
	public ResultMessage addGroupCategory(SocketSession socketSession, @Define("groupCategory") GroupCategory groupCategory) {
		if (null == groupCategory.getUserId() || "".equals(groupCategory.getUserId())) {
			groupCategory.setUserId(socketSession.getKey());
		}
		return groupCategorySerivce.addGroupCategory(groupCategory);
	}

	/**
	 * 获取群分组信息
	 * 
	 * @author: XiaHui
	 * @param socketSession
	 * @param groupCategoryId
	 * @return
	 * @createDate: 2018-04-24 22:44:57
	 * @update: XiaHui
	 * @updateDate: 2018-04-24 22:44:57
	 */
	@MethodMapping(value = "1.1.0002")
	public ResultMessage getGroupCategory(SocketSession socketSession, @Define("groupCategoryId") String groupCategoryId) {
		ResultMessage message = new ResultMessage();
		try {
			GroupCategory groupCategory = groupCategorySerivce.getById(groupCategoryId);
			message.put("groupCategory", groupCategory);
		} catch (Exception e) {
			message.addWarning("0001", "");
		}
		return message;
	}

	/**
	 * 修改分组名
	 * 
	 * @author: XiaHui
	 * @param socketSession
	 * @param userId
	 * @param id
	 * @param name
	 * @return
	 * @createDate: 2018-04-24 22:45:23
	 * @update: XiaHui
	 * @updateDate: 2018-04-24 22:45:23
	 */
	@MethodMapping(value = "1.1.0003")
	public ResultMessage updateGroupCategoryName(
			SocketSession socketSession,
			@Define("userId") String userId,
			@Define("groupCategoryId") String id,
			@Define("groupCategoryName") String name) {
		return groupCategorySerivce.updateGroupCategoryName(id, name);
	}
}
