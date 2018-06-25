package com.only.common.web.util;


import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
/**
 * @author: XiaHui
 * @date: 2017年1月11日 上午9:56:50
 */

public class CookieUtil {
	/**
	 * 将request cookie封装到Map里面
	 * @return
	 */
	public static Map<String, Cookie> getCookieMap(HttpServletRequest request){
		Map<String,Cookie> cookieMap = new HashMap<String,Cookie>();
		Cookie[] cookies = request.getCookies();
		if(null!=cookies){
	        for(Cookie cookie : cookies){
	            cookieMap.put(cookie.getName(), cookie);
	        }
	    }
	    return cookieMap;
	}
	
	/**
	 * 根据名字获取cookie的值
	 * @param name
	 * @return
	 */
	public static String getCookie(HttpServletRequest request, String name){
		Map<String, Cookie> cookieMap = getCookieMap(request);
	    if(cookieMap.containsKey(name)){
	        Cookie cookie = (Cookie)cookieMap.get(name);
	        try{
	        	return URLDecoder.decode(cookie.getValue(), "UTF-8");
	        }
	        catch(Exception e){
	        	throw new RuntimeException(e);
	        }
	    }else{
	        return null;
	    }   
	}

	/**
	 * 设置cookie
	 * @param name  cookie名字
	 * @param value cookie值
	 * @param maxAge cookie生命周期 ,以秒为单位,如果为0则表示这个cookie随着浏览器的关闭即消失
	 * maxAge 可以为正数，表示此cookie从创建到过期所能存在的时间，以秒为单位，此cookie会存储到客户端电脑，以cookie文件形式保存，不论关闭浏览器或关闭电脑，直到时间到才会过期。
	 * 可以为负数，表示此cookie只是存储在浏览器内存里，只要关闭浏览器，此cookie就会消失。maxAge默认值为-1
	 * 还可以为0，表示从客户端电脑或浏览器内存中删除此cookie
	 */
	public static void setCookie(HttpServletResponse res, String name, String value, String domain, int maxAge){
		if(value!=null){
			try{
				value = URLEncoder.encode(value, "UTF-8");
			}
			catch(Exception e){
			}
		}
	    Cookie cookie = new Cookie(name,value);
	    cookie.setPath("/");
	    if(StringUtils.isNotBlank(domain)){
	    	cookie.setDomain(domain);
	    }
	    cookie.setMaxAge(maxAge);
	    res.addCookie(cookie);
	}
	
	/**
	 * 删除cookie
	 * @param name
	 */
	public static void deleteCookie(HttpServletResponse response, String name){
		setCookie(response, name, "", null, 0);
	}
	
	/**
	 * 删除所有cookie
	 */
	public static void cleanCookie(HttpServletRequest request, HttpServletResponse response){
		Cookie[] cookies = request.getCookies();
		if(null!=cookies){
	        for(Cookie cookie : cookies){
	        	deleteCookie(response, cookie.getName());
	        }
	    }
	}
}

