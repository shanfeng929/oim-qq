package com.im.register.center.business.sevice;

import com.im.register.center.business.sender.RegisterSender;
import com.im.register.center.module.NetModule;
import com.im.register.center.net.Back;
import com.im.server.general.ServerInfo;
import com.onlyxiahui.common.message.Info;
import com.onlyxiahui.net.action.ConnectBackAction;
import com.onlyxiahui.net.connect.ConnectData;
import com.onlyxiahui.net.data.action.DataBackActionAdapter;

import javax.annotation.Resource;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

/**
 * @author Only
 * @date 2016年5月20日 上午11:45:04
 */
@Service
public class RegisterService {

	protected final Logger logger = LogManager.getLogger(this.getClass());

	@Resource
	NetModule netModule;
	@Resource
	RegisterSender registerSender;
	@Resource
	ServerInfo serverInfo;

	boolean register = false;

	public void startRegister(ConnectData connectData) {
		ConnectBackAction cba = new ConnectBackAction() {

			@Override
			public void connectBack(boolean success) {
				auth();
			}
		};

		if (netModule.getConnectThread().isConnected()) {
			auth();
		} else {
			// 因为负责连接服务器的和负责发送消息的线程不同，在执行登录之前是没有连接的，所以在这里先添加个连接后回掉的action
			// 当连接成功后再把登陆消息发出去，不然先把消息发了，再连接就没有执行登陆操作了
			netModule.getConnectThread().addConnectBackAction(cba);
			netModule.getConnectThread().setConnectData(connectData);
			netModule.getConnectThread().setAutoConnect(true);
		}
	}

	public void auth() {
		final DataBackActionAdapter action = new DataBackActionAdapter() {// 这是消息发送后回掉
			@Override
			public void lost() {
				register = true;
			}

			@Override
			public void timeOut() {
				register = true;
			}

			@Back
			public void back(Info info) {
				register = true;
			}
		};
		String serverId = serverInfo.getId();
		registerSender.auth(serverId, action);
	}

	public void reauth() {
		if (register) {
			String serverId = serverInfo.getId();
			registerSender.auth(serverId, null);
		}
	}
}
