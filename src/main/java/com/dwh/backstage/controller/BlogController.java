package com.dwh.backstage.controller;

import com.dwh.backstage.entity.Blog;
import com.dwh.backstage.service.BlogService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (Blog)表控制层
 *
 * @author makejava
 * @since 2020-11-19 23:24:29
 */
@RestController
@RequestMapping("blog")
public class BlogController {
    /**
     * 服务对象
     */
    @Resource
    private BlogService blogService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Blog selectOne(Integer id) {
        return this.blogService.queryById(id);
    }

}