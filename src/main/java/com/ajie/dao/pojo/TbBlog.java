package com.ajie.dao.pojo;

import java.util.Date;

public class TbBlog {
    private Integer id;

    private Integer userid;

    private Date createtime;

    private Date lastactive;

    private String title;

    private Integer commentnum;

    private Integer praisenum;

    private Integer collectnum;

    private Integer readnum;

    private String labelstrs;

    private Integer state;

    private byte[] content;

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

    public Date getLastactive() {
        return lastactive;
    }

    public void setLastactive(Date lastactive) {
        this.lastactive = lastactive;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
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

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public byte[] getContent() {
        return content;
    }

    public void setContent(byte[] content) {
        this.content = content;
    }
}