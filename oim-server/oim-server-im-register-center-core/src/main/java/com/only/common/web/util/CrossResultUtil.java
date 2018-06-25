package com.only.common.web.util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.onlyxiahui.common.lib.util.OnlyJsonUtil;

/**
 * @author: XiaHui
 * @date: 2017年4月25日 上午11:35:58
 */
public class CrossResultUtil {
	/**
	 * 跨域请求返回json结果
	 * 
	 * @author: XiaHui
	 * @param request
	 * @param response
	 * @param data
	 * @createDate: 2017年4月25日 上午11:38:57
	 * @update: XiaHui
	 * @updateDate: 2017年4月25日 上午11:38:57
	 */
	public static void result(HttpServletRequest request, HttpServletResponse response, Object data) {
		String json = OnlyJsonUtil.objectToJson(data);
		String result = "";
		String cb = request.getParameter("callback");
		if (null != cb && !"".equals(cb)) {
			result = cb + "(" + json + ")";
		} else {
			result = json;
		}
		ResultUtil.result(response, result);
	}
}
