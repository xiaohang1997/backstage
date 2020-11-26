package com.dwh.backstage.entity;

import java.io.Serializable;

/**
 * (Itinerary)实体类
 *
 * @author makejava
 * @since 2020-11-19 23:24:33
 */
public class Itinerary implements Serializable {
    private static final long serialVersionUID = -20438130240133199L;

    private Integer id;

    private String name;

    private String day;

    private Integer routeid;

    private String todayitinerary;

    private Integer sceneid;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public Integer getRouteid() {
        return routeid;
    }

    public void setRouteid(Integer routeid) {
        this.routeid = routeid;
    }

    public String getTodayitinerary() {
        return todayitinerary;
    }

    public void setTodayitinerary(String todayitinerary) {
        this.todayitinerary = todayitinerary;
    }

    public Integer getSceneid() {
        return sceneid;
    }

    public void setSceneid(Integer sceneid) {
        this.sceneid = sceneid;
    }

}