package com.dwh.backstage.service.impl;

import com.dwh.backstage.dao.HotelcommentDao;
import com.dwh.backstage.entity.Hotelcomment;
import com.dwh.backstage.service.HotelcommentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Hotelcomment)表服务实现类
 *
 * @author makejava
 * @since 2020-11-19 23:24:32
 */
@Service("hotelcommentService")
public class HotelcommentServiceImpl implements HotelcommentService {
    @Resource
    private HotelcommentDao hotelcommentDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Hotelcomment queryById(Integer id) {
        return this.hotelcommentDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Hotelcomment> queryAllByLimit(int offset, int limit) {
        return this.hotelcommentDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param hotelcomment 实例对象
     * @return 实例对象
     */
    @Override
    public Hotelcomment insert(Hotelcomment hotelcomment) {
        this.hotelcommentDao.insert(hotelcomment);
        return hotelcomment;
    }

    /**
     * 修改数据
     *
     * @param hotelcomment 实例对象
     * @return 实例对象
     */
    @Override
    public Hotelcomment update(Hotelcomment hotelcomment) {
        this.hotelcommentDao.update(hotelcomment);
        return this.queryById(hotelcomment.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.hotelcommentDao.deleteById(id) > 0;
    }
}