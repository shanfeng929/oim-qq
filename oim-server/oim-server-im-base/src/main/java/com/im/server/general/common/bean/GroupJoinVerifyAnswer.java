package com.im.server.general.common.bean;

import java.util.Date;

import javax.persistence.Entity;

import com.im.base.bean.BaseBean;

/**
 * 
 * 用户加入群时回答验证问题
 * 
 * @author: XiaHui
 * @date: 2018-04-22 10:12:27
 */
@Entity(name = "im_group_join_verify_answer")
public class GroupJoinVerifyAnswer extends BaseBean {

	private String requestId;// 请求消息的id(对应GroupJoinRequest中的id)
	private String userId;// 申请的用户
	private String groupId;// 加入的群
	private String questionId;// 问题id(对应GroupJoinVerifyQuestion中的id)
	private String question;// 问题
	private String answer;// 答案
	private Date createDateTime;// 建立时间

	public String getRequestId() {
		return requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getGroupId() {
		return groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public String getQuestionId() {
		return questionId;
	}

	public void setQuestionId(String questionId) {
		this.questionId = questionId;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public Date getCreateDateTime() {
		return createDateTime;
	}

	public void setCreateDateTime(Date createDateTime) {
		this.createDateTime = createDateTime;
	}

}
