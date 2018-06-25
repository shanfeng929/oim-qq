package com.im.server.general.manage.handler;

import java.io.BufferedReader;
import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author: XiaHui
 * @date: 2016年9月28日 上午11:24:56
 */
@Controller
@RequestMapping("/manage")
public class Portal {

	@Resource
	WebHandler webHandler;

	@ResponseBody
	@RequestMapping(value = { "{path:\\w+}/api" })
	public Object api(@PathVariable("path") String path, HttpServletRequest request, HttpServletResponse response) {
		String data = request.getParameter("data");
		if (null == data) {
			// request.getContentType()
			StringBuilder sb = new StringBuilder();
			try {
				BufferedReader br = request.getReader();
				String temp;
				while ((temp = br.readLine()) != null) {
					sb.append(temp);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			data = sb.toString();
		}
		return webHandler.onMessage(data, request, response);
	}
}
