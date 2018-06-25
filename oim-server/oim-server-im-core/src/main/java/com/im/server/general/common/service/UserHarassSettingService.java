package com.im.server.general.common.service;

import java.util.List;

import javax.annotation.Resource;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.im.server.general.common.bean.UserHead;
import com.im.server.general.common.dao.UserHeadDAO;

/**
 * 
 * @author: XiaHui
 * @date 2018-04-22 18:56:43
 */
@Service
@Transactional
public class UserHarassSettingService {
	protected final Logger logger = LogManager.getLogger(this.getClass());

	@Resource
	private UserHeadDAO userHeadDAO;

	public UserHead getUserHeadByUserId(String userId) {
		return userHeadDAO.getLastByUserId(userId);
	}

	public List<UserHead> getUserCategoryMemberUserHeadListByUserId(String userId) {
		return userHeadDAO.getUserCategoryMemberUserHeadListByUserId(userId);
	}

	public List<UserHead> getUserHeadListByUserIds(List<String> ids) {
		return userHeadDAO.getUserHeadListByUserIds(ids);
	}
}
