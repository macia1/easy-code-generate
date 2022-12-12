package com.easy.generate.service.impl;

import com.easy.generate.entity.ArticleInfo;
import com.easy.generate.dao.ArticleInfoDao;
import com.easy.generate.service.ArticleInfoService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (ArticleInfo)表服务实现类
 *
 * @author makejava
 * @since 2022-12-07 16:17:09
 */
@Service("articleInfoService")
public class ArticleInfoServiceImpl implements ArticleInfoService {
    @Resource
    private ArticleInfoDao articleInfoDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public ArticleInfo queryById(Long id) {
        return this.articleInfoDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param articleInfo 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<ArticleInfo> queryByPage(ArticleInfo articleInfo, PageRequest pageRequest) {
        long total = this.articleInfoDao.count(articleInfo);
        return new PageImpl<>(this.articleInfoDao.queryAllByLimit(articleInfo, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param articleInfo 实例对象
     * @return 实例对象
     */
    @Override
    public ArticleInfo insert(ArticleInfo articleInfo) {
        this.articleInfoDao.insert(articleInfo);
        return articleInfo;
    }

    /**
     * 修改数据
     *
     * @param articleInfo 实例对象
     * @return 实例对象
     */
    @Override
    public ArticleInfo update(ArticleInfo articleInfo) {
        this.articleInfoDao.update(articleInfo);
        return this.queryById(articleInfo.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.articleInfoDao.deleteById(id) > 0;
    }
}
