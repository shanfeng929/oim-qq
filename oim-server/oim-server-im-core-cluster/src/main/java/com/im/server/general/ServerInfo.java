package com.im.server.general;

/**
 * @author: XiaHui
 * @date: 2018-03-01 10:58:32
 */
public class ServerInfo {

	private String id;

	public ServerInfo() {
		//String id = OnlyUUIDUtil.getUUID();
//		String key=OnlyAddressUtil.getMacAddress();
//		this.setId(key);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}
