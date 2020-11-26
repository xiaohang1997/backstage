package com.dwh.backstage.service.impl;

import com.dwh.backstage.dao.PassengerDao;
import com.dwh.backstage.entity.Passenger;
import com.dwh.backstage.service.PassengerService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Passenger)表服务实现类
 *
 * @author makejava
 * @since 2020-11-19 23:24:35
 */
@Service("passengerService")
public class PassengerServiceImpl implements PassengerService {
    @Resource
    private PassengerDao passengerDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Passenger queryById(Integer id) {
        return this.passengerDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Passenger> queryAllByLimit(int offset, int limit) {
        return this.passengerDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param passenger 实例对象
     * @return 实例对象
     */
    @Override
    public Passenger insert(Passenger passenger) {
        this.passengerDao.insert(passenger);
        return passenger;
    }

    /**
     * 修改数据
     *
     * @param passenger 实例对象
     * @return 实例对象
     */
    @Override
    public Passenger update(Passenger passenger) {
        this.passengerDao.update(passenger);
        return this.queryById(passenger.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.passengerDao.deleteById(id) > 0;
    }
}