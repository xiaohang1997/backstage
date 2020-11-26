package com.dwh.backstage.service.impl;

import com.dwh.backstage.dao.SceneDao;
import com.dwh.backstage.entity.Scene;
import com.dwh.backstage.service.SceneService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Scene)表服务实现类
 *
 * @author makejava
 * @since 2020-11-19 23:24:44
 */
@Service("sceneService")
public class SceneServiceImpl implements SceneService {
    @Resource
    private SceneDao sceneDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Scene queryById(Integer id) {
        return this.sceneDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Scene> queryAllByLimit(int offset, int limit) {
        return this.sceneDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param scene 实例对象
     * @return 实例对象
     */
    @Override
    public Scene insert(Scene scene) {
        this.sceneDao.insert(scene);
        return scene;
    }

    /**
     * 修改数据
     *
     * @param scene 实例对象
     * @return 实例对象
     */
    @Override
    public Scene update(Scene scene) {
        this.sceneDao.update(scene);
        return this.queryById(scene.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.sceneDao.deleteById(id) > 0;
    }
}