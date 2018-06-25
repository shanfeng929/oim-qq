package com.only.common.spring.web;

import org.springframework.web.method.HandlerMethod;
import org.springframework.web.method.support.InvocableHandlerMethod;

/**
 * @author: XiaHui
 * @date: 2016年12月9日 下午5:41:31
 */
public class OnlyInvocableHandlerMethod extends InvocableHandlerMethod{

	public OnlyInvocableHandlerMethod(HandlerMethod handlerMethod) {
		super(handlerMethod);
	}

}
