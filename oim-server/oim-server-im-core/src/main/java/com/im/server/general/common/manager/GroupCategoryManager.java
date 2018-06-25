package com.im.server.general.common.manager;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.im.server.general.common.bean.GroupCategory;
import com.im.server.general.common.dao.GroupCategoryDAO;

/**
 * 
 * @author: XiaHui
 *
 */
@Service
public class GroupCategoryManager {

	@Resource
	GroupCategoryDAO groupCategoryDAO;

	/**
	 * 获取默认的群分组，没有则创建一个
	 * @author: XiaHui
	 * @param userId
	 * @return
	 * @createDate: 2018-04-23 10:03:35
	 * @update: XiaHui
	 * @updateDate: 2018-04-23 10:03:35
	 */
	public GroupCategory getOrCreateDefault(String userId) {
		GroupCategory bean = groupCategoryDAO.getDefaultGroupCategory(userId);
		if (null == bean) {
			bean = new GroupCategory();
			bean.setUserId(userId);
			bean.setName("我的聊天群");
			bean.setRank(0);
			bean.setSort(GroupCategory.sort_default);
		}
		groupCategoryDAO.save(bean);
		return bean;
	}
}
