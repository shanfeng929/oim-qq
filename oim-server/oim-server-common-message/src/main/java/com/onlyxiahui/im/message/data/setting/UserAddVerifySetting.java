package com.onlyxiahui.im.message.data.setting;

/**
 * @author: XiaHui
 * @date: 2018-04-22 18:59:45
 */
public class UserAddVerifySetting {

	private String userId;
	/**
	 * 1：允许任何人添加 <br>
	 * 2：需要验证 <br>
	 * 3：需要回答正确的问题 <br>
	 * 4：需要回答问题并由我确认 <br>
	 */
	private String verifyType;
	private String question;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
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

}
