package com.ajie.dao.mapper;

import com.ajie.dao.pojo.TbConfig;

public interface TbConfigMapper {

	/**
	 * 根据id获取配置
	 * 
	 * @param id
	 * @return
	 */
	TbConfig getConfig(String id);

	/**
	 * 保存配置
	 * 
	 * @param config
	 * @return
	 */
	int create(TbConfig config);

	/**
	 * 更新配置
	 * 
	 * @param config
	 * @return
	 */
	int update(TbConfig config);

}
