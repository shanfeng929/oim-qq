package com.onlyxiahui.im.message.client;

import java.util.HashMap;
import java.util.Map;

import com.onlyxiahui.common.message.AbstractMessage;
import com.onlyxiahui.common.message.Head;

/**
 * @author: XiaHui
 * @date: 2016年8月22日 下午5:03:51
 */
public class Message extends AbstractMessage<Object> {

	private static final long serialVersionUID = 1L;
	
	private Head head;
	private Map<String, Object> body = new HashMap<String, Object>();

	public static final String code_fail = "0";
	public static final String code_success = "1";

	public Message() {
	}

	@Override
	public Head getHead() {
		return head;
	}

	@Override
	public void setHead(Head head) {
		this.head = head;
	}

	public Map<String, Object> getBody() {
		return body;
	}

	public void setBody(Map<String, Object> body) {
		this.body = body;
	}

	public Object put(String key, Object value) {
		return body.put(key, value);
	}

	public Object get(String key) {
		return body.get(key);
	}
}
