package com.ajie.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ajie.dao.pojo.TbBlog;
import com.ajie.dao.pojo.TbBlogExample;

public interface TbBlogMapper {
    int countByExample(TbBlogExample example);

    int deleteByExample(TbBlogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbBlog record);

    int insertSelective(TbBlog record);

    List<TbBlog> selectByExampleWithBLOBs(TbBlogExample example);

    List<TbBlog> selectByExample(TbBlogExample example);

    TbBlog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbBlog record, @Param("example") TbBlogExample example);

    int updateByExampleWithBLOBs(@Param("record") TbBlog record, @Param("example") TbBlogExample example);

    int updateByExample(@Param("record") TbBlog record, @Param("example") TbBlogExample example);

    int updateByPrimaryKeySelective(TbBlog record);

    int updateByPrimaryKeyWithBLOBs(TbBlog record);

    int updateByPrimaryKey(TbBlog record);
}