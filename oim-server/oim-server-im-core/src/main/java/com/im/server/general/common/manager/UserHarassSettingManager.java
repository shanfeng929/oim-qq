package com.im.server.general.common.manager;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.im.server.general.common.bean.UserHarassSetting;
import com.im.server.general.common.dao.UserHarassSettingDAO;

/**
 * 
 * @author: XiaHui
 * @date 2018-04-22 19:09:30
 */
@Service
public class UserHarassSettingManager {

	@Resource
	private UserHarassSettingDAO userHarassSettingDAO;

	
	public UserHarassSetting getUserHarassSetting(String userId){
		UserHarassSetting uhs=userHarassSettingDAO.getByUserId(userId);
		if(null==uhs){
			uhs=new UserHarassSetting();
			uhs.setVerifyType(UserHarassSetting.verify_type_auth);
		}
		return uhs;
	}
}
