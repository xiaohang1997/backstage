package com.dwh.backstage.controller;

import com.dwh.backstage.entity.Routetype;
import com.dwh.backstage.service.RoutetypeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (Routetype)表控制层
 *
 * @author makejava
 * @since 2020-11-19 23:24:43
 */
@RestController
@RequestMapping("routetype")
public class RoutetypeController {
    /**
     * 服务对象
     */
    @Resource
    private RoutetypeService routetypeService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Routetype selectOne(Integer id) {
        return this.routetypeService.queryById(id);
    }

}