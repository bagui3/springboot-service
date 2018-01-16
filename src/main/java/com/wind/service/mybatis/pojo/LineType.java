package com.wind.service.mybatis.pojo;

import javax.persistence.*;

@Table(name = "line_type")
public class LineType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 如：学校名、社区名
     */
    private String name;

    /**
     * 学校或线路的图标
     */
    private String img;

    /**
     * 简介
     */
    private String synopsis;

    /**
     * 类型，如校园专线、社区专线
     */
    private String type;

    /**
     * 站点前缀（用于区分企业版和普通版）
     */
    private String site;

    /**
     * 0-尚未开通 1-敬请期待 2-已开通
     */
    private Integer state;

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
     * 获取如：学校名、社区名
     *
     * @return name - 如：学校名、社区名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置如：学校名、社区名
     *
     * @param name 如：学校名、社区名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取学校或线路的图标
     *
     * @return img - 学校或线路的图标
     */
    public String getImg() {
        return img;
    }

    /**
     * 设置学校或线路的图标
     *
     * @param img 学校或线路的图标
     */
    public void setImg(String img) {
        this.img = img;
    }

    /**
     * 获取简介
     *
     * @return synopsis - 简介
     */
    public String getSynopsis() {
        return synopsis;
    }

    /**
     * 设置简介
     *
     * @param synopsis 简介
     */
    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    /**
     * 获取类型，如校园专线、社区专线
     *
     * @return type - 类型，如校园专线、社区专线
     */
    public String getType() {
        return type;
    }

    /**
     * 设置类型，如校园专线、社区专线
     *
     * @param type 类型，如校园专线、社区专线
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 获取站点前缀（用于区分企业版和普通版）
     *
     * @return site - 站点前缀（用于区分企业版和普通版）
     */
    public String getSite() {
        return site;
    }

    /**
     * 设置站点前缀（用于区分企业版和普通版）
     *
     * @param site 站点前缀（用于区分企业版和普通版）
     */
    public void setSite(String site) {
        this.site = site;
    }

    /**
     * 获取0-尚未开通 1-敬请期待 2-已开通
     *
     * @return state - 0-尚未开通 1-敬请期待 2-已开通
     */
    public Integer getState() {
        return state;
    }

    /**
     * 设置0-尚未开通 1-敬请期待 2-已开通
     *
     * @param state 0-尚未开通 1-敬请期待 2-已开通
     */
    public void setState(Integer state) {
        this.state = state;
    }
}