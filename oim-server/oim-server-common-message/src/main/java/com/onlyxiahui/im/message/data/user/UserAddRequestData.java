package com.onlyxiahui.im.message.data.user;

/**
 * @author: XiaHui
 * @date: 2018-04-23 10:35:40
 */
public class UserAddRequestData {

	private String requestUserId;// 添加联系人的请求用户
	private String addUserId;// 被添加的用户
	private String question;//
	private String answer;// 答案(当验证方式为回答问题时)
	private String message;// 附加消息
	private String userCategoryId;// 分组id
	private String remark;// 备注名

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

	public String getUserCategoryId() {
		return userCategoryId;
	}

	public void setUserCategoryId(String userCategoryId) {
		this.userCategoryId = userCategoryId;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}
