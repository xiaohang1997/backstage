package com.dwh.backstage.entity;

import java.io.Serializable;

/**
 * (Blog)实体类
 *
 * @author makejava
 * @since 2020-11-19 23:24:29
 */
public class Blog implements Serializable {
    private static final long serialVersionUID = 724749223821066112L;

    private Integer id;

    private String blogname;

    private Object blogcontent;

    private Integer userid;

    private Object createdate;

    private String imgurl;

    private Integer likecount;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBlogname() {
        return blogname;
    }

    public void setBlogname(String blogname) {
        this.blogname = blogname;
    }

    public Object getBlogcontent() {
        return blogcontent;
    }

    public void setBlogcontent(Object blogcontent) {
        this.blogcontent = blogcontent;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Object getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Object createdate) {
        this.createdate = createdate;
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl;
    }

    public Integer getLikecount() {
        return likecount;
    }

    public void setLikecount(Integer likecount) {
        this.likecount = likecount;
    }

}