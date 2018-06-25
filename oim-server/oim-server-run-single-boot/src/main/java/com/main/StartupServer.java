package com.main;

import com.onlyxiahui.common.util.OnlyAddressUtil;
import com.onlyxiahui.common.util.OnlyStringUtil;
import org.springframework.boot.SpringApplication;

import com.im.base.common.box.ConfigBox;
//import com.im.server.general.remote.socket.netty.tcp.RemoteSocketServer;
import com.im.socket.Server;
import com.im.socket.netty.tcp.SocketServer;
import com.im.socket.netty.web.WebSocketServer;
import com.onlyxiahui.common.util.OnlyPropertiesUtil;
import com.startup.boot.BootApplication;

/**
 * 服务器启动入口
 *
 * @author XiaHui
 * @date 2017-11-25 14:08:50
 */
public final class StartupServer {

	public static void main(String[] args) {
		initConfig();
		SpringApplication.run(BootApplication.class, args);
	}

	public static void initConfig() {

		System.setProperty("log4j.configurationFile", "config/log4j2.xml");
		// System.setProperty("log4j.configuration",
		// "file:config/log4j.properties");

		String addressKey = "server.address";
		String address = OnlyPropertiesUtil.getProperty("config/setting/path.properties", addressKey);

		address = (OnlyStringUtil.isBlank(address)) ? OnlyAddressUtil.getLocalHostIP() : address;

		String category = "";
		String key = "";
		String value = "";

		/**
		 * -----------------------------------------------------------------------------------------------------
		 **/
		/**
		 * 这里是读取系统配置文件，用于加载系统启动时需要的端口等配置。
		 */

		/** 服务器启动的端口 **/
		String serverPort = OnlyPropertiesUtil.getProperty("config/setting/config.properties", "server.port");

		/** 聊天服务启动TCP端口 **/
		key = "server.config.im.tcp.port";
		String tcpPortValue = OnlyPropertiesUtil.getProperty("config/setting/config.properties", key);

		/** 聊天服务WebSocket端口 **/
		key = "server.config.im.websocket.port";
		String websocketPortValue = OnlyPropertiesUtil.getProperty("config/setting/config.properties", key);

		/** 聊天服务WebSocket路径 **/
		key = "server.config.im.websocket.path";
		String websocketPath = OnlyPropertiesUtil.getProperty("config/setting/config.properties", key);

		// key = "server.config.remote.tcp.port";
		// String remoteTcpPortValue =
		// OnlyPropertiesUtil.getProperty("config/setting/config.properties",
		// key);

		/**
		 * 文件服务相关配置,这些配置是用来启动项目的时候需要的配置
		 */
		/*************** config start ***********************/
		category = "server.config.file";

		key = "server.config.file.upload.path";
		value = OnlyPropertiesUtil.getProperty("config/setting/config.properties", key);
		ConfigBox.put(category, key, value);

		key = "server.config.file.request.path";
		value = OnlyPropertiesUtil.getProperty("config/setting/config.properties", key);

		String fileHttp = ("443".equals(serverPort)) ? "https://" : "http://";
		String filePort = ("80".equals(serverPort) || "443".equals(serverPort)) ? "" : (":" + serverPort);
		value = (null == value || value.isEmpty()) ? (fileHttp + address + filePort) : value;

		ConfigBox.put(category, key, value);
		/*************** config end ***********************/

		/**
		 * -----------------------------------------------------------------------------------------------------
		 **/

		/**
		 * 这里的配置是用来通知客户端，相关服务的地址在哪。需要参考config.properties配置文件相应配置
		 */
		/*************** path start ***********************/
		String http = ("443".equals(serverPort)) ? "https://" : "http://";
		String p = ("80".equals(serverPort) || "443".equals(serverPort)) ? "" : (":" + serverPort);

		// #聊天服务的tcp地址(就是可以访问本访问的地址)
		// im.server.tcp.address=192.168.200.1
		// im.server.tcp.port=12010

		category = "server.path.im";
		// 聊天服务地址
		key = "im.server.tcp.address";
		// value =
		// OnlyPropertiesUtil.getProperty("config/setting/path.properties",
		// key);
		value = address;
		ConfigBox.put(category, key, value);

		// 聊天服务端口
		key = "im.server.tcp.port";
		value = OnlyPropertiesUtil.getProperty("config/setting/path.properties", key);
		if (OnlyStringUtil.isBlank(value)) {
			value = tcpPortValue;
		}
		ConfigBox.put(category, key, value);

		// #聊天服务的webSocket路径
		// im.server.websocket.path=ws://192.168.200.1:12020/oim/websocket
		// websocket地址
		key = "im.server.websocket.path";
		value = OnlyPropertiesUtil.getProperty("config/setting/path.properties", key);
		if (OnlyStringUtil.isBlank(value)) {
			String protocol = "443".equals(websocketPortValue) ? "wss://" : "ws://";
			String wp = ("80".equals(websocketPortValue) || "443".equals(websocketPortValue)) ? "" : (":" + websocketPortValue);
			value = protocol + address + wp + websocketPath;
		}
		ConfigBox.put(category, key, value);

		// #聊天服务的http地址
		// im.server.http.url=http://192.168.200.1:12000
		// 聊天服务http地址
		key = "im.server.http.url";
		value = OnlyPropertiesUtil.getProperty("config/setting/path.properties", key);
		if (OnlyStringUtil.isBlank(value)) {
			value = http + address + p;
		}
		ConfigBox.put(category, key, value);

		/**
		 * 文件服务地址
		 */
		// #文件服务地址
		// file.server.http.url=http://192.168.200.1:12000
		category = "server.path.file";
		key = "file.server.http.url";
		value = OnlyPropertiesUtil.getProperty("config/setting/path.properties", key);
		if (OnlyStringUtil.isBlank(value)) {
			value = http + address + p;
		}
		ConfigBox.put(category, key, value);

		/**
		 * 远程服务
		 */
		// category = "server.path.remote";
		// 远程服务地址
		// key = "remote.server.tcp.address";
		// value =
		// OnlyPropertiesUtil.getProperty("config/setting/path.properties",
		// key);
		// ConfigBox.put(category, key, value);
		// 远程服务端口
		// key = "remote.server.tcp.port";
		// value =
		// OnlyPropertiesUtil.getProperty("config/setting/path.properties",
		// key);
		// ConfigBox.put(category, key, value);

		/*************** path end ***********************/

		/**
		 * -----------------------------------------------------------------------------------------------------
		 **/

		//
		// #聊天服务的udp地址(就是可以访问本访问的地址)暂时用不上
		// im.server.udp.address=192.168.200.1
		// im.server.udp.port=8310

		// #远程协助服务地址
		// remote.server.tcp.address=192.168.200.1
		// remote.server.tcp.port=13010

		int tcpPort = Integer.parseInt(tcpPortValue);
		int websocketPort = Integer.parseInt(websocketPortValue);
		// int remoteTcpPort = Integer.parseInt(remoteTcpPortValue);

		SocketServer socketServer = new SocketServer();
		WebSocketServer webSocketServer = new WebSocketServer(websocketPath);
		// RemoteSocketServer remoteSocketServer = new RemoteSocketServer();

		socketServer.setPort(tcpPort);
		webSocketServer.setPort(websocketPort);
		// remoteSocketServer.setPort(remoteTcpPort);

		new StartThread(socketServer).start();
		new StartThread(webSocketServer).start();
		// new StartThread(remoteSocketServer).start();
	}

	static class StartThread extends Thread {

		private Server server;

		public StartThread(Server server) {
			this.server = server;
		}

		public void run() {
			server.start();
		}
	}
}
