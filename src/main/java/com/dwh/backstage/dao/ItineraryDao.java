package com.dwh.backstage.dao;

import com.dwh.backstage.entity.Itinerary;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (Itinerary)表数据库访问层
 *
 * @author makejava
 * @since 2020-11-19 23:24:33
 */
public interface ItineraryDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Itinerary queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Itinerary> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param itinerary 实例对象
     * @return 对象列表
     */
    List<Itinerary> queryAll(Itinerary itinerary);

    /**
     * 新增数据
     *
     * @param itinerary 实例对象
     * @return 影响行数
     */
    int insert(Itinerary itinerary);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Itinerary> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Itinerary> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Itinerary> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<Itinerary> entities);

    /**
     * 修改数据
     *
     * @param itinerary 实例对象
     * @return 影响行数
     */
    int update(Itinerary itinerary);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}