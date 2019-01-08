package com.ajie.dao.pojo;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class TbBlog {
    private Integer id;

    private Integer userid;

    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date createtime;

    private String title;

    private String content;

    private Integer praisenum;

    private Integer collectnum;

    private Integer readnum;

    private String labelstrs;

    private Integer state;

    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date lastmodifydate;

    private Integer commentnum;

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

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
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

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Date getLastmodifydate() {
        return lastmodifydate;
    }

    public void setLastmodifydate(Date lastmodifydate) {
        this.lastmodifydate = lastmodifydate;
    }

    public Integer getCommentnum() {
        return commentnum;
    }

    public void setCommentnum(Integer commentnum) {
        this.commentnum = commentnum;
    }
}