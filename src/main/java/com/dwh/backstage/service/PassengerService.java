package com.dwh.backstage.service;

import com.dwh.backstage.entity.Passenger;

import java.util.List;

/**
 * (Passenger)表服务接口
 *
 * @author makejava
 * @since 2020-11-19 23:24:35
 */
public interface PassengerService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Passenger queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Passenger> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param passenger 实例对象
     * @return 实例对象
     */
    Passenger insert(Passenger passenger);

    /**
     * 修改数据
     *
     * @param passenger 实例对象
     * @return 实例对象
     */
    Passenger update(Passenger passenger);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}