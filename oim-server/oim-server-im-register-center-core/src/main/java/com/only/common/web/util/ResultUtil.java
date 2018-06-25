package com.only.common.web.util;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * @author: XiaHui
 * @date: 2017年3月31日 上午11:07:04
 */
public class ResultUtil {
	static final Log logger = LogFactory.getLog(ResultUtil.class);

	public static void result(HttpServletResponse response, String result) {
		PrintWriter writer = null;
		try {
			response.setContentType("text/javascript");
			response.setCharacterEncoding("UTF-8");
			writer = response.getWriter();
			writer.println(result);
			writer.flush();
		} catch (Exception e) {
			logger.error("", e);
		} finally {
			if (null != writer) {
				writer.close();
			}
		}
	}
}
