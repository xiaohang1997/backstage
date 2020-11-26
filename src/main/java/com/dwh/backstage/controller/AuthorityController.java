package com.dwh.backstage.controller;

import com.dwh.backstage.entity.Authority;
import com.dwh.backstage.service.AuthorityService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (Authority)表控制层
 *
 * @author makejava
 * @since 2020-11-19 23:24:27
 */
@RestController
@RequestMapping("authority")
public class AuthorityController {
    /**
     * 服务对象
     */
    @Resource
    private AuthorityService authorityService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Authority selectOne(Integer id) {
        return this.authorityService.queryById(id);
    }

}