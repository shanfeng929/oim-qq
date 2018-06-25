package com.main;

import org.springframework.boot.SpringApplication;

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
	}
}
