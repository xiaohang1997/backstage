package com.dwh.backstage.entity;

import java.io.Serializable;

/**
 * (Authorityrole)实体类
 *
 * @author makejava
 * @since 2020-11-19 23:24:28
 */
public class Authorityrole implements Serializable {
    private static final long serialVersionUID = 439124566200830662L;

    private Integer id;

    private Integer authorityid;

    private Integer roleid;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAuthorityid() {
        return authorityid;
    }

    public void setAuthorityid(Integer authorityid) {
        this.authorityid = authorityid;
    }

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

}