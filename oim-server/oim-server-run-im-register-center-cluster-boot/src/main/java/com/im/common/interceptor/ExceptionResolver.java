package com.im.common.interceptor;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import com.only.common.result.ResultMessage;
import com.onlyxiahui.common.lib.util.OnlyJsonUtil;

/**
 * 类描述：异常捕获
 * 
 */
@Component
public class ExceptionResolver implements HandlerExceptionResolver {

	protected final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Override
	public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
		StackTraceElement[] array = ex.getStackTrace();
		StringBuilder exception = new StringBuilder();
		if (null != array) {
			for (StackTraceElement stackTraceElement : array) {
				exception.append(stackTraceElement);
				exception.append("\n");
			}
		}
		logger.error(ex.getMessage(), ex);

		ResultMessage result = new ResultMessage();
		result.addError("000", "系统异常！");
		PrintWriter writer = null;
		try {
			writer = response.getWriter();
			writer.println(OnlyJsonUtil.objectToJson(result));
			writer.flush();
		} catch (Exception e) {
			logger.error("", e);
		} finally {
			if (null != writer) {
				writer.close();
			}
		}
		return null;
	}
}
