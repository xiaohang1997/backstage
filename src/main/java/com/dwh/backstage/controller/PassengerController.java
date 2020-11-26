package com.dwh.backstage.controller;

import com.dwh.backstage.entity.Passenger;
import com.dwh.backstage.service.PassengerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (Passenger)表控制层
 *
 * @author makejava
 * @since 2020-11-19 23:24:35
 */
@RestController
@RequestMapping("passenger")
public class PassengerController {
    /**
     * 服务对象
     */
    @Resource
    private PassengerService passengerService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Passenger selectOne(Integer id) {
        return this.passengerService.queryById(id);
    }

}