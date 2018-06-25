package com.only.common.spring.web.resolver;

import java.lang.reflect.Type;

import org.springframework.core.MethodParameter;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.onlyxiahui.common.util.OnlyClassUtil;
import com.onlyxiahui.common.util.OnlyPropertyUtil;
import com.onlyxiahui.general.annotation.parameter.Define;
import com.onlyxiahui.general.annotation.parameter.RequestParameter;
import com.onlyxiahui.general.data.Body;
import com.onlyxiahui.general.data.DataNode;

public class DataResolver implements HandlerMethodArgumentResolver {

    Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create();  ;
	String key = "request-json-data-object";

	@Override
	public boolean supportsParameter(MethodParameter parameter) {
		return parameter.getMethodAnnotation(RequestParameter.class) != null && parameter.getParameterAnnotation(Define.class) != null;
	}

	@Override
	public Object resolveArgument(MethodParameter parameter, ModelAndViewContainer mavContainer, NativeWebRequest request, WebDataBinderFactory binderFactory) throws Exception {

		Type t = parameter.getGenericParameterType();
		Class<?> clazz = parameter.getParameterType();

		JsonObject dataObject = (JsonObject) request.getAttribute(key, 0);
		if (null == dataObject) {
			String value = request.getParameter("data");
			if (null != value && !"".equals(value)) {
				dataObject = new JsonParser().parse(value).getAsJsonObject();
				request.setAttribute(key, dataObject, 0);
			}
		}

		Object object = null;
		Define pd = parameter.getParameterAnnotation(Define.class);

		if (pd != null && null != dataObject) {
			String name = pd.value();//获取属性定义的名称
			
			if (DataNode.class == clazz || DataNode.class.isAssignableFrom(clazz)) {
				if(null==name||"".equals(name)){//如果名称为空取类名
					name = clazz.getSimpleName();
					if(name.length()>1){
						name =name.substring(0, 1).toLowerCase() + name.substring(1);
					}else{
						name =name.toLowerCase();
					}
				}
				object = getParameterValue(name, dataObject, t);
			} else if (Body.class.isAssignableFrom(clazz)) {
				object = getParameterValue("body", dataObject, t);
			} else if (JsonElement.class.isAssignableFrom(clazz)) {
				object = dataObject.get("body");
			} else if (JsonObject.class.isAssignableFrom(clazz)) {
				JsonElement je = dataObject.get("body");
				object = null == je ? null : je.getAsJsonObject();
			} else {
				if (dataObject.has("body")) {
					JsonObject bodyObject = dataObject.get("body").getAsJsonObject();
					if (null == name || "".equals(name)) {
						name = parameter.getParameterName();
					}
					object = getParameterValue(name, bodyObject, t);
				}
			}
		}
		if (null == object&&OnlyClassUtil.isCanInstance(clazz)) {
			object = clazz.newInstance();
		}
		if (null == object) {
			object =OnlyPropertyUtil.getDefaultValue(clazz);
		}
		//(null == object) ? new Object() :
		return  object;
	}

	private Object getParameterValue(String name, JsonObject bodyObject, Type type) {
		Object o = null;
		if (null != bodyObject) {
			JsonElement je = bodyObject.get(name);
			if (null != je) {
				o = gson.fromJson(je, type);
			}
		}
		return o;
	}
}
