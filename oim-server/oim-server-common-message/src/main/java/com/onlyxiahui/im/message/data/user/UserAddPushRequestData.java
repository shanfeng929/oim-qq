package com.onlyxiahui.im.message.data.user;

/**
 * 向用户推送被添加信息
 * 
 * @author: XiaHui
 * @date: 2018-04-23 10:35:40
 */
public class UserAddPushRequestData {

	private String requestId;// 请求记录id
	private String requestUserId;// 添加联系人的请求用户
	private String addUserId;// 被添加的用户
	private String verifyType;// 当时设定的验证方式
	private String question;//
	private String answer;// 答案(当验证方式为回答问题时)
	private String message;// 附加消息

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

	public String getVerifyType() {
		return verifyType;
	}

	public void setVerifyType(String verifyType) {
		this.verifyType = verifyType;
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

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
