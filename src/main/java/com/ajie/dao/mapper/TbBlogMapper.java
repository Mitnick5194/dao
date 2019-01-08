package com.ajie.dao.mapper;

import com.ajie.dao.pojo.TbBlog;
import com.ajie.dao.pojo.TbBlogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbBlogMapper {
    int countByExample(TbBlogExample example);

    int deleteByExample(TbBlogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbBlog record);

    int insertSelective(TbBlog record);

    List<TbBlog> selectByExample(TbBlogExample example);

    TbBlog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbBlog record, @Param("example") TbBlogExample example);

    int updateByExample(@Param("record") TbBlog record, @Param("example") TbBlogExample example);

    int updateByPrimaryKeySelective(TbBlog record);

    int updateByPrimaryKey(TbBlog record);
}