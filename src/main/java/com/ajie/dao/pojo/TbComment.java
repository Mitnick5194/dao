package com.ajie.dao.pojo;

import java.util.Date;

public class TbComment {
	private Integer id;

	private Integer blogid;

	private String userheader;

	private String username;

	private String usernickname;

	private Integer userid;

	private Date createtime;

	private String content;

	private Integer mark;

	public TbComment() {

	}

	public TbComment(String content, int blogId, int userId) {
		this.content = content;
		this.blogid = blogId;
		this.userid = userId;
		this.createtime = new Date();
		this.mark = 1;

	}

	public TbComment(String content, int blogId, TbUser user) {
		this.content = content;
		this.blogid = blogId;
		this.userid = user.getId();
		this.userheader = user.getHeader();
		this.username = user.getName();
		this.usernickname = user.getNickname();
		this.createtime = new Date();
		this.mark = 1;

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getBlogid() {
		return blogid;
	}

	public void setBlogid(Integer blogid) {
		this.blogid = blogid;
	}

	public String getUserheader() {
		return userheader;
	}

	public void setUserheader(String userheader) {
		this.userheader = userheader == null ? null : userheader.trim();
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username == null ? null : username.trim();
	}

	public String getUsernickname() {
		return usernickname;
	}

	public void setUsernickname(String usernickname) {
		this.usernickname = usernickname == null ? null : usernickname.trim();
	}

	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public Date getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content == null ? null : content.trim();
	}

	public Integer getMark() {
		return mark;
	}

	public void setMark(Integer mark) {
		this.mark = mark;
	}
}