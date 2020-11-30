package com.dwh.backstage.service.impl;

import com.dwh.backstage.dao.ItineraryDao;
import com.dwh.backstage.entity.Hotel;
import com.dwh.backstage.entity.Itinerary;
import com.dwh.backstage.service.ItineraryService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Itinerary)表服务实现类
 *
 * @author makejava
 * @since 2020-11-19 23:24:34
 */
@Service("itineraryService")
public class ItineraryServiceImpl implements ItineraryService {
    @Resource
    private ItineraryDao itineraryDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Itinerary queryById(Integer id) {
        return this.itineraryDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Itinerary> queryAllByLimit(int offset, int limit) {
        return this.itineraryDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param itinerary 实例对象
     * @return 实例对象
     */
    @Override
    public Itinerary insert(Itinerary itinerary) {
        this.itineraryDao.insert(itinerary);
        return itinerary;
    }

    /**
     * 修改数据
     *
     * @param itinerary 实例对象
     * @return 实例对象
     */
    @Override
    public Itinerary update(Itinerary itinerary) {
        this.itineraryDao.update(itinerary);
        return this.queryById(itinerary.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.itineraryDao.deleteById(id) > 0;
    }

    @Override
    public PageInfo<Itinerary> findAll(int page, int limit) {
        PageHelper.startPage(page, limit);
        List  list = itineraryDao.findAll();
        PageInfo result = new PageInfo(list);
        return result;
    }
}