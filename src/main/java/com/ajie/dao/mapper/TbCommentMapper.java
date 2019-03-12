package com.ajie.dao.mapper;

import com.ajie.dao.pojo.TbComment;
import com.ajie.dao.pojo.TbCommentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbCommentMapper {
	int countByExample(TbCommentExample example);

	int deleteByExample(TbCommentExample example);

	int deleteByPrimaryKey(Integer id);

	int insert(TbComment record);

	int insertSelective(TbComment record);

	List<TbComment> selectByExample(TbCommentExample example);

	TbComment selectByPrimaryKey(Integer id);

	int updateByExampleSelective(@Param("record") TbComment record,
			@Param("example") TbCommentExample example);

	int updateByExample(@Param("record") TbComment record,
			@Param("example") TbCommentExample example);

	int updateByPrimaryKeySelective(TbComment record);

	int updateByPrimaryKey(TbComment record);

	int getBlogCommentCount(int blogId);
}