package com.only.common.result;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Only
 * @date 2016年5月19日 下午4:12:15
 */
public class ResultMessage {

	private Info info = new Info();
	private Map<String, Object> body = new HashMap<String, Object>();

	public static final String code_fail = "0";
	public static final String code_success = "1";

	public ResultMessage() {
	}

	public ResultMessage(Map<String, Object> body) {
		this.body = body;
	}

	public ResultMessage(Object obj) {
		body.put("data", obj);
	}

	public Map<String, Object> getBody() {
		return body;
	}

	public void setBody(Map<String, Object> body) {
		this.body = body;
	}

	public void setInfo(Info info) {
		this.info = info;
	}

	public Info getInfo() {
		return info;
	}

	public void put(String key, Object value) {
		body.put(key, value);
	}

	public Object get(String key) {
		return body.get(key);
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
