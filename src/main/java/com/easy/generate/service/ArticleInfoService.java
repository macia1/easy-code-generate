package com.easy.generate.service;

import com.easy.generate.entity.ArticleInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (ArticleInfo)表服务接口
 *
 * @author makejava
 * @since 2022-12-07 16:17:08
 */
public interface ArticleInfoService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    ArticleInfo queryById(Long id);

    /**
     * 分页查询
     *
     * @param articleInfo 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<ArticleInfo> queryByPage(ArticleInfo articleInfo, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param articleInfo 实例对象
     * @return 实例对象
     */
    ArticleInfo insert(ArticleInfo articleInfo);

    /**
     * 修改数据
     *
     * @param articleInfo 实例对象
     * @return 实例对象
     */
    ArticleInfo update(ArticleInfo articleInfo);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}
