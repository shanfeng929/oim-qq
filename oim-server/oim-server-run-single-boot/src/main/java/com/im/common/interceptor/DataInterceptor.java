package com.im.common.interceptor;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.lang.reflect.Method;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.onlyxiahui.common.lib.util.OnlyJsonUtil;
import com.onlyxiahui.common.message.result.ResultMessage;
import com.onlyxiahui.general.annotation.parameter.RequestParameter;
import com.onlyxiahui.json.validator.ValidatorResult;
import com.onlyxiahui.json.validator.ValidatorService;

/**
 * 类描述：数据校验拦截
 */
@Component
public class DataInterceptor extends HandlerInterceptorAdapter {
	private Logger logger = Logger.getLogger(this.getClass());
	ValidatorService vs = new ValidatorService("classpath*:/validator/*.json");

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		String path = request.getServletPath();

		if (logger.isDebugEnabled()) {
			// logger.debug(this.getClass().getName() + ":" + path);
		}
		// System.out.println(path);

		boolean isVerify = isVerify(handler, request);
		if (!isVerify) {

			ResultMessage rm = new ResultMessage();
			rm.addError("0", "数据格式不合法！");
			PrintWriter writer = null;
			try {
				writer = response.getWriter();
				writer.println(OnlyJsonUtil.objectToJson(rm));
				writer.flush();
			} catch (Exception e) {
				logger.error("", e);
			} finally {
				if (null != writer) {
					writer.close();
				}
			}
		} else {
			String data = null;
			String contentType = request.getHeader("Content-Type");
			// application/json;charset=UTF-8
			if (null != contentType && contentType.contains("json")) {
				data = getRequestBody(request);
			} else {
				data = request.getParameter("data");
			}
			if (null != data && !"".equals(data) && handler instanceof HandlerMethod) {
				JsonObject jo = new JsonParser().parse(data).getAsJsonObject();

				boolean hasBody = jo.has("body");

				if (hasBody) {
					// JsonElement headElement = jo.get("head");
					JsonObject bodyObject = jo.get("body").getAsJsonObject();
					List<ValidatorResult> list = vs.validate(bodyObject, path);
					if (!list.isEmpty()) {
						ResultMessage rm = new ResultMessage();
						for (ValidatorResult vr : list) {
							rm.addError(vr.getErrorCode(), vr.getPropertyPath() + vr.getMessage());
						}
						PrintWriter writer = null;
						try {
							writer = response.getWriter();
							writer.println(OnlyJsonUtil.objectToJson(rm));
							writer.flush();
						} catch (Exception e) {
							logger.error("", e);
						} finally {
							if (null != writer) {
								writer.close();
							}
						}
						isVerify = false;
					}
				}
			}
		}
		return isVerify;
	}

	/**
	 * 判断请求来源同步还是异步. 异步请求返回true； 同步请求返回false
	 *
	 * @param request
	 * @return
	 */
	public boolean isSysnc(HttpServletRequest request) {
		String requestType = request.getHeader("X-Requested-With");
		boolean isAjax = (null != requestType && "XMLHttpRequest".equals(requestType));
		return isAjax;
	}

	private boolean isVerify(Object handler, HttpServletRequest request) {
		boolean isVerify = true;
		String data = null;
		String contentType = request.getHeader("Content-Type");
		// application/json;charset=UTF-8
		if (null != contentType && contentType.contains("json")) {
			data = getRequestBody(request);
		} else {
			data = request.getParameter("data");
		}
		// String data = request.getParameter("data");
		if (null != data && !"".equals(data) && handler instanceof HandlerMethod) {
			HandlerMethod hm = (HandlerMethod) handler;
			Method method = hm.getMethod();
			RequestParameter mm = method.getAnnotation(RequestParameter.class);
			if (null != mm) {
				isVerify = OnlyJsonUtil.mayBeJSON(data);
			}
		}
		return isVerify;
	}

	private String getRequestBody(HttpServletRequest request) {
		String body = null;
		if (null != request) {
			InputStream in = null;
			try {
				in = request.getInputStream();
				body = IOUtils.toString(in);
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				if (null != in) {
					try {
						in.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		}
		return body;
	}
}
