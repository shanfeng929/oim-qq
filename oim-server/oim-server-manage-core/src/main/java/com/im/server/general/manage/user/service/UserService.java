package com.im.server.general.manage.user.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.im.server.general.manage.common.bean.User;
import com.im.server.general.manage.common.dao.UserDAO;
import com.im.server.general.manage.common.data.PageInfo;
import com.im.server.general.manage.common.data.UserQuery;
import com.im.server.general.manage.common.util.QueryUtil;



/**
 * date 2018-06-04 17:20:12<br>
 * description
 * 
 * @author XiaHui<br>
 * @since
 */
@Service
public class UserService {

	@Resource
	UserDAO userDAO;

	public List<User> queryList(UserQuery userQuery) {
		return userDAO.queryList(QueryUtil.getQueryWrapper(userQuery), User.class);
	}

	public List<User> queryList(UserQuery userQuery, PageInfo page) {
		Page<Object> p = PageHelper.offsetPage(page.getStartResult(), page.getPageSize());
		Map<String,Object> map=QueryUtil.getQueryWrapper(userQuery);
		//Map<String,Object> map=new HashMap<String,Object>();
		List<User> list = userDAO.queryList(map, User.class);
		page.setTotalCount((int) p.getTotal());
		return list;
	}
}
