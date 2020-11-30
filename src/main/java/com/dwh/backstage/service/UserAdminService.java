package com.dwh.backstage.service;

import com.dwh.backstage.entity.UserAdmin;

import java.util.List;

/**
 * (UserAdmin)表服务接口
 *
 * @author makejava
 * @since 2020-11-30 06:25:13
 */
public interface UserAdminService {

    /**
     * 通过ID查询单条数据
     *
     * @param name 主键
     * @return 实例对象
     */
    UserAdmin queryById(String name);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<UserAdmin> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param userAdmin 实例对象
     * @return 实例对象
     */
    UserAdmin insert(UserAdmin userAdmin);

    /**
     * 修改数据
     *
     * @param userAdmin 实例对象
     * @return 实例对象
     */
    UserAdmin update(UserAdmin userAdmin);

    /**
     * 通过主键删除数据
     *
     * @param name 主键
     * @return 是否成功
     */
    boolean deleteById(String name);

    List<UserAdmin> queryAll(UserAdmin userAdmin);

}