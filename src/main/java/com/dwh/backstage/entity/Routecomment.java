package com.dwh.backstage.entity;

import java.io.Serializable;

/**
 * (Routecomment)实体类
 *
 * @author makejava
 * @since 2020-11-19 23:24:40
 */
public class Routecomment implements Serializable {
    private static final long serialVersionUID = -75785055220801346L;

    private Integer id;

    private Integer routeid;

    private Integer userid;

    private String content;

    private Object createdate;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRouteid() {
        return routeid;
    }

    public void setRouteid(Integer routeid) {
        this.routeid = routeid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Object getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Object createdate) {
        this.createdate = createdate;
    }

}