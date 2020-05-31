package com.ajie.db.mybatis.support;

import java.lang.reflect.Proxy;
import java.util.List;

import com.ajie.chilli.support.PageData;

/**
 * 分页工具
 * 
 * @author niezhenjie
 */
public class PageUtil {

	@SuppressWarnings("unchecked")
	public static <T> T getPageMapper(T mapper) {
		MapperHandler handle = new MapperHandler(mapper);
		return (T) Proxy.newProxyInstance(mapper.getClass().getClassLoader(),
				mapper.getClass().getInterfaces(), handle);
	}

	@SuppressWarnings("unchecked")
	public static <T> PageData<T> wrapPageData(List<T> data) {
		return (PageData<T>) data;
	}
}
