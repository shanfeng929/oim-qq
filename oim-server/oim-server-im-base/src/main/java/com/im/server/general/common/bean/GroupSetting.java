package com.im.server.general.common.bean;

import javax.persistence.Entity;

import com.im.base.bean.BaseBean;

/**
 * @author XiaHui
 * @date 2017-11-24 10:44:00
 */
@Entity(name = "im_group_setting")
public class GroupSetting extends BaseBean {

	private String groupId;
	
	/**
	 * 加群方式<br>
	 * 1.允许任何人加入<br>
	 * 2.需要验证消息<br>
	 * 3.需要回答正确问题<br>
	 * 4.需要回答问题并由管理员审核<br>
	 * 5.不允许任何人加入<br>
	 */
	private String joinType;
	private String inviteType;

	public String getGroupId() {
		return groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public String getJoinType() {
		return joinType;
	}

	public void setJoinType(String joinType) {
		this.joinType = joinType;
	}

	public String getInviteType() {
		return inviteType;
	}

	public void setInviteType(String inviteType) {
		this.inviteType = inviteType;
	}

}
