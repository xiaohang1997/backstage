package com.dwh.backstage.service.impl;

import com.dwh.backstage.dao.RoutetypeDao;
import com.dwh.backstage.entity.Routetype;
import com.dwh.backstage.service.RoutetypeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Routetype)表服务实现类
 *
 * @author makejava
 * @since 2020-11-19 23:24:41
 */
@Service("routetypeService")
public class RoutetypeServiceImpl implements RoutetypeService {
    @Resource
    private RoutetypeDao routetypeDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Routetype queryById(Integer id) {
        return this.routetypeDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Routetype> queryAllByLimit(int offset, int limit) {
        return this.routetypeDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param routetype 实例对象
     * @return 实例对象
     */
    @Override
    public Routetype insert(Routetype routetype) {
        this.routetypeDao.insert(routetype);
        return routetype;
    }

    /**
     * 修改数据
     *
     * @param routetype 实例对象
     * @return 实例对象
     */
    @Override
    public Routetype update(Routetype routetype) {
        this.routetypeDao.update(routetype);
        return this.queryById(routetype.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.routetypeDao.deleteById(id) > 0;
    }
}