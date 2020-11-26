package com.dwh.backstage.dao;

import com.dwh.backstage.entity.Scene;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (Scene)表数据库访问层
 *
 * @author makejava
 * @since 2020-11-19 23:24:43
 */
public interface SceneDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Scene queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Scene> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param scene 实例对象
     * @return 对象列表
     */
    List<Scene> queryAll(Scene scene);

    /**
     * 新增数据
     *
     * @param scene 实例对象
     * @return 影响行数
     */
    int insert(Scene scene);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Scene> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Scene> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Scene> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<Scene> entities);

    /**
     * 修改数据
     *
     * @param scene 实例对象
     * @return 影响行数
     */
    int update(Scene scene);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}