package com.dwh.backstage.service;

import com.dwh.backstage.entity.Hotel;
import com.dwh.backstage.vo.RoleUserVO;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * (Hotel)表服务接口
 *
 * @author makejava
 * @since 2020-11-19 23:24:31
 */
public interface HotelService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Hotel queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Hotel> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param hotel 实例对象
     * @return 实例对象
     */
    Hotel insert(Hotel hotel);

    /**
     * 修改数据
     *
     * @param hotel 实例对象
     * @return 实例对象
     */
    Hotel update(Hotel hotel);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

    PageInfo<Hotel> findAll(int page, int limit);
}