package com.only.common.result;

/**
 * @author Only
 * @date 2016年5月19日 下午4:12:15
 */
public class ResultBodyMessage {

	private Info info = new Info();
	private Object body;

	public Object getBody() {
		return body;
	}

	public void setBody(Object body) {
		this.body = body;
	}

	public void setInfo(Info info) {
		this.info = info;
	}

	public Info getInfo() {
		return info;
	}

	public void setSuccess(boolean success) {
		info.setSuccess(success);
	}

	public void addError(String code, String text) {
		info.addError(code, text);
	}

	public void addWarning(String code, String text) {
		info.addWarning(code, text);
	}
}
