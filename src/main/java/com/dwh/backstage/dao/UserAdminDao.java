package com.dwh.backstage.dao;

import com.dwh.backstage.entity.UserAdmin;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (UserAdmin)表数据库访问层
 *
 * @author makejava
 * @since 2020-11-30 06:25:12
 */
public interface UserAdminDao {

    /**
     * 通过ID查询单条数据
     *
     * @param name 主键
     * @return 实例对象
     */
    UserAdmin queryById(String name);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<UserAdmin> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param userAdmin 实例对象
     * @return 对象列表
     */
    List<UserAdmin> queryAll(UserAdmin userAdmin);

    /**
     * 新增数据
     *
     * @param userAdmin 实例对象
     * @return 影响行数
     */
    int insert(UserAdmin userAdmin);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<UserAdmin> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<UserAdmin> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<UserAdmin> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<UserAdmin> entities);

    /**
     * 修改数据
     *
     * @param userAdmin 实例对象
     * @return 影响行数
     */
    int update(UserAdmin userAdmin);

    /**
     * 通过主键删除数据
     *
     * @param name 主键
     * @return 影响行数
     */
    int deleteById(String name);

}