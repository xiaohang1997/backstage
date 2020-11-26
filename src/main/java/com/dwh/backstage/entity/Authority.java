package com.dwh.backstage.entity;

import java.io.Serializable;

/**
 * (Authority)实体类
 *
 * @author makejava
 * @since 2020-11-19 23:24:27
 */
public class Authority implements Serializable {
    private static final long serialVersionUID = 584347072855171102L;

    private Integer id;

    private String authorityname;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAuthorityname() {
        return authorityname;
    }

    public void setAuthorityname(String authorityname) {
        this.authorityname = authorityname;
    }

}