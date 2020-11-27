package com.dwh.backstage.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * (Room)实体类
 *
 * @author makejava
 * @since 2020-11-19 23:24:38
 */
public class Room implements Serializable {
    private static final long serialVersionUID = 660042507242795945L;

    private Integer id;

    private Integer hotelid;

    private String roomname;

    private String roomintroduce;

    private Double roomprice;

    private Integer roomnumber;

    private Date startdate;

    private Date enddate;

    private String imgurl;

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

    public String getRoomname() {
        return roomname;
    }

    public void setRoomname(String roomname) {
        this.roomname = roomname;
    }

    public String getRoomintroduce() {
        return roomintroduce;
    }

    public void setRoomintroduce(String roomintroduce) {
        this.roomintroduce = roomintroduce;
    }

    public Double getRoomprice() {
        return roomprice;
    }

    public void setRoomprice(Double roomprice) {
        this.roomprice = roomprice;
    }

    public Integer getRoomnumber() {
        return roomnumber;
    }

    public void setRoomnumber(Integer roomnumber) {
        this.roomnumber = roomnumber;
    }

    public Date getStartdate() {
        return startdate;
    }

    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl;
    }

}