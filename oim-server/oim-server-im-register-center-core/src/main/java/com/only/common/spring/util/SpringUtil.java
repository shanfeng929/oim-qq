package com.only.common.spring.util;

import javax.annotation.Resource;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

/**
 * @author Only
 * @date 2016年5月19日 上午11:56:33
 */
public class SpringUtil {

	private static ApplicationContext applicationContext = null;

	@Resource
	public void setApplicationContext(ApplicationContext applicationContext) {
		SpringUtil.applicationContext = applicationContext;
	}

	@SuppressWarnings("unchecked")
	public static <T> T getBean(String name) {
		Object o = null;
		if (null != applicationContext) {
			o = applicationContext.getBean(name);
		}
		return (T) o;
	}

	@SuppressWarnings("unchecked")
	public static <T> T getBean(Class<T> type) {
		Object o = null;
		if (null != applicationContext) {
			o = applicationContext.getBean(type);
		}
		return (T) o;
	}

	public static String[] getBeanNamesForType(Class<?> type) {
		String[] as = null;
		if (null != applicationContext) {
			as = applicationContext.getBeanNamesForType(type);
		}
		return as;
	}

	/**
	 * 取HttpRequest
	 * 
	 * @return request
	 */
	public static HttpServletRequest getRequest() {
		HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
		return request;
	}

	/**
	 * 取HttpServletResponse
	 * 
	 * @return HttpServletResponse
	 */
	public static HttpServletResponse getResponse() {
		HttpServletResponse response = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getResponse();
		return response;
	}

	/**
	 * 取ServletContext
	 * 
	 * @return
	 */
	public static ServletContext getServletContext() {
		return ContextLoader.getCurrentWebApplicationContext().getServletContext();
	}
}
