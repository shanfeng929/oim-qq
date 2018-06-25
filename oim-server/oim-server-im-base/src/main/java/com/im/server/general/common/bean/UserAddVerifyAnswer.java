package com.im.server.general.common.bean;

import java.util.Date;

import javax.persistence.Entity;

import com.im.base.bean.BaseBean;

/**
 * 
 * 用户被添加的时验证问题回答
 * 
 * @author: XiaHui
 * @date: 2018-04-22 10:12:27
 */
@Entity(name = "im_user_add_verify_answer")
public class UserAddVerifyAnswer extends BaseBean {

	private String requestId;// 请求消息的id(对应UserAddRequest中的id)
	private String requestUserId;
	private String addUserId;// 被添加的用户
	private String questionId;// 问题id(对应UserAddVerifyQuestion中的id)
	private String question;// 问题
	private String answer;// 答案
	private Date createDateTime;// 建立时间

	public String getRequestId() {
		return requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getRequestUserId() {
		return requestUserId;
	}

	public void setRequestUserId(String requestUserId) {
		this.requestUserId = requestUserId;
	}

	public String getAddUserId() {
		return addUserId;
	}

	public void setAddUserId(String addUserId) {
		this.addUserId = addUserId;
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
