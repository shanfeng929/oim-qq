package com.main;

import org.springframework.boot.SpringApplication;

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
 *
 */
public final class StartupServer {

	public static void main(String[] args) {
		initConfig();
		SpringApplication.run(BootApplication.class, args);
	}

	public static void initConfig() {

		System.setProperty("log4j.configurationFile", "config/log4j2.xml");
		//System.setProperty("log4j.configuration", "file:config/log4j.properties");

		String key = "";
		
		/*************** config end ***********************/

		/**
		 * 这里的配置是用来通知客户端，相关服务的地址在哪。需要参考config.properties配置文件相应配置
		 */

		/////////////////////////////////////////////////////
		// 获取服务启动配置
		key = "server.config.im.tcp.port";
		String tcpPortValue = OnlyPropertiesUtil.getProperty("config/setting/config.properties", key);

		key = "server.config.im.websocket.port";
		String websocketPortValue = OnlyPropertiesUtil.getProperty("config/setting/config.properties", key);

		key = "server.config.im.websocket.path";
		String websocketPath = OnlyPropertiesUtil.getProperty("config/setting/config.properties", key);

		int tcpPort = Integer.parseInt(tcpPortValue);
		int websocketPort = Integer.parseInt(websocketPortValue);

		SocketServer socketServer = new SocketServer();
		WebSocketServer webSocketServer = new WebSocketServer(websocketPath);

		socketServer.setPort(tcpPort);
		webSocketServer.setPort(websocketPort);

		new StartThread(socketServer).start();
		new StartThread(webSocketServer).start();
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
