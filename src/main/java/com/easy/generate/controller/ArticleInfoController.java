package com.easy.generate.controller;

import com.easy.generate.entity.ArticleInfo;
import com.easy.generate.service.ArticleInfoService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (ArticleInfo)表控制层
 *
 * @author makejava
 * @since 2022-12-07 16:17:04
 */
@RestController
@RequestMapping("articleInfo")
public class ArticleInfoController {
    /**
     * 服务对象
     */
    @Resource
    private ArticleInfoService articleInfoService;

    /**
     * 分页查询
     *
     * @param articleInfo 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @PostMapping("/page")
    public ResponseEntity<Page<ArticleInfo>> queryByPage(@RequestBody ArticleInfo articleInfo) {
        PageRequest pageRequest = PageRequest.of(1,10);
        return ResponseEntity.ok(this.articleInfoService.queryByPage(articleInfo, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<ArticleInfo> queryById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(this.articleInfoService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param articleInfo 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<ArticleInfo> add(@RequestBody ArticleInfo articleInfo) {
        return ResponseEntity.ok(this.articleInfoService.insert(articleInfo));
    }

    /**
     * 编辑数据
     *
     * @param articleInfo 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<ArticleInfo> edit(@RequestBody ArticleInfo articleInfo) {
        return ResponseEntity.ok(this.articleInfoService.update(articleInfo));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping("{id}")
    public ResponseEntity<Boolean> deleteById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(this.articleInfoService.deleteById(id));
    }

}

