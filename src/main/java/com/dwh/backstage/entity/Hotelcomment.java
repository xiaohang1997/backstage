package com.dwh.backstage.entity;

import java.io.Serializable;

/**
 * (Hotelcomment)实体类
 *
 * @author makejava
 * @since 2020-11-19 23:24:31
 */
public class Hotelcomment implements Serializable {
    private static final long serialVersionUID = -73776631575139622L;

    private Integer id;

    private Integer hotelid;

    private String content;

    private Integer userid;

    private Object createdate;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getHotelid() {
        return hotelid;
    }

    public void setHotelid(Integer hotelid) {
        this.hotelid = hotelid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
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

}