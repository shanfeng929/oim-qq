package com.onlyxiahui.im.message.data.user;

/**
 * 向用户推送被添加信息
 * 
 * @author: XiaHui
 * @date: 2018-04-23 10:35:40
 */
public class UserAddPushResponseData {

	private String requestId;// 请求记录id
	private String requestUserId;// 添加联系人的请求用户
	private String addUserId;// 被添加的用户
	private String handleType;// 处理结果：0:未处理 1:同意 2:拒绝 3:忽略
	private String message;// 附加消息

	public String getRequestId() {
		return requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getRequestUserId() {
		return requestUserId;
	}

	public void setRequestUserId(String requestUserId) {
		this.requestUserId = requestUserId;
	}

	public String getAddUserId() {
		return addUserId;
	}

	public void setAddUserId(String addUserId) {
		this.addUserId = addUserId;
	}

	public String getHandleType() {
		return handleType;
	}

	public void setHandleType(String handleType) {
		this.handleType = handleType;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
