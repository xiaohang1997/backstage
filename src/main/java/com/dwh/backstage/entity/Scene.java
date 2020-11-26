package com.dwh.backstage.entity;

import java.io.Serializable;

/**
 * (Scene)实体类
 *
 * @author makejava
 * @since 2020-11-19 23:24:43
 */
public class Scene implements Serializable {
    private static final long serialVersionUID = -83061200544286617L;

    private Integer id;

    private String introduce;

    private String scenename;

    private String address;

    private String imgurl;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    public String getScenename() {
        return scenename;
    }

    public void setScenename(String scenename) {
        this.scenename = scenename;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl;
    }

}