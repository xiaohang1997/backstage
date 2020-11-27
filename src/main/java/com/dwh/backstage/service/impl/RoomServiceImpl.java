package com.dwh.backstage.service.impl;

import com.dwh.backstage.dao.RoomDao;
import com.dwh.backstage.entity.Room;
import com.dwh.backstage.service.RoomService;
import com.dwh.backstage.vo.RoleUserVO;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Room)表服务实现类
 *
 * @author makejava
 * @since 2020-11-19 23:24:39
 */
@Service("roomService")
public class RoomServiceImpl implements RoomService {
    @Resource
    private RoomDao roomDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Room queryById(Integer id) {
        return this.roomDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Room> queryAllByLimit(int offset, int limit) {
        return this.roomDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param room 实例对象
     * @return 实例对象
     */
    @Override
    public Room insert(Room room) {
        this.roomDao.insert(room);
        return room;
    }

    /**
     * 修改数据
     *
     * @param room 实例对象
     * @return 实例对象
     */
    @Override
    public Room update(Room room) {
        this.roomDao.update(room);
        return this.queryById(room.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.roomDao.deleteById(id) > 0;
    }

    @Override
    public PageInfo<Room> findAll(int page, int limit) {
        PageHelper.startPage(page, limit);
        List<Room>  list = roomDao.findAll();
        PageInfo<Room> result = new PageInfo<>(list);
        return result;
    }
}