package com.dwh.backstage.service.impl;

import com.dwh.backstage.dao.RoleuserDao;
import com.dwh.backstage.entity.Roleuser;
import com.dwh.backstage.service.RoleuserService;
import com.dwh.backstage.vo.RoleUserVO;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Roleuser)表服务实现类
 *
 * @author makejava
 * @since 2020-11-19 23:24:37
 */
@Service("roleuserService")
public class RoleuserServiceImpl implements RoleuserService {
    @Resource
    private RoleuserDao roleuserDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Roleuser queryById(Integer id) {
        return this.roleuserDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Roleuser> queryAllByLimit(int offset, int limit) {
        return this.roleuserDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param roleuser 实例对象
     * @return 实例对象
     */
    @Override
    public Roleuser insert(Roleuser roleuser) {
        this.roleuserDao.insert(roleuser);
        return roleuser;
    }

    /**
     * 修改数据
     *
     * @param roleuser 实例对象
     * @return 实例对象
     */
    @Override
    public Roleuser update(Roleuser roleuser) {
        this.roleuserDao.update(roleuser);
        return this.queryById(roleuser.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.roleuserDao.deleteById(id) > 0;
    }

    @Override
    public PageInfo<RoleUserVO> findAll(int page, int limit) {
        PageHelper.startPage(page, limit);
        List<RoleUserVO>  roleuserList = roleuserDao.findAll();
        PageInfo<RoleUserVO> result = new PageInfo<RoleUserVO>(roleuserList);
        return result;
    }
}