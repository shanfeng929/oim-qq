package com.im.server.general.common.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.im.base.dao.BaseDAO;
import com.im.server.general.common.bean.UserHarassSetting;
import com.onlyxiahui.query.hibernate.QueryWrapper;

/**
 * 
 * @author: XiaHui
 * @date 2018-04-22 18:40:54
 */
@Repository
public class UserHarassSettingDAO extends BaseDAO {

	public UserHarassSetting get(String id) {
		return this.readDAO.get(UserHarassSetting.class, id);
	}

	/**
	 * 根据id删除
	 * 
	 * @param id
	 */
	public void delete(String id) {
		this.deleteById(UserHarassSetting.class, id);
	}

	/**
	 * 根据用户id获取防骚扰设置
	 * 
	 * @author: XiaHui
	 * @param userId
	 * @return
	 * @createDate: 2018-04-22 18:48:01
	 * @update: XiaHui
	 * @updateDate: 2018-04-22 18:48:01
	 */
	public UserHarassSetting getByUserId(String userId) {
		UserHarassSetting bean = null;

		QueryWrapper queryWrapper = new QueryWrapper();
		queryWrapper.put("userId", userId);

		String sql = "select * from im_user_harass_setting where userId=:userId";
		List<UserHarassSetting> list = this.queryList(sql, queryWrapper, UserHarassSetting.class, null);

		if (null != list && !list.isEmpty()) {
			bean = list.get(0);
		}
		return bean;
	}

	/**
	 * 根据用户id获取防骚扰设置
	 * 
	 * @author: XiaHui
	 * @param userId
	 * @return
	 * @createDate: 2018-04-22 18:48:01
	 * @update: XiaHui
	 * @updateDate: 2018-04-22 18:48:01
	 */
	public <T> T getByUserId(String userId, Class<T> clazz) {
		T bean = null;

		QueryWrapper queryWrapper = new QueryWrapper();
		queryWrapper.put("userId", userId);

		String sql = "select * from im_user_harass_setting where userId=:userId";
		List<T> list = this.queryList(sql, queryWrapper, clazz, null);

		if (null != list && !list.isEmpty()) {
			bean = list.get(0);
		}
		return bean;
	}

	/**
	 * 根据用户id删除防骚扰设置
	 * 
	 * @author: XiaHui
	 * @param userId
	 * @return
	 * @createDate: 2018-04-22 18:48:36
	 * @update: XiaHui
	 * @updateDate: 2018-04-22 18:48:36
	 */
	public boolean deleteByUserId(String userId) {
		StringBuilder sql = new StringBuilder();
		sql.append(" select * from im_user_harass_setting where userId=:userId ");
		QueryWrapper queryWrapper = new QueryWrapper();
		queryWrapper.put("userId", userId);
		int i = this.executeSQL(sql.toString(), queryWrapper);
		return i > 0;
	}

}
