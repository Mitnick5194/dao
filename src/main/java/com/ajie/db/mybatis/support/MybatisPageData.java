package com.ajie.db.mybatis.support;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.github.pagehelper.PageHelper;

/**
 * mybatis分页数据
 * 
 * @author niezhenjie
 */
public class MybatisPageData<T> extends AbstractMybatisPageData<T> {
	private static final long serialVersionUID = 1L;
	private static final Logger logger = LoggerFactory
			.getLogger(MybatisPageData.class);
	private MapperTargetInfo mapperTargetInfo;

	public MybatisPageData(MapperTargetInfo mapperTargetInfo) {
		super(0);
		this.mapperTargetInfo = mapperTargetInfo;
	}

	public MybatisPageData(int count, MapperTargetInfo mapperTargetInfo) {
		super(count);
		this.mapperTargetInfo = mapperTargetInfo;
	}

	protected MybatisPageData(int count) {
		super(count);
	}

	@Override
	protected void loadData() {
		try {
			PageHelper.startPage(1, pageSize);
			@SuppressWarnings("unchecked")
			List<T> result = (List<T>) mapperTargetInfo.getMethod().invoke(
					mapperTargetInfo.getProxy(), mapperTargetInfo.getArgs());
			for (T t : result) {
				add(t);// 将元素添加到数组
			}
		} catch (IllegalAccessException | IllegalArgumentException
				| InvocationTargetException e) {
			logger.error("加载数据失败", e);
		}
	}
}
