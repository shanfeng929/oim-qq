package com.im.server.general.manage.index.service;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import com.im.server.general.manage.auth.AuthManager;
import com.im.server.general.manage.common.bean.User;
import com.im.server.general.manage.common.dao.UserDAO;
import com.onlyxiahui.common.message.result.ResultMessage;

/**
 * date 2018-06-13 10:27:23<br>
 * description
 * 
 * @author XiaHui<br>
 * @since
 */
@Service
public class IndexService {

	@Resource
	UserDAO userDAO;
	@Resource
	AuthManager authManager;

	public ResultMessage login(String account, String password) {
		ResultMessage rm = new ResultMessage();
		try {
			if (StringUtils.isNotBlank(account) && StringUtils.isNotBlank(password)) {
				User user = userDAO.getUserByAccount(account);
				if (null != user && 1 == user.getAccountType()) {
					if (password.equals(user.getPassword())) {
						String userId = user.getId();
						String token = authManager.putToken(userId);
						rm.put("user", user);
						rm.put("token", token);
					} else {
						rm.addWarning("003", "密码错误！");
					}
				} else {
					rm.addWarning("002", "账号不存在！");
				}
			} else {
				rm.addWarning("001", "请输入账号和秘密！");
			}
		} catch (Exception e) {
			e.printStackTrace();
			rm.addError("500", "系统异常");
		}
		return rm;
	}
}
