package com.ajie.dao.pojo;

public class TbLabel {
    private Integer id;

    private String name;

    private String blogids;

    private Integer mark;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getBlogids() {
        return blogids;
    }

    public void setBlogids(String blogids) {
        this.blogids = blogids == null ? null : blogids.trim();
    }

    public Integer getMark() {
        return mark;
    }

    public void setMark(Integer mark) {
        this.mark = mark;
    }
}