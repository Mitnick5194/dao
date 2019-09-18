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

	/**
	 * 更新评论状态，接口不应该关心业务状态，判断是不是本人操作在接口实现里写，不应在这里加
	 * 
	 * @param id
	 * @param mark
	 * @return
	 */
	void updateCommentMark(@Param("id") int id, @Param("mark") int mark);

	/**
	 * 批量更新指定博客的评论状态
	 * 
	 * @param id
	 * @param mark
	 * @return
	 */
	void updateBlogCommentsMark(@Param("blogId") int userId,
			@Param("mark") int mark);

	/**
	 * 批量更新指定用户的评论状态
	 * 
	 * @param id
	 * @param mark
	 * @return
	 */
	void updateCommentsMark(@Param("userId") int userId, @Param("mark") int mark);
}