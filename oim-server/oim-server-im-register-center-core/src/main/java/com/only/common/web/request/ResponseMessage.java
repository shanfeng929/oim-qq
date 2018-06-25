package com.only.common.web.request;

import java.lang.reflect.Type;

import com.alibaba.fastjson.JSONObject;
import com.google.gson.JsonObject;
import com.only.common.result.Info;
import com.onlyxiahui.common.lib.util.OnlyJsonUtil;

/**
 * @author Only
 * @date 2016年5月19日 下午4:12:15
 */
public class ResponseMessage {

	private Info info = new Info();
	private JsonObject body;
	private JSONObject json;

	public JsonObject getBody() {
		return body;
	}
	
	public JSONObject getJsonBody() {
		return json;
	}

	public void setBody(JsonObject body) {
		this.body = body;
		this.json=JSONObject.parseObject((null!=body?body.toString():"{}"));
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

	public Object getParameterValue(String name, Type type) {
		return OnlyJsonUtil.getParameterValue(name, body, type);
	}

	public <T> T getParameterValue(String name, Class<T> type) {
		return OnlyJsonUtil.getParameterValue(name, body, type);
	}
	
	public <T> T getBodyValue(Class<T> type) {
		return OnlyJsonUtil.getValue(body, type);
	}
}
