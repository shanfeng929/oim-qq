package com.only.common.web.request;

import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.only.common.result.Info;
import com.onlyxiahui.common.lib.util.HttpClient3Util;
import com.onlyxiahui.common.lib.util.OnlyJsonUtil;


/**
 * @author: XiaHui
 * @date: 2017年1月13日 上午11:57:18
 */
public class RequestClient {	
	
	private static final Gson gson = new Gson();
	
	public static ResponseMessage post(String url, Map<String, Object> body) {
		RequestMessage rm = new RequestMessage();
		rm.setBody(body);
		return post(url, rm);
	}

	public static ResponseMessage post(String url, RequestMessage requestMessage) {			
		String data = OnlyJsonUtil.objectToJson(requestMessage);
		Map<String, String> dataMap = new HashMap<String, String>();
		dataMap.put("data", data);
		ResponseMessage rm = new ResponseMessage();
		try {
			String json = HttpClient3Util.post(url, dataMap);
			if (null != json && !"".equals(json)) {
				try {
					JsonObject jo = new JsonParser().parse(json).getAsJsonObject();
					JsonElement infoElement = jo.get("info");
					JsonObject bodyObject = jo.get("body").getAsJsonObject();
					Info info = gson.fromJson(infoElement, Info.class);
					rm.setInfo(info);
					rm.setBody(bodyObject);
				} catch (Exception e) {
					rm.addError("0", "解析接口返回数据错误！");
				}
			} else {
				rm.addWarning("0", "服务器网络连接异常！");
			}
		} catch (Exception e) {			
			rm.addError("0", "连接接口网络异常！");
		}
		return rm;
	}
}
