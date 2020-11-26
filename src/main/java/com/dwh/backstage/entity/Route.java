package com.dwh.backstage.entity;

import java.io.Serializable;

/**
 * (Route)实体类
 *
 * @author makejava
 * @since 2020-11-19 23:24:39
 */
public class Route implements Serializable {
    private static final long serialVersionUID = -68503467585584271L;

    private Integer id;

    private String routename;

    private Double routeprice;

    private Integer routetypeid;

    private String imgurl;

    private String toaddress;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRoutename() {
        return routename;
    }

    public void setRoutename(String routename) {
        this.routename = routename;
    }

    public Double getRouteprice() {
        return routeprice;
    }

    public void setRouteprice(Double routeprice) {
        this.routeprice = routeprice;
    }

    public Integer getRoutetypeid() {
        return routetypeid;
    }

    public void setRoutetypeid(Integer routetypeid) {
        this.routetypeid = routetypeid;
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl;
    }

    public String getToaddress() {
        return toaddress;
    }

    public void setToaddress(String toaddress) {
        this.toaddress = toaddress;
    }

}