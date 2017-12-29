package com.wind.service.mybatis.pojo;

import javax.persistence.*;

@Table(name = "activity_type")
public class ActivityType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 分类名称
     */
    private String name;

    /**
     * 版本类型（三级域名）
     */
    private String site;

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
     * 获取分类名称
     *
     * @return name - 分类名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置分类名称
     *
     * @param name 分类名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取版本类型（三级域名）
     *
     * @return site - 版本类型（三级域名）
     */
    public String getSite() {
        return site;
    }

    /**
     * 设置版本类型（三级域名）
     *
     * @param site 版本类型（三级域名）
     */
    public void setSite(String site) {
        this.site = site;
    }
}