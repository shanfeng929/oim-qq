package com.startup;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

import com.onlyxiahui.query.hibernate.QueryContext;
import com.onlyxiahui.query.hibernate.QueryItemException;
import com.onlyxiahui.spring.context.util.SpringUtil;



/*
 * date 2015年12月17日<br>
 * description
 * @author XiaHui
 */
@Configuration
// @PropertySource({ "classpath:config/config.properties" })
@ImportResource("classpath:config/spring/task-beans.xml")
//@ImportResource("file:config/spring/task-beans.xml")
public class BeanConfig {
	@Bean
	public QueryContext queryContext() {
		QueryContext bean = new QueryContext();
		bean.setConfigLocation("classpath:dao/*/query/mysql/*.xml");
		// bean.setConfigLocation("file:config/query/*.xml");
		try {
			bean.load();
		} catch (QueryItemException e) {
			e.printStackTrace();
		}
		return bean;
	}

	@Bean
	public SpringUtil springUtil() {
		SpringUtil bean = new SpringUtil();
		return bean;
	}
}
