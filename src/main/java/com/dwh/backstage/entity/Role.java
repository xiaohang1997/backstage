package com.dwh.backstage.entity;

import java.io.Serializable;

/**
 * (Role)实体类
 *
 * @author makejava
 * @since 2020-11-19 23:24:36
 */
public class Role implements Serializable {
    private static final long serialVersionUID = -89898157372895358L;

    private Integer id;

    private String rolename;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }

}