package com.dwh.backstage.dao;

import com.dwh.backstage.entity.Passenger;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (Passenger)表数据库访问层
 *
 * @author makejava
 * @since 2020-11-19 23:24:35
 */
public interface PassengerDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Passenger queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Passenger> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param passenger 实例对象
     * @return 对象列表
     */
    List<Passenger> queryAll(Passenger passenger);

    /**
     * 新增数据
     *
     * @param passenger 实例对象
     * @return 影响行数
     */
    int insert(Passenger passenger);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Passenger> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Passenger> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Passenger> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<Passenger> entities);

    /**
     * 修改数据
     *
     * @param passenger 实例对象
     * @return 影响行数
     */
    int update(Passenger passenger);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}