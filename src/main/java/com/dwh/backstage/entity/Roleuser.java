package com.dwh.backstage.entity;

import java.io.Serializable;

/**
 * (Roleuser)实体类
 *
 * @author makejava
 * @since 2020-11-19 23:24:37
 */
public class Roleuser implements Serializable {
    private static final long serialVersionUID = -91147256765419597L;

    private Integer id;

    private Integer roleid;

    private Integer userid;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

}