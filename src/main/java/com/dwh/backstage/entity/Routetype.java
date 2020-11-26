package com.dwh.backstage.entity;

import java.io.Serializable;

/**
 * (Routetype)实体类
 *
 * @author makejava
 * @since 2020-11-19 23:24:41
 */
public class Routetype implements Serializable {
    private static final long serialVersionUID = 133290185600919184L;

    private Integer id;

    private String routetype;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRoutetype() {
        return routetype;
    }

    public void setRoutetype(String routetype) {
        this.routetype = routetype;
    }

}