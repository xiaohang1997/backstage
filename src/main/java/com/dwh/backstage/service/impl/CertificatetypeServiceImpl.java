package com.dwh.backstage.service.impl;

import com.dwh.backstage.dao.CertificatetypeDao;
import com.dwh.backstage.entity.Certificatetype;
import com.dwh.backstage.service.CertificatetypeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Certificatetype)表服务实现类
 *
 * @author makejava
 * @since 2020-11-19 23:24:30
 */
@Service("certificatetypeService")
public class CertificatetypeServiceImpl implements CertificatetypeService {
    @Resource
    private CertificatetypeDao certificatetypeDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Certificatetype queryById(Integer id) {
        return this.certificatetypeDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Certificatetype> queryAllByLimit(int offset, int limit) {
        return this.certificatetypeDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param certificatetype 实例对象
     * @return 实例对象
     */
    @Override
    public Certificatetype insert(Certificatetype certificatetype) {
        this.certificatetypeDao.insert(certificatetype);
        return certificatetype;
    }

    /**
     * 修改数据
     *
     * @param certificatetype 实例对象
     * @return 实例对象
     */
    @Override
    public Certificatetype update(Certificatetype certificatetype) {
        this.certificatetypeDao.update(certificatetype);
        return this.queryById(certificatetype.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.certificatetypeDao.deleteById(id) > 0;
    }
}