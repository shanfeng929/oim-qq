package com.im.register.center.net;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.onlyxiahui.common.action.ActionDispatch;
import com.onlyxiahui.common.data.resolver.BeanBox;
import com.onlyxiahui.common.data.resolver.gson.DefineValuesResolver;
import com.onlyxiahui.common.lib.util.OnlyJsonUtil;
import com.onlyxiahui.common.message.Head;
import com.onlyxiahui.common.message.Info;
import com.onlyxiahui.net.connect.ReadHandler;
import com.onlyxiahui.net.data.action.DataBackAction;
import com.onlyxiahui.net.data.bean.HandlerData;
import com.onlyxiahui.spring.context.util.SpringUtil;


public class MessageReadHandler implements ReadHandler {

	protected final Logger logger = LoggerFactory.getLogger(this.getClass());
	private final ActionDispatch cd = new ActionDispatch("com.im.register.center.business.action");
	private final Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create();
	private final JsonParser jsonParser = new JsonParser();
	private final DefineValuesResolver pvr = new DefineValuesResolver();

	@Override
	public void read(Object data, Map<String, HandlerData> handlerDataMap) {
		String text = (data instanceof String) ? (String) data : "";
		if (OnlyJsonUtil.mayBeJSON(text)) {
			JsonObject jo = jsonParser.parse(text).getAsJsonObject();

			JsonElement headElement = jo.get("head");
			JsonElement infoElement = jo.get("info");
			JsonObject bodyObject = jo.get("body").getAsJsonObject();

			Head head = gson.fromJson(headElement, Head.class);
			Info info = gson.fromJson(infoElement, Info.class);

			String key = head.getKey();
			String classCode = head.getAction();
			String methodCode = head.getMethod();

			HandlerData hd = handlerDataMap.remove(null == key ? "" : key);
			if (null != hd && null != hd.getDataBackAction()) {
				DataBackAction dataBackAction = hd.getDataBackAction();
				Method[] methods = dataBackAction.getClass().getMethods();
				if (null != methods && methods.length > 0) {
					for (Method method : methods) {
						Annotation[] as = method.getAnnotations();
						for (Annotation a : as) {
							if (a instanceof Back) {
								try {
									Parameter[] parameters = method.getParameters();
									BeanBox beanBox = getBeanBox();
									beanBox.register(Head.class, head);
									beanBox.register(Info.class, info);
									Object[] dataArray = pvr.resolver(bodyObject, parameters, beanBox);
									method.setAccessible(true);
									method.invoke(dataBackAction, dataArray);
								} catch (IllegalAccessException e) {
									e.printStackTrace();
								} catch (IllegalArgumentException e) {
									e.printStackTrace();
								} catch (InvocationTargetException e) {
									e.printStackTrace();
								}
								break;
							}
						}
					}
				}
			}

			if (StringUtils.isNotBlank(classCode) && StringUtils.isNotBlank(methodCode)) {

				String path = classCode + "/" + methodCode;
				Class<?> classType = cd.getClass(path);
				if (null != classType) {
					Object filter = SpringUtil.getBean(classType);
					Method method = cd.getMethod(path);
					if ((null != filter && null != method)) {
						try {
							Parameter[] parameters = method.getParameters();
							BeanBox beanBox = getBeanBox();
							beanBox.register(Head.class, head);
							beanBox.register(Info.class, info);
							Object[] dataArray = pvr.resolver(bodyObject, parameters, beanBox);
							method.invoke(filter, dataArray);
						} catch (IllegalAccessException e) {
							logger.error("", e);
						} catch (IllegalArgumentException e) {
							logger.error("", e);
						} catch (InvocationTargetException e) {
							logger.error("", e);
						}
					}
				}
			}
		}
	}

	private BeanBox getBeanBox() {
		BeanBox beanBox = new BeanBox() {

			Map<Class<?>, Object> map = new HashMap<Class<?>, Object>();

			@Override
			public void register(Class<?> requiredType, Object object) {
				map.put(requiredType, object);
			}

			@SuppressWarnings("unchecked")
			@Override
			public <T> T getBean(Class<T> requiredType) {
				Object value = null;
				Set<Class<?>> keySet = map.keySet();
				for (Class<?> type : keySet) {
					if (requiredType == type || type.isAssignableFrom(requiredType)) {
						value = map.get(type);
						break;
					}
				}
				if (null == value) {
					value = SpringUtil.getBean(requiredType);
				}
				return (T) value;
			}
		};
		return beanBox;
	}
}
