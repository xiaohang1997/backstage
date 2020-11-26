package com.dwh.backstage.controller;

import com.dwh.backstage.entity.Authorityrole;
import com.dwh.backstage.service.AuthorityroleService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (Authorityrole)表控制层
 *
 * @author makejava
 * @since 2020-11-19 23:24:28
 */
@RestController
@RequestMapping("authorityrole")
public class AuthorityroleController {
    /**
     * 服务对象
     */
    @Resource
    private AuthorityroleService authorityroleService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Authorityrole selectOne(Integer id) {
        return this.authorityroleService.queryById(id);
    }

}