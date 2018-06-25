package com.onlyxiahui.im.message.client;

import com.onlyxiahui.common.message.Head;

public class ClientHead extends Head {

	private String clientVersion;
	private String clientType;
	
	/**
	 * clientPlatform:客户端平台<br>
	 * windows
	 * mac
	 * linux
	 * ios
	 * andro
	 */
	private String clientPlatform;
	
	public String getClientVersion() {
		return clientVersion;
	}

	public void setClientVersion(String clientVersion) {
		this.clientVersion = clientVersion;
	}

	public String getClientType() {
		return clientType;
	}

	public void setClientType(String clientType) {
		this.clientType = clientType;
	}
}
