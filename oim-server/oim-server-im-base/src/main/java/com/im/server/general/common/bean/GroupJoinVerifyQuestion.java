package com.im.server.general.common.bean;

import java.util.Date;

import javax.persistence.Entity;

import com.im.base.bean.BaseBean;

/**
 * 
 * 加入群时验证问题
 * 
 * @author: XiaHui
 * @date: 2018-04-22 10:12:27
 */
@Entity(name = "im_group_join_verify_question")
public class GroupJoinVerifyQuestion extends BaseBean {

	private String groupId;// 群
	private String question;
	private Date createDateTime;// 建立时间

	public String getGroupId() {
		return groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
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

}
