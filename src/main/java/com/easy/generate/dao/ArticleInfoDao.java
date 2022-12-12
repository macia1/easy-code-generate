package com.easy.generate.dao;

import com.easy.generate.entity.ArticleInfo;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * (ArticleInfo)表数据库访问层
 *
 * @author makejava
 * @since 2022-12-07 16:17:05
 */
public interface ArticleInfoDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    ArticleInfo queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param articleInfo 查询条件
     * @param pageable         分页对象
     * @return 对象列表
     */
    List<ArticleInfo> queryAllByLimit(ArticleInfo articleInfo, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param articleInfo 查询条件
     * @return 总行数
     */
    long count(ArticleInfo articleInfo);

    /**
     * 新增数据
     *
     * @param articleInfo 实例对象
     * @return 影响行数
     */
    int insert(ArticleInfo articleInfo);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<ArticleInfo> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<ArticleInfo> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<ArticleInfo> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<ArticleInfo> entities);

    /**
     * 修改数据
     *
     * @param articleInfo 实例对象
     * @return 影响行数
     */
    int update(ArticleInfo articleInfo);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}

