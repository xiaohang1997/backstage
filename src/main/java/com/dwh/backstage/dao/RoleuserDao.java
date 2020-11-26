package com.dwh.backstage.dao;

import com.dwh.backstage.entity.Roleuser;
import com.dwh.backstage.vo.RoleUserVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (Roleuser)表数据库访问层
 *
 * @author makejava
 * @since 2020-11-19 23:24:37
 */
public interface RoleuserDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Roleuser queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Roleuser> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param roleuser 实例对象
     * @return 对象列表
     */
    List<Roleuser> queryAll(Roleuser roleuser);

    /**
     * 新增数据
     *
     * @param roleuser 实例对象
     * @return 影响行数
     */
    int insert(Roleuser roleuser);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Roleuser> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Roleuser> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Roleuser> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<Roleuser> entities);

    /**
     * 修改数据
     *
     * @param roleuser 实例对象
     * @return 影响行数
     */
    int update(Roleuser roleuser);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

    List<RoleUserVO> findAll();

}