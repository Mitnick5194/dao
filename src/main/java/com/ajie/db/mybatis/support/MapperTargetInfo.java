package com.ajie.db.mybatis.support;

import java.lang.reflect.Method;

/**
 * 调用目标target信息
 * 
 * @author niezhenjie
 */
public class MapperTargetInfo {
	/** 被代理的对象 */
	private Object proxy;
	/** 调用的方法 */
	private Method method;
	/** 方法参数 */
	private Object[] args;

	public MapperTargetInfo(Object proxy, Method method, Object... args) {
		this.proxy = proxy;
		this.method = method;
		this.args = args;
	}

	public Object getProxy() {
		return proxy;
	}

	public Method getMethod() {
		return method;
	}

	public Object[] getArgs() {
		return args;
	}
}
