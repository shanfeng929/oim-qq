package com.im.server.general.common.bean;

import javax.persistence.Entity;

import com.im.base.bean.BaseBean;

/**
 * 被加好友防止骚扰的设置
 * 
 * @author XiaHui
 * @date 2017-11-24 10:18:13
 */
@Entity(name = "im_user_harass_setting")
public class UserHarassSetting extends BaseBean {

	private String userId;
	/**
	 * 1：允许任何人添加 <br>
	 * 2：需要验证 <br>
	 * 3：需要回答正确的问题 <br>
	 * 4：需要回答问题并由我确认 <br>
	 */
	private String verifyType;
	private String question;
	private String answer;
	/**1：允许任何人添加**/
	public static final String verify_type_any = "1";
	/**2：需要验证**/
	public static final String verify_type_auth = "2";
	/**3：需要回答正确的问题**/
	public static final String verify_type_answer = "3";
	/**4：需要回答问题并由我确认**/
	public static final String verify_type_confirm = "4";

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

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}
}
