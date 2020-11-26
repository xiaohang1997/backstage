package com.dwh.backstage.dao;

import com.dwh.backstage.entity.Routecomment;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (Routecomment)表数据库访问层
 *
 * @author makejava
 * @since 2020-11-19 23:24:40
 */
public interface RoutecommentDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Routecomment queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Routecomment> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param routecomment 实例对象
     * @return 对象列表
     */
    List<Routecomment> queryAll(Routecomment routecomment);

    /**
     * 新增数据
     *
     * @param routecomment 实例对象
     * @return 影响行数
     */
    int insert(Routecomment routecomment);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Routecomment> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Routecomment> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Routecomment> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<Routecomment> entities);

    /**
     * 修改数据
     *
     * @param routecomment 实例对象
     * @return 影响行数
     */
    int update(Routecomment routecomment);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}