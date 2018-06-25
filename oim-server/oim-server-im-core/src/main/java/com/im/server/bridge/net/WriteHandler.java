package com.im.server.bridge.net;

import java.util.List;

/**
 * @author: XiaHui
 * @date: 2018-03-01 13:01:39
 */
public interface WriteHandler {

	public void push(Object data);

	public void push(String key, Object data);

	public void push(List<String> keyList, Object data);

	public void pushWithout(String key, Object data);

	public void pushWithout(List<String> keyList, Object data);
}
