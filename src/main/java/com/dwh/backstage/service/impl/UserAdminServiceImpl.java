package com.dwh.backstage.service.impl;

import com.dwh.backstage.dao.UserAdminDao;
import com.dwh.backstage.entity.UserAdmin;
import com.dwh.backstage.service.UserAdminService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (UserAdmin)表服务实现类
 *
 * @author makejava
 * @since 2020-11-30 06:25:13
 */
@Service("userAdminService")
public class UserAdminServiceImpl implements UserAdminService {
    @Resource
    private UserAdminDao userAdminDao;

    /**
     * 通过ID查询单条数据
     *
     * @param name 主键
     * @return 实例对象
     */
    @Override
    public UserAdmin queryById(String name) {
        return this.userAdminDao.queryById(name);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<UserAdmin> queryAllByLimit(int offset, int limit) {
        return this.userAdminDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param userAdmin 实例对象
     * @return 实例对象
     */
    @Override
    public UserAdmin insert(UserAdmin userAdmin) {
        this.userAdminDao.insert(userAdmin);
        return userAdmin;
    }

    /**
     * 修改数据
     *
     * @param userAdmin 实例对象
     * @return 实例对象
     */
    @Override
    public UserAdmin update(UserAdmin userAdmin) {
        this.userAdminDao.update(userAdmin);
        return this.queryById(userAdmin.getName());
    }

    /**
     * 通过主键删除数据
     *
     * @param name 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String name) {
        return this.userAdminDao.deleteById(name) > 0;
    }

    @Override
    public List<UserAdmin> queryAll(UserAdmin userAdmin) {
        return userAdminDao.queryAll(userAdmin);
    }
}