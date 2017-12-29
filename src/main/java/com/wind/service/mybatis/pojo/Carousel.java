package com.wind.service.mybatis.pojo;

import javax.persistence.*;

public class Carousel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 新闻名称
     */
    private String newsname;

    /**
     * 图片
     */
    private String image;

    /**
     * 地址
     */
    private String url;

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取新闻名称
     *
     * @return newsname - 新闻名称
     */
    public String getNewsname() {
        return newsname;
    }

    /**
     * 设置新闻名称
     *
     * @param newsname 新闻名称
     */
    public void setNewsname(String newsname) {
        this.newsname = newsname;
    }

    /**
     * 获取图片
     *
     * @return image - 图片
     */
    public String getImage() {
        return image;
    }

    /**
     * 设置图片
     *
     * @param image 图片
     */
    public void setImage(String image) {
        this.image = image;
    }

    /**
     * 获取地址
     *
     * @return url - 地址
     */
    public String getUrl() {
        return url;
    }

    /**
     * 设置地址
     *
     * @param url 地址
     */
    public void setUrl(String url) {
        this.url = url;
    }
}