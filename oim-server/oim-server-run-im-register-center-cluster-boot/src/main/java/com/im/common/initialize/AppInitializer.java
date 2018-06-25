package com.im.common.initialize;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.im.socket.Server;
import com.im.socket.netty.tcp.SocketServer;
import com.onlyxiahui.common.util.OnlyPropertiesUtil;

/**
 *
 * 容器启动后要初始化执行的操作
 *
 */
@Component
public class AppInitializer implements ApplicationListener<ContextRefreshedEvent> {

	protected final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Override
	public void onApplicationEvent(ContextRefreshedEvent e) {
		if (e.getApplicationContext().getParent() == null) {
			if (logger.isInfoEnabled()) {
				logger.info(this.getClass() + "：系统初始化。");
			}
			initServer();
		}
	}
	
	private void initServer(){
		String key="server.im.register.center.tcp.port";
		String tcpPortValue = OnlyPropertiesUtil.getProperty("config/setting/config.properties", key);

		int tcpPort = Integer.parseInt(tcpPortValue);

		SocketServer socketServer = new SocketServer();
		socketServer.setPort(tcpPort);
		new StartThread(socketServer).start();
	}
	
	class StartThread extends Thread {

		private Server server;

		public StartThread(Server server) {
			this.server = server;
		}

		public void run() {
			server.start();
		}
	}
}
