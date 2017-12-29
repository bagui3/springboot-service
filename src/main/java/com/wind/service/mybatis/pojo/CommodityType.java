package com.wind.service.mybatis.pojo;

import javax.persistence.*;

@Table(name = "commodity_type")
public class CommodityType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 商品类型名
     */
    private String name;

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
     * 获取商品类型名
     *
     * @return name - 商品类型名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置商品类型名
     *
     * @param name 商品类型名
     */
    public void setName(String name) {
        this.name = name;
    }
}