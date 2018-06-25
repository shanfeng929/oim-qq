package com.im.server.general.manage.common.dao;

import java.util.UUID;

import javax.annotation.Resource;

import com.onlyxiahui.query.mybatis.dao.GenericDAO;

/**
 * 
 * @author: XiaHui
 *
 */
public class BaseDAO {

	//@org.springframework.beans.factory.annotation.Autowired(required = false)
	@Resource(name = "writeGenericDAO")
	protected GenericDAO writeDAO;

	//@org.springframework.beans.factory.annotation.Autowired(required = false)
	@Resource(name = "readGenericDAO")
	protected GenericDAO readDAO;

	public String getId() {
		return UUID.randomUUID().toString().replace("-", "");
	}
}
