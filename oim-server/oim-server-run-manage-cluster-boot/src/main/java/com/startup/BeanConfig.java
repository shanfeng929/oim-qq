package com.startup;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;

import com.onlyxiahui.spring.context.util.SpringUtil;

/**
 * @Author: XiaHui
 * @Date: 2015年12月17日
 * @ModifyUser: XiaHui
 * @ModifyDate: 2015年12月17日
 */
@Configuration
// @PropertySource({ "classpath:config/config.properties" })
// @ImportResource("classpath:spring/task-beans.xml")
@PropertySource({ "file:config/setting/config.properties" })
@ImportResource("file:config/spring/task-beans.xml")
public class BeanConfig {

	@Bean
	public SpringUtil springUtil() {
		SpringUtil bean = new SpringUtil();
		return bean;
	}
}
