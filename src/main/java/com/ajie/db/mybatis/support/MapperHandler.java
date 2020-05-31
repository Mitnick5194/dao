package com.ajie.db.mybatis.support;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.List;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

/**
 * mybatis mapper方法代理处理器
 * 
 * @author niezhenjie
 */
public class MapperHandler implements InvocationHandler {
	/** 被代理的对象 */
	private Object target;

	public MapperHandler(Object target) {
		this.target = target;
	}

	@SuppressWarnings("rawtypes")
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		PageHelper.startPage(0, 0);
		List<?> list = (List<?>) method.invoke(target, args);
		PageInfo<?> pageInfo = new PageInfo<>(list);
		return (MybatisPageData<?>) new MybatisPageData(
				(int) pageInfo.getTotal(), new MapperTargetInfo(target, method,
						args));
	}
}
