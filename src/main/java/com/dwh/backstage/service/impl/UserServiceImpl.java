package com.dwh.backstage.service.impl;

import com.dwh.backstage.dao.UserDao;
import com.dwh.backstage.entity.User;
import com.dwh.backstage.service.UserService;
import com.dwh.backstage.util.Pager;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (User)表服务实现类
 *
 * @author makejava
 * @since 2020-11-19 23:24:45
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public User queryById(Integer id) {
        return this.userDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List queryAllByLimit(int offset, int limit) {
        return userDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param user 实例对象
     * @return 实例对象
     */
    @Override
    public User insert(User user) {
        this.userDao.insert(user);
        return user;
    }

    /**
     * 修改数据
     *
     * @param user 实例对象
     * @return 实例对象
     */
    @Override
    public User update(User user) {
        this.userDao.update(user);
        return this.queryById(user.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Object id) {

        return this.userDao.deleteById(id) > 0;
    }

    @Override
    public Pager<User> findAllByLimit(int page, int limit) {
        int offset = (page - 1) * limit;
        Pager<User> pager = new Pager<User>();
        List<User> list = userDao.queryAllByLimit(offset, limit);
        pager.setRows(list);
        pager.setTotal(userDao.count());
        return pager;
    }
}