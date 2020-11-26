package com.dwh.backstage.service;

import com.dwh.backstage.entity.Hoteltype;

import java.util.List;

/**
 * (Hoteltype)表服务接口
 *
 * @author makejava
 * @since 2020-11-19 23:24:33
 */
public interface HoteltypeService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Hoteltype queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Hoteltype> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param hoteltype 实例对象
     * @return 实例对象
     */
    Hoteltype insert(Hoteltype hoteltype);

    /**
     * 修改数据
     *
     * @param hoteltype 实例对象
     * @return 实例对象
     */
    Hoteltype update(Hoteltype hoteltype);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}