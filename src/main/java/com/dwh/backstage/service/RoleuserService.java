package com.dwh.backstage.service;

import com.dwh.backstage.entity.Roleuser;
import com.dwh.backstage.entity.User;
import com.dwh.backstage.vo.RoleUserVO;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * (Roleuser)表服务接口
 *
 * @author makejava
 * @since 2020-11-19 23:24:37
 */
public interface RoleuserService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Roleuser queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Roleuser> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param roleuser 实例对象
     * @return 实例对象
     */
    Roleuser insert(Roleuser roleuser);

    /**
     * 修改数据
     *
     * @param roleuser 实例对象
     * @return 实例对象
     */
    Roleuser update(Roleuser roleuser);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

    PageInfo<RoleUserVO> findAll(int page, int limit);
}