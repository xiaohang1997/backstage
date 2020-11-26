package com.dwh.backstage.service;

import com.dwh.backstage.entity.Authorityrole;

import java.util.List;

/**
 * (Authorityrole)表服务接口
 *
 * @author makejava
 * @since 2020-11-19 23:24:28
 */
public interface AuthorityroleService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Authorityrole queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Authorityrole> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param authorityrole 实例对象
     * @return 实例对象
     */
    Authorityrole insert(Authorityrole authorityrole);

    /**
     * 修改数据
     *
     * @param authorityrole 实例对象
     * @return 实例对象
     */
    Authorityrole update(Authorityrole authorityrole);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}