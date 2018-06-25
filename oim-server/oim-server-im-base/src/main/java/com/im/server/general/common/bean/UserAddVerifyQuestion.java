package com.im.server.general.common.bean;

import java.util.Date;

import javax.persistence.Entity;

import com.im.base.bean.BaseBean;

/**
 * 
 * 用户被添加的时验证问题
 * 
 * @author: XiaHui
 * @date: 2018-04-22 10:12:27
 */
@Entity(name = "im_user_add_verify_question")
public class UserAddVerifyQuestion extends BaseBean {

	private String userId;
	private String question;
	private Date createDateTime;// 建立时间
	private Date updateDateTime;// 更新时间

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public Date getCreateDateTime() {
		return createDateTime;
	}

	public void setCreateDateTime(Date createDateTime) {
		this.createDateTime = createDateTime;
	}

	public Date getUpdateDateTime() {
		return updateDateTime;
	}

	public void setUpdateDateTime(Date updateDateTime) {
		this.updateDateTime = updateDateTime;
	}

}
