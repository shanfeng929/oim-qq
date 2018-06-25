package com.im.register.center.module;

import java.util.UUID;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.im.register.center.business.sevice.RegisterService;
import com.im.register.center.net.Handler;
import com.im.register.center.net.MessageReadHandler;
import com.im.register.center.net.connect.MessageHandler;
import com.im.register.center.net.connect.codec.SocketConnector;
import com.onlyxiahui.common.message.Message;
import com.onlyxiahui.net.NetServer;
import com.onlyxiahui.net.action.ConnectBackAction;
import com.onlyxiahui.net.action.ConnectStatusAction;
import com.onlyxiahui.net.connect.ConnectThread;
import com.onlyxiahui.net.data.action.DataBackAction;
import com.onlyxiahui.net.thread.DataReadThread;
import com.onlyxiahui.net.thread.DataWriteThread;

/**
 * 
 * @author XiaHui
 * @date 2018-04-30 13:23:52
 */
@Component
public class NetModule {

	protected final Logger logger = LoggerFactory.getLogger(this.getClass());

	private Handler handler;// 负责处理TCP接受到的消息
	private SocketConnector connector;// 连接实体
	private NetServer netServer;

	@Resource
	RegisterService registerService;

	public NetModule() {
		initApp();
		initAction();
		start();
	}

	/**
	 * 初始化各个模块
	 */
	private void initApp() {

		handler = new Handler();
		connector = new SocketConnector(handler);
		netServer = new NetServer(connector);

		netServer.getConnectThread().setReconnectIntervalTime(20 * 1000);
		netServer.getDataWriteThread().setSleepTime(1);
		netServer.getDataReadThread().setSleepTime(1);

		handler.addMessageHandler(new MessageHandler() {

			@Override
			public void setBackTime(long backTime) {
				netServer.getDataWriteThread().setBackTime(backTime);
			}

			@Override
			public void back(Object data) {
				netServer.getDataReadThread().back(data);
			}

			@Override
			public void addExceptionData(String key) {
				netServer.getDataReadThread().addExceptionData(key);
			}
		});

		MessageReadHandler messageReadHandler = new MessageReadHandler();
		netServer.getDataReadThread().addReadHandler(messageReadHandler);
	}

	/**
	 * 初始化各个模块的
	 */
	private void initAction() {

		netServer.addConnectBackAction(new ConnectBackAction() {

			@Override
			public void connectBack(boolean success) {
				if (logger.isDebugEnabled()) {
					String message = success ? "连接成功。" : "连接失败！";
					logger.debug(message);
				}
			}
		});
		/**
		 * * 为处理连接的线程添加连接状态变化的action，当连接断开了或者连接成功触发 **
		 */
		netServer.addConnectStatusAction(new ConnectStatusAction() {

			@Override
			public void connectStatusChange(boolean isConnected) {
				if (logger.isDebugEnabled()) {
					logger.debug("状态：" + isConnected);
				}
				if (isConnected) {
					registerService.reauth();
				}
			}
		});
	}

	/**
	 * 启动各个线程
	 */
	public void start() {
		netServer.start();
	}

	public ConnectThread getConnectThread() {
		return netServer.getConnectThread();
	}

	public DataReadThread getDataReadThread() {
		return netServer.getDataReadThread();
	}

	public DataWriteThread getDataWriteThread() {
		return netServer.getDataWriteThread();
	}

	/**
	 * 发送信息
	 *
	 * @param data
	 *            :信息
	 */
	public void write(Message data) {
		write(data, null);
	}

	/**
	 * 发送信息
	 *
	 * @param data
	 *            :信息
	 * @param dataBackAction
	 *            :回调Action
	 */
	public void write(Message data, DataBackAction dataBackAction) {
		if (data.getHead() != null) {
			if (data.getHead().getKey() == null) {
				data.getHead().setKey(getKey());
			}
			String key = data.getHead().getKey();
			netServer.write(key, data, dataBackAction);
		}
	}

	public String getKey() {
		return UUID.randomUUID().toString();
	}

	public void closeConnect() {
		netServer.closeConnect();
	}
}
