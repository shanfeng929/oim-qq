package com.im.server.general.manage.index.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.im.server.general.manage.index.service.IndexService;
import com.onlyxiahui.common.message.result.ResultMessage;
import com.onlyxiahui.common.util.OnlyMD5Util;
import com.onlyxiahui.general.annotation.parameter.Define;
import com.onlyxiahui.general.annotation.parameter.RequestParameter;

/**
 * date 2018-06-04 14:59:44<br>
 * description
 * 
 * @author XiaHui<br>
 * @since
 */
@RestController
@RequestMapping("/manage")
public class IndexController {

	@Resource
	IndexService indexService;

	@CrossOrigin
	@ResponseBody
	@RequestParameter
	@RequestMapping(method = RequestMethod.POST, value = "/index/login")
	public Object login(
			HttpServletRequest request,
			@Define("account") String account,
			@Define("password") String password) {
		password=OnlyMD5Util.md5L32(password);
		ResultMessage rm = indexService.login(account, password);
		return rm;
	}
}
