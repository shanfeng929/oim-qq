package com.im.server.general.common.dao;

import org.springframework.stereotype.Repository;

import com.im.base.dao.BaseDAO;
import com.im.server.general.common.bean.UserAddRequest;

/**
 * 
 * @author: XiaHui
 * @date 2018-04-25 09:04:49
 */
@Repository
public class UserAddRequestDAO extends BaseDAO {

	public UserAddRequest get(String id) {
		return this.readDAO.get(UserAddRequest.class, id);
	}

	/**
	 * 根据id删除
	 * 
	 * @param id
	 */
	public void delete(String id) {
		this.deleteById(UserAddRequest.class, id);
	}
}
