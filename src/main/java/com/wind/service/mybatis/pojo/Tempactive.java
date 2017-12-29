package com.wind.service.mybatis.pojo;

import javax.persistence.*;

public class Tempactive {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * Log图片
     */
    private String logoimg;

    /**
     * 活动图片
     */
    private String activeimg;

    /**
     * url
     */
    private String url;

    /**
     * 状态
     */
    private String state;

    /**
     * 数量
     */
    private Integer count;

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
     * 获取Log图片
     *
     * @return logoimg - Log图片
     */
    public String getLogoimg() {
        return logoimg;
    }

    /**
     * 设置Log图片
     *
     * @param logoimg Log图片
     */
    public void setLogoimg(String logoimg) {
        this.logoimg = logoimg;
    }

    /**
     * 获取活动图片
     *
     * @return activeimg - 活动图片
     */
    public String getActiveimg() {
        return activeimg;
    }

    /**
     * 设置活动图片
     *
     * @param activeimg 活动图片
     */
    public void setActiveimg(String activeimg) {
        this.activeimg = activeimg;
    }

    /**
     * 获取url
     *
     * @return url - url
     */
    public String getUrl() {
        return url;
    }

    /**
     * 设置url
     *
     * @param url url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * 获取状态
     *
     * @return state - 状态
     */
    public String getState() {
        return state;
    }

    /**
     * 设置状态
     *
     * @param state 状态
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * 获取数量
     *
     * @return count - 数量
     */
    public Integer getCount() {
        return count;
    }

    /**
     * 设置数量
     *
     * @param count 数量
     */
    public void setCount(Integer count) {
        this.count = count;
    }
}