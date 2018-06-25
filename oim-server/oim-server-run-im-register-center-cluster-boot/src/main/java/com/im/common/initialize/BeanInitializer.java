package com.im.common.initialize;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

/**
 * 
 * 容器启动后要初始化执行的操作
 * 
 */
@Component
public class BeanInitializer implements InitializingBean {

	protected final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Override
	public void afterPropertiesSet() throws Exception {
		if (logger.isInfoEnabled()) {
		}
	}
}
