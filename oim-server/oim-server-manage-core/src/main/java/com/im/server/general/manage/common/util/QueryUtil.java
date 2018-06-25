package com.im.server.general.manage.common.util;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;



/**
 * @author: XiaHui
 */
public class QueryUtil {

	private static Map<Class<?>, List<PropertyDescriptor>> listMap = new ConcurrentHashMap<Class<?>, List<PropertyDescriptor>>();
	private static Map<Class<?>, Map<String, PropertyDescriptor>> keyMap = new ConcurrentHashMap<Class<?>, Map<String, PropertyDescriptor>>();

	public static Map<String,Object> getQueryWrapper(Object value) {
		return getQueryWrapper(value, null, null);
	}

	public static Map<String,Object> getQueryWrapper(Object value, Map<String,Object> queryWrapper) {
		return getQueryWrapper(value, queryWrapper, null);
	}

	public static Map<String,Object> getQueryWrapper(Object value, List<String> nameList) {
		return getQueryWrapper(value, null, nameList);
	}

	public static Map<String,Object> getQueryWrapper(Object value, Map<String,Object> queryWrapper, List<String> nameList) {
		return getQueryWrapperType(value, queryWrapper, nameList);
	}

	public static Map<String,Object> getQueryWrapperType(Object value) {
		return getQueryWrapperType(value, null);
	}

	public static Map<String,Object> getQueryWrapperType(Object value, Map<String,Object> queryWrapper) {
		return getQueryWrapperType(value, queryWrapper, null);
	}

	public static Map<String,Object> getQueryWrapperType(Object value, Map<String,Object> queryWrapper, List<String> nameList) {
		if (null == queryWrapper) {
			queryWrapper = new HashMap<String,Object>();
		}

		try {
			if (null != value) {
				

				if (null == nameList || nameList.isEmpty()) {
					if (value instanceof Map) {
						Map<?, ?> map = (Map<?, ?>) value;
						Set<?> keySet = map.keySet();
						for (Object key : keySet) {
							Object data = map.get(key);
							String name = null == key ? "" : key.toString();
							
							if (null != data&&!"".equals(data)) {
								queryWrapper.put(name, data);
							}
						}
					} else {
						List<PropertyDescriptor> propertyDescriptorList = getReadMethodList(value.getClass());
						for (PropertyDescriptor pd : propertyDescriptorList) {
							String propertyName = pd.getName();
							Method readMethod = pd.getReadMethod();
							Object data = readMethod.invoke(value);
							if (null != data&&!"".equals(data)) {
								queryWrapper.put(propertyName, data);
							}
						}
					}
				} else {
					if (value instanceof Map) {
						Map<?, ?> map = (Map<?, ?>) value;
						for (String name : nameList) {
							Object data = map.get(name);
							if (null != data&&!"".equals(data)) {
								queryWrapper.put(name, data);
							}
						}
					} else {
						Map<String, PropertyDescriptor> map = getReadMethodMap(value.getClass());
						for (String name : nameList) {
							PropertyDescriptor pd = map.get(name);
							if (null != pd) {
								String propertyName = pd.getName();
								Method readMethod = pd.getReadMethod();
								Object data = readMethod.invoke(value);
								if (null != data&&!"".equals(data)) {
									queryWrapper.put(propertyName, data);
								}
							}
						}
					}
				}
			}
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		return queryWrapper;
	}

	public static List<PropertyDescriptor> getReadMethodList(Class<?> classType) {
		List<PropertyDescriptor> list = listMap.get(classType);
		try {
			if (null == list) {
				list = new ArrayList<PropertyDescriptor>();
				BeanInfo bi = Introspector.getBeanInfo(classType, Object.class);
				PropertyDescriptor[] pds = bi.getPropertyDescriptors();
				for (PropertyDescriptor pd : pds) {
					if (null != pd.getReadMethod()) {
						list.add(pd);
					}
				}
				listMap.put(classType, list);
			}
		} catch (IntrospectionException e) {
			e.printStackTrace();
		}
		return list;
	}

	public static Map<String, PropertyDescriptor> getReadMethodMap(Class<?> classType) {
		Map<String, PropertyDescriptor> map = keyMap.get(classType);
		try {
			if (null == map) {
				map = new HashMap<String, PropertyDescriptor>();
				BeanInfo bi = Introspector.getBeanInfo(classType, Object.class);
				PropertyDescriptor[] pds = bi.getPropertyDescriptors();
				for (PropertyDescriptor pd : pds) {
					if (null != pd.getReadMethod()) {
						map.put(pd.getName(), pd);
					}
				}
				keyMap.put(classType, map);
			}
		} catch (IntrospectionException e) {
			e.printStackTrace();
		}
		return map;
	}
}
