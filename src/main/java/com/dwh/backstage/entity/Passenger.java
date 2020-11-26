package com.dwh.backstage.entity;

import java.io.Serializable;

/**
 * (Passenger)实体类
 *
 * @author makejava
 * @since 2020-11-19 23:24:35
 */
public class Passenger implements Serializable {
    private static final long serialVersionUID = -25052254473730395L;

    private Integer id;

    private Integer userid;

    private Integer certificatetypeid;

    private String certificatenumber;

    private String username;

    private String usergender;

    private Object userbirthdate;

    private String userphone;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getCertificatetypeid() {
        return certificatetypeid;
    }

    public void setCertificatetypeid(Integer certificatetypeid) {
        this.certificatetypeid = certificatetypeid;
    }

    public String getCertificatenumber() {
        return certificatenumber;
    }

    public void setCertificatenumber(String certificatenumber) {
        this.certificatenumber = certificatenumber;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsergender() {
        return usergender;
    }

    public void setUsergender(String usergender) {
        this.usergender = usergender;
    }

    public Object getUserbirthdate() {
        return userbirthdate;
    }

    public void setUserbirthdate(Object userbirthdate) {
        this.userbirthdate = userbirthdate;
    }

    public String getUserphone() {
        return userphone;
    }

    public void setUserphone(String userphone) {
        this.userphone = userphone;
    }

}