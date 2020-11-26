package com.dwh.backstage.service;

import com.dwh.backstage.entity.Itinerary;

import java.util.List;

/**
 * (Itinerary)表服务接口
 *
 * @author makejava
 * @since 2020-11-19 23:24:33
 */
public interface ItineraryService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Itinerary queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Itinerary> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param itinerary 实例对象
     * @return 实例对象
     */
    Itinerary insert(Itinerary itinerary);

    /**
     * 修改数据
     *
     * @param itinerary 实例对象
     * @return 实例对象
     */
    Itinerary update(Itinerary itinerary);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}