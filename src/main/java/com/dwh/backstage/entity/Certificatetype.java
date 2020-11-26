package com.dwh.backstage.entity;

import java.io.Serializable;

/**
 * (Certificatetype)实体类
 *
 * @author makejava
 * @since 2020-11-19 23:24:30
 */
public class Certificatetype implements Serializable {
    private static final long serialVersionUID = 119078079372202297L;

    private Integer id;

    private String certificatetype;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCertificatetype() {
        return certificatetype;
    }

    public void setCertificatetype(String certificatetype) {
        this.certificatetype = certificatetype;
    }

}