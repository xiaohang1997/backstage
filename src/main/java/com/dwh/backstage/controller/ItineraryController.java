package com.dwh.backstage.controller;

import com.dwh.backstage.entity.Itinerary;
import com.dwh.backstage.service.ItineraryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (Itinerary)表控制层
 *
 * @author makejava
 * @since 2020-11-19 23:24:34
 */
@RestController
@RequestMapping("itinerary")
public class ItineraryController {
    /**
     * 服务对象
     */
    @Resource
    private ItineraryService itineraryService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Itinerary selectOne(Integer id) {
        return this.itineraryService.queryById(id);
    }

}