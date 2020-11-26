package com.dwh.backstage.controller;

import com.dwh.backstage.entity.Certificatetype;
import com.dwh.backstage.service.CertificatetypeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (Certificatetype)表控制层
 *
 * @author makejava
 * @since 2020-11-19 23:24:30
 */
@RestController
@RequestMapping("certificatetype")
public class CertificatetypeController {
    /**
     * 服务对象
     */
    @Resource
    private CertificatetypeService certificatetypeService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Certificatetype selectOne(Integer id) {
        return this.certificatetypeService.queryById(id);
    }

}