package com.dwh.backstage.entity;

import java.io.Serializable;

/**
 * (Hotel)实体类
 *
 * @author makejava
 * @since 2020-11-19 23:24:30
 */
public class Hotel implements Serializable {
    private static final long serialVersionUID = -43784017113249187L;

    private Integer id;

    private String hotelname;

    private String hotelintroduce;

    private String hoteladdress;

    private Integer hoteltypeid;

    private String imgurl;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHotelname() {
        return hotelname;
    }

    public void setHotelname(String hotelname) {
        this.hotelname = hotelname;
    }

    public String getHotelintroduce() {
        return hotelintroduce;
    }

    public void setHotelintroduce(String hotelintroduce) {
        this.hotelintroduce = hotelintroduce;
    }

    public String getHoteladdress() {
        return hoteladdress;
    }

    public void setHoteladdress(String hoteladdress) {
        this.hoteladdress = hoteladdress;
    }

    public Integer getHoteltypeid() {
        return hoteltypeid;
    }

    public void setHoteltypeid(Integer hoteltypeid) {
        this.hoteltypeid = hoteltypeid;
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl;
    }

}