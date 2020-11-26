package com.dwh.backstage.service.impl;

import com.dwh.backstage.dao.HotelDao;
import com.dwh.backstage.entity.Hotel;
import com.dwh.backstage.service.HotelService;
import com.dwh.backstage.vo.RoleUserVO;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Hotel)表服务实现类
 *
 * @author makejava
 * @since 2020-11-19 23:24:31
 */
@Service("hotelService")
public class HotelServiceImpl implements HotelService {
    @Resource
    private HotelDao hotelDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Hotel queryById(Integer id) {
        return this.hotelDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Hotel> queryAllByLimit(int offset, int limit) {
        return this.hotelDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param hotel 实例对象
     * @return 实例对象
     */
    @Override
    public Hotel insert(Hotel hotel) {
        this.hotelDao.insert(hotel);
        return hotel;
    }

    /**
     * 修改数据
     *
     * @param hotel 实例对象
     * @return 实例对象
     */
    @Override
    public Hotel update(Hotel hotel) {
        this.hotelDao.update(hotel);
        return this.queryById(hotel.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.hotelDao.deleteById(id) > 0;
    }

    @Override
    public PageInfo<Hotel> findAll(int page, int limit) {
        PageHelper.startPage(page, limit);
        List  list = hotelDao.findAll();
        PageInfo result = new PageInfo(list);
        return result;
    }
}