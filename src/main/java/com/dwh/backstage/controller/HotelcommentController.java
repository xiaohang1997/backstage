package com.dwh.backstage.controller;

import com.dwh.backstage.entity.Hotelcomment;
import com.dwh.backstage.service.HotelcommentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (Hotelcomment)表控制层
 *
 * @author makejava
 * @since 2020-11-19 23:24:32
 */
@RestController
@RequestMapping("hotelcomment")
public class HotelcommentController {
    /**
     * 服务对象
     */
    @Resource
    private HotelcommentService hotelcommentService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Hotelcomment selectOne(Integer id) {
        return this.hotelcommentService.queryById(id);
    }

}