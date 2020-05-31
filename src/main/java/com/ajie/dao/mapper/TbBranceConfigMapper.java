package com.ajie.dao.mapper;

import com.ajie.dao.pojo.TbBranceConfig;

public interface TbBranceConfigMapper {

	/**
	 * 根据id获取配置分支
	 * 
	 * @param id
	 * @return
	 */
	TbBranceConfig getBranceConfig(String id);

	/**
	 * 新建分支
	 * 
	 * @param config
	 * @return
	 */
	int create(TbBranceConfig config);

	/**
	 * 更新分支
	 * 
	 * @param config
	 * @return
	 */
	int update(TbBranceConfig config);
}
