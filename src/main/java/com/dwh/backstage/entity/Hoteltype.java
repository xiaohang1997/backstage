package com.dwh.backstage.entity;

import java.io.Serializable;

/**
 * (Hoteltype)实体类
 *
 * @author makejava
 * @since 2020-11-19 23:24:32
 */
public class Hoteltype implements Serializable {
    private static final long serialVersionUID = 774060262193723376L;

    private Integer id;

    private String hoteltype;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHoteltype() {
        return hoteltype;
    }

    public void setHoteltype(String hoteltype) {
        this.hoteltype = hoteltype;
    }

}