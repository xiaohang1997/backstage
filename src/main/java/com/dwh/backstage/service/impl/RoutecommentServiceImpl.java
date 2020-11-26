package com.dwh.backstage.service.impl;

import com.dwh.backstage.dao.RoutecommentDao;
import com.dwh.backstage.entity.Routecomment;
import com.dwh.backstage.service.RoutecommentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Routecomment)表服务实现类
 *
 * @author makejava
 * @since 2020-11-19 23:24:41
 */
@Service("routecommentService")
public class RoutecommentServiceImpl implements RoutecommentService {
    @Resource
    private RoutecommentDao routecommentDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Routecomment queryById(Integer id) {
        return this.routecommentDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Routecomment> queryAllByLimit(int offset, int limit) {
        return this.routecommentDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param routecomment 实例对象
     * @return 实例对象
     */
    @Override
    public Routecomment insert(Routecomment routecomment) {
        this.routecommentDao.insert(routecomment);
        return routecomment;
    }

    /**
     * 修改数据
     *
     * @param routecomment 实例对象
     * @return 实例对象
     */
    @Override
    public Routecomment update(Routecomment routecomment) {
        this.routecommentDao.update(routecomment);
        return this.queryById(routecomment.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.routecommentDao.deleteById(id) > 0;
    }
}