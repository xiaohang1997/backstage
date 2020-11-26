package com.dwh.backstage.service.impl;

import com.dwh.backstage.dao.AuthorityroleDao;
import com.dwh.backstage.entity.Authorityrole;
import com.dwh.backstage.service.AuthorityroleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Authorityrole)表服务实现类
 *
 * @author makejava
 * @since 2020-11-19 23:24:28
 */
@Service("authorityroleService")
public class AuthorityroleServiceImpl implements AuthorityroleService {
    @Resource
    private AuthorityroleDao authorityroleDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Authorityrole queryById(Integer id) {
        return this.authorityroleDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Authorityrole> queryAllByLimit(int offset, int limit) {
        return this.authorityroleDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param authorityrole 实例对象
     * @return 实例对象
     */
    @Override
    public Authorityrole insert(Authorityrole authorityrole) {
        this.authorityroleDao.insert(authorityrole);
        return authorityrole;
    }

    /**
     * 修改数据
     *
     * @param authorityrole 实例对象
     * @return 实例对象
     */
    @Override
    public Authorityrole update(Authorityrole authorityrole) {
        this.authorityroleDao.update(authorityrole);
        return this.queryById(authorityrole.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.authorityroleDao.deleteById(id) > 0;
    }
}