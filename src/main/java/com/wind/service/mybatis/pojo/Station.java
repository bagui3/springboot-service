package com.wind.service.mybatis.pojo;

import java.math.BigDecimal;
import javax.persistence.*;

public class Station {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 站点名
     */
    private String name;

    /**
     * 维度
     */
    private Double lat;

    /**
     * 经度
     */
    private Double lng;

    /**
     * 注释
     */
    private String annotation;

    /**
     * 区间收费价格
     */
    private BigDecimal price;

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
     * 获取站点名
     *
     * @return name - 站点名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置站点名
     *
     * @param name 站点名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取维度
     *
     * @return lat - 维度
     */
    public Double getLat() {
        return lat;
    }

    /**
     * 设置维度
     *
     * @param lat 维度
     */
    public void setLat(Double lat) {
        this.lat = lat;
    }

    /**
     * 获取经度
     *
     * @return lng - 经度
     */
    public Double getLng() {
        return lng;
    }

    /**
     * 设置经度
     *
     * @param lng 经度
     */
    public void setLng(Double lng) {
        this.lng = lng;
    }

    /**
     * 获取注释
     *
     * @return annotation - 注释
     */
    public String getAnnotation() {
        return annotation;
    }

    /**
     * 设置注释
     *
     * @param annotation 注释
     */
    public void setAnnotation(String annotation) {
        this.annotation = annotation;
    }

    /**
     * 获取区间收费价格
     *
     * @return price - 区间收费价格
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * 设置区间收费价格
     *
     * @param price 区间收费价格
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}