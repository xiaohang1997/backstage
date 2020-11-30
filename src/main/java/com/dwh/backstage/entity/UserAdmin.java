package com.dwh.backstage.entity;

import java.io.Serializable;

/**
 * (UserAdmin)实体类
 *
 * @author makejava
 * @since 2020-11-30 06:25:12
 */
public class UserAdmin implements Serializable {
    private static final long serialVersionUID = 167319029692326990L;

    private String name;

    private String password;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}