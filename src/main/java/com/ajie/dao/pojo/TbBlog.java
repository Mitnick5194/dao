package com.ajie.dao.pojo;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class TbBlog {
	private Integer id;

	private Integer userid;

	private String userheader;

	private String username;

	private String usernickname;
	@JSONField(format = "yyyy-MM-dd HH:mm:ss")
	private Date createtime;
	@JSONField(format = "yyyy-MM-dd HH:mm:ss")
	private Date lastmodifydate;

	private String title;

	private String content;

	private Integer commentnum;

	private Integer praisenum;

	private Integer collectnum;

	private Integer readnum;

	private String labelstrs;

	private Integer mark;

	public TbBlog() {

	}

	public TbBlog(String title, String content) {
		this.title = title;
		this.content = content;
		this.createtime = new Date();
		this.lastmodifydate = new Date();
		this.collectnum = 0;
		this.readnum = 0;
		this.praisenum = 0;
		this.commentnum = 0;
		this.mark = 1;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
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

	public Date getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public Date getLastmodifydate() {
		return lastmodifydate;
	}

	public void setLastmodifydate(Date lastmodifydate) {
		this.lastmodifydate = lastmodifydate;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title == null ? null : title.trim();
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content == null ? null : content.trim();
	}

	public Integer getCommentnum() {
		return commentnum;
	}

	public void setCommentnum(Integer commentnum) {
		this.commentnum = commentnum;
	}

	public Integer getPraisenum() {
		return praisenum;
	}

	public void setPraisenum(Integer praisenum) {
		this.praisenum = praisenum;
	}

	public Integer getCollectnum() {
		return collectnum;
	}

	public void setCollectnum(Integer collectnum) {
		this.collectnum = collectnum;
	}

	public Integer getReadnum() {
		return readnum;
	}

	public void setReadnum(Integer readnum) {
		this.readnum = readnum;
	}

	public String getLabelstrs() {
		return labelstrs;
	}

	public void setLabelstrs(String labelstrs) {
		this.labelstrs = labelstrs == null ? null : labelstrs.trim();
	}

	public Integer getMark() {
		return mark;
	}

	public void setMark(Integer mark) {
		this.mark = mark;
	}
}