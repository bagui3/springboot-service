package com.wind.service.mybatis.pojo;

import javax.persistence.*;

@Table(name = "line_select_type")
public class LineSelectType {
    /**
     * id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 线路类型
     */
    private String typename;

    /**
     * 版本类型（三级域名）
     */
    private String site;

    /**
     * 获取id
     *
     * @return id - id
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置id
     *
     * @param id id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取线路类型
     *
     * @return typename - 线路类型
     */
    public String getTypename() {
        return typename;
    }

    /**
     * 设置线路类型
     *
     * @param typename 线路类型
     */
    public void setTypename(String typename) {
        this.typename = typename;
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