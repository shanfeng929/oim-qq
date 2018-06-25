package com.im.common.initialize;

import javax.annotation.Resource;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.im.register.center.business.sevice.RegisterService;
import com.im.server.general.business.thread.SocketThread;
import com.onlyxiahui.common.util.OnlyPropertiesUtil;
import com.onlyxiahui.net.connect.ConnectData;

/**
 *
 * 容器启动后要初始化执行的操作
 *
 */
@Component
public class AppInitializer implements ApplicationListener<ContextRefreshedEvent> {

	protected final Logger logger = LogManager.getLogger(this.getClass());

	@Resource
	private SocketThread socketThread;
	@Resource
	private RegisterService registerService;

	@Override
	public void onApplicationEvent(ContextRefreshedEvent e) {
		if (e.getApplicationContext().getParent() == null) {
			if (logger.isInfoEnabled()) {
				logger.info(this.getClass() + "：系统初始化。");
			}
			socketThread.start();

			String key = "server.im.register.center.tcp.address";
			String address = OnlyPropertiesUtil.getProperty("config/setting/path.properties", key);

			key = "server.im.register.center.tcp.port";
			String portValue = OnlyPropertiesUtil.getProperty("config/setting/path.properties", key);
			int port = Integer.parseInt(portValue);

			ConnectData connectData = new ConnectData();

			connectData.setAddress(address);
			connectData.setPort(port);

			registerService.startRegister(connectData);
		}
	}
}
