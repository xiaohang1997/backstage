package com.dwh.backstage.controller;

import com.dwh.backstage.entity.Scene;
import com.dwh.backstage.service.SceneService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (Scene)表控制层
 *
 * @author makejava
 * @since 2020-11-19 23:24:44
 */
@RestController
@RequestMapping("scene")
public class SceneController {
    /**
     * 服务对象
     */
    @Resource
    private SceneService sceneService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Scene selectOne(Integer id) {
        return this.sceneService.queryById(id);
    }

}