package com.im.server.general.common.bean;

import java.util.Date;

import javax.persistence.Entity;

import com.im.base.bean.BaseBean;

/**
 * @author XiaHui
 * @date 2017-11-24 10:40:40
 */
@Entity(name = "im_group_join_request")
public class GroupJoinRequest extends BaseBean {

	private String userId;// 加入群的请求用户
	private String groupId;
	private String joinVerifyType;// 当时设定的验证方式
	private Date createDateTime;// 建立时间
	private String question;// 问题(当验证方式为回答问题时)
	private String answer;// 答案(当验证方式为回答问题时)
	private String handleType;// 处理结果：0:未处理 1:同意 2:拒绝 3:忽略
	private Date handleDateTime;// 处理时间
	private String message;// 附加消息

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

	public String getJoinVerifyType() {
		return joinVerifyType;
	}

	public void setJoinVerifyType(String joinVerifyType) {
		this.joinVerifyType = joinVerifyType;
	}

	public Date getCreateDateTime() {
		return createDateTime;
	}

	public void setCreateDateTime(Date createDateTime) {
		this.createDateTime = createDateTime;
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

	public String getHandleType() {
		return handleType;
	}

	public void setHandleType(String handleType) {
		this.handleType = handleType;
	}

	public Date getHandleDateTime() {
		return handleDateTime;
	}

	public void setHandleDateTime(Date handleDateTime) {
		this.handleDateTime = handleDateTime;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
