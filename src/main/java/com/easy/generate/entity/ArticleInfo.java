package com.easy.generate.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (ArticleInfo)实体类
 *
 * @author makejava
 * @since 2022-12-07 16:17:06
 */
public class ArticleInfo implements Serializable {
    private static final long serialVersionUID = -75861248966099549L;
    
    private Long id;
    
    private Date articleCreateDate;
    
    private String author;
    
    private String content;
    
    private Date createDate;
    
    private String source;
    
    private String title;
    
    private String url;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getArticleCreateDate() {
        return articleCreateDate;
    }

    public void setArticleCreateDate(Date articleCreateDate) {
        this.articleCreateDate = articleCreateDate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}

