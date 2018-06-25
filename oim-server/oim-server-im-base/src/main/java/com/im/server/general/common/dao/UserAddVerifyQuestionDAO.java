package com.im.server.general.common.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.im.base.dao.BaseDAO;
import com.im.server.general.common.bean.UserAddVerifyQuestion;
import com.onlyxiahui.query.hibernate.QueryWrapper;

/**
 * 
 * @author: XiaHui
 * @date 2018-04-22 18:40:54
 */
@Repository
public class UserAddVerifyQuestionDAO extends BaseDAO {

	public UserAddVerifyQuestion get(String id) {
		return this.readDAO.get(UserAddVerifyQuestion.class, id);
	}

	/**
	 * 根据id删除
	 * 
	 * @param id
	 */
	public void delete(String id) {
		this.deleteById(UserAddVerifyQuestion.class, id);
	}

	/**
	 * 获取用户设置的被添加为联系人是验证问题列表
	 * 
	 * @author: XiaHui
	 * @param userId
	 * @return
	 * @createDate: 2018-04-22 19:47:09
	 * @update: XiaHui
	 * @updateDate: 2018-04-22 19:47:09
	 */
	public List<UserAddVerifyQuestion> getListByUserId(String userId) {

		QueryWrapper queryWrapper = new QueryWrapper();
		queryWrapper.put("userId", userId);

		String sql = "select * from im_user_add_verify_question where userId=:userId";
		List<UserAddVerifyQuestion> list = this.queryList(sql, queryWrapper, UserAddVerifyQuestion.class, null);
		return list;
	}

	/**
	 * 获取用户设置的被添加为联系人是验证问题列表
	 * 
	 * @author: XiaHui
	 * @param userId
	 * @return
	 * @createDate: 2018-04-22 19:47:09
	 * @update: XiaHui
	 * @updateDate: 2018-04-22 19:47:09
	 */
	public <T> List<T> getListByUserId(String userId, Class<T> clazz) {

		QueryWrapper queryWrapper = new QueryWrapper();
		queryWrapper.put("userId", userId);

		String sql = "select * from im_user_add_verify_question where userId=:userId";
		List<T> list = this.queryList(sql, queryWrapper, clazz, null);
		return list;
	}

	/**
	 * 根据用户id删除问题
	 * 
	 * @author: XiaHui
	 * @param userId
	 * @return
	 * @createDate: 2018-04-22 18:48:36
	 * @update: XiaHui
	 * @updateDate: 2018-04-22 18:48:36
	 */
	public boolean deleteByUserId(String userId) {
		StringBuilder sql = new StringBuilder();
		sql.append(" delete from im_user_add_verify_question where userId=:userId ");
		QueryWrapper queryWrapper = new QueryWrapper();
		queryWrapper.put("userId", userId);
		int i = this.executeSQL(sql.toString(), queryWrapper);
		return i > 0;
	}

}
