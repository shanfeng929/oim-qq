package com.only.common.resolver.gson;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Parameter;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.only.common.resolver.BeanBox;
import com.onlyxiahui.common.util.OnlyClassUtil;
import com.onlyxiahui.common.util.OnlyPropertyUtil;
import com.onlyxiahui.general.annotation.parameter.Define;
import com.onlyxiahui.general.data.Body;

/**
 * @author: XiaHui
 * @date: 2016年9月28日 上午10:44:17
 */
public class DefineValuesResolver {

	private final Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create();

	public Object[] resolver(JsonObject jsonObject, Parameter[] parameters, BeanBox beanBox) {
		Object[] data = null;
		if (null != parameters) {
			int length = parameters.length;
			data = new Object[length];
			for (int i = 0; i < length; i++) {
				Object value = null;
				Parameter p = parameters[i];
				Type type = p.getParameterizedType();
				Define pd = p.getAnnotation(Define.class);
				if (null != pd) {
					String name = pd.value();
					value = getParameterValue(name, jsonObject, type);
				} else if (type instanceof ParameterizedType) {

				} else if (type instanceof GenericArrayType) {

				} else if (type instanceof Class) {
					Class<?> genericClass = (Class<?>) type;

					if (Body.class.isAssignableFrom(genericClass)) {
						value = gson.fromJson(jsonObject, type);
					} else if (JsonElement.class.isAssignableFrom(genericClass)) {

					} else if (JsonObject.class.isAssignableFrom(genericClass)) {
						value = jsonObject;
					} else if (OnlyPropertyUtil.isString(genericClass)) {

					} else if (OnlyPropertyUtil.isPrimitive(genericClass)) {

					} else {
						value = beanBox.getBean(genericClass);
					}
					if (null == value) {
						if (OnlyClassUtil.isCanInstance(genericClass)) {
							try {
								value = genericClass.newInstance();
							} catch (InstantiationException e) {
								e.printStackTrace();
							} catch (IllegalAccessException e) {
								e.printStackTrace();
							}
						}
					}
					if (null == value) {
						value =OnlyPropertyUtil.getDefaultValue(genericClass);
					}
				}
				data[i] = value;
			}
		}
		return data;
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
