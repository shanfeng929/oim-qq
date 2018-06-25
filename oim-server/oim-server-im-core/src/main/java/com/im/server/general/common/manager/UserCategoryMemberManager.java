package com.im.server.general.common.manager;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.im.server.general.common.bean.UserCategoryMember;
import com.im.server.general.common.dao.UserCategoryMemberDAO;

/**
 * 
 * @author: XiaHui
 * @date 2018-04-23 13:52:21
 */
@Service
public class UserCategoryMemberManager {

	@Resource
	private UserCategoryMemberDAO userCategoryMemberDAO;

	/**
	 * 相互添加为联系人
	 * @author: XiaHui
	 * @param requestUserId
	 * @param requestCategoryId
	 * @param requestRemark
	 * @param addUserId
	 * @param addCategoryId
	 * @param addRemark
	 * @return
	 * @createDate: 2018-04-23 13:52:03
	 * @update: XiaHui
	 * @updateDate: 2018-04-23 13:52:03
	 */
	public boolean bothContact(
			String requestUserId,
			String requestCategoryId,
			String requestRemark,
			String addUserId,
			String addCategoryId,
			String addRemark) {

		boolean mark = true;

		UserCategoryMember request = new UserCategoryMember();
		request.setOwnUserId(requestUserId);
		request.setMemberUserId(addUserId);
		request.setUserCategoryId(requestCategoryId);
		request.setRemark(requestRemark);
		
		
		UserCategoryMember add = new UserCategoryMember();
		add.setOwnUserId(addUserId);
		add.setMemberUserId(requestUserId);
		add.setUserCategoryId(addCategoryId);
		add.setRemark(addRemark);
		
		userCategoryMemberDAO.save(request);
		userCategoryMemberDAO.save(add);
		return mark;

	}
}
