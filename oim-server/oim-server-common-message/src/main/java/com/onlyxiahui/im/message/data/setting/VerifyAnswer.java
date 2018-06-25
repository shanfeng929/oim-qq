package com.onlyxiahui.im.message.data.setting;

/**
 * 
 * 用户被添加的时验证问题回答
 * 
 * @author: XiaHui
 * @date: 2018-04-22 10:12:27
 */
public class VerifyAnswer {

	private String questionId;// 问题id(对应UserAddVerifyQuestion中的id)
	private String question;//
	private String answer;// 答案

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

}
