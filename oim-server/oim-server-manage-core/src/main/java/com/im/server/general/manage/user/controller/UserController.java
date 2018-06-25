package com.im.server.general.manage.user.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.im.server.general.manage.common.bean.User;
import com.im.server.general.manage.common.data.PageInfo;
import com.im.server.general.manage.common.data.UserQuery;
import com.im.server.general.manage.user.service.UserService;
import com.onlyxiahui.common.message.result.ResultMessage;
import com.onlyxiahui.general.annotation.parameter.Define;
import com.onlyxiahui.general.annotation.parameter.RequestParameter;
import com.onlyxiahui.im.message.data.PageData;

/**
 * date 2018-06-04 14:59:44<br>
 * description
 * 
 * @author XiaHui<br>
 * @since
 */
@RestController
@RequestMapping("/manage")
public class UserController {

	@Autowired
	UserService userService;

	@CrossOrigin
	@ResponseBody
	@RequestParameter
	@RequestMapping(method = RequestMethod.POST, value = "/user/list")
	public Object get(HttpServletRequest request,
			@Define("userQuery") UserQuery userQuery,
			@Define("page") PageData page) {
		ResultMessage rm = new ResultMessage();
		try {

			PageInfo defaultPage = new PageInfo();
			defaultPage.setPageNumber(page.getPageNumber());
			defaultPage.setPageSize(page.getPageSize());

			List<User> list = userService.queryList(userQuery, defaultPage);

			rm.put("list", list);
			rm.put("page", defaultPage);

		} catch (Exception e) {
			e.printStackTrace();
			rm.addError("500", "系统异常");
		}
		return rm;
	}
}
