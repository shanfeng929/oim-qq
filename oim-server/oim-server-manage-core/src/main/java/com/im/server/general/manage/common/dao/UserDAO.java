package com.im.server.general.manage.common.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.im.server.general.manage.common.bean.User;

/**
 * @author: XiaHui
 * @date: 2018-04-26 14:05:18
 */
@Repository
public class UserDAO extends BaseDAO {

	String namespace = User.class.getName();

	public User getUserByAccount(String account) {
		User user = this.readDAO.queryForObject(namespace + ".getUserByAccount", account, User.class);
		return user;
	}

	public <T> List<T> queryList(Map<String, Object> map, Class<T> clazz) {
		List<T> list = this.readDAO.queryForList(namespace + ".queryList", map, clazz);
		return list;
	}
}
