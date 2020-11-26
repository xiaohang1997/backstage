package com.dwh.backstage.service.impl;

import com.dwh.backstage.dao.HoteltypeDao;
import com.dwh.backstage.entity.Hoteltype;
import com.dwh.backstage.service.HoteltypeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Hoteltype)表服务实现类
 *
 * @author makejava
 * @since 2020-11-19 23:24:33
 */
@Service("hoteltypeService")
public class HoteltypeServiceImpl implements HoteltypeService {
    @Resource
    private HoteltypeDao hoteltypeDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Hoteltype queryById(Integer id) {
        return this.hoteltypeDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Hoteltype> queryAllByLimit(int offset, int limit) {
        return this.hoteltypeDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param hoteltype 实例对象
     * @return 实例对象
     */
    @Override
    public Hoteltype insert(Hoteltype hoteltype) {
        this.hoteltypeDao.insert(hoteltype);
        return hoteltype;
    }

    /**
     * 修改数据
     *
     * @param hoteltype 实例对象
     * @return 实例对象
     */
    @Override
    public Hoteltype update(Hoteltype hoteltype) {
        this.hoteltypeDao.update(hoteltype);
        return this.queryById(hoteltype.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.hoteltypeDao.deleteById(id) > 0;
    }
}