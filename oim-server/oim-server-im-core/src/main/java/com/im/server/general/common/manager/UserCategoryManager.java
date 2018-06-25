package com.im.server.general.common.manager;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.im.server.general.common.bean.UserCategory;
import com.im.server.general.common.dao.UserCategoryDAO;

/**
 * 
 * @author: XiaHui
 *
 */
@Service
public class UserCategoryManager {

	@Resource
	UserCategoryDAO userCategoryDAO;

	/**
	 * 获取默认的联系人分组，没有则创建一个
	 * 
	 * @author: XiaHui
	 * @param userId
	 * @return
	 * @createDate: 2018-04-23 10:03:35
	 * @update: XiaHui
	 * @updateDate: 2018-04-23 10:03:35
	 */
	public UserCategory getOrCreateDefault(String userId) {
		UserCategory bean = userCategoryDAO.getDefaultUserCategory(userId);
		if (null == bean) {
			bean = new UserCategory();
			bean.setUserId(userId);
			bean.setName("我的好友");
			bean.setRank(0);
			bean.setSort(UserCategory.sort_default);
		}
		userCategoryDAO.save(bean);
		return bean;
	}

	/**
	 * 获取默认分组id
	 * @author: XiaHui
	 * @param userId
	 * @return
	 * @createDate: 2018-04-23 14:07:20
	 * @update: XiaHui
	 * @updateDate: 2018-04-23 14:07:20
	 */
	public String getOrCreateDefaultCategoryId(String userId) {
		UserCategory bean = getOrCreateDefault(userId);
		return null != bean ? bean.getId() : "";
	}
}
