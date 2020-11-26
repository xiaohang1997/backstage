package com.dwh.backstage.controller;

import com.dwh.backstage.entity.Hoteltype;
import com.dwh.backstage.service.HoteltypeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (Hoteltype)表控制层
 *
 * @author makejava
 * @since 2020-11-19 23:24:33
 */
@RestController
@RequestMapping("hoteltype")
public class HoteltypeController {
    /**
     * 服务对象
     */
    @Resource
    private HoteltypeService hoteltypeService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Hoteltype selectOne(Integer id) {
        return this.hoteltypeService.queryById(id);
    }

}