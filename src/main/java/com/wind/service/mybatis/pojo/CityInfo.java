package com.wind.service.mybatis.pojo;

import javax.persistence.*;

@Table(name = "city_info")
public class CityInfo {
    /**
     * 城市码
     */
    private Integer citycode;

    private Integer sort;

    /**
     * 省份码
     */
    private Integer provincecode;

    /**
     * 城市名称
     */
    private String namecn;

    /**
     * 获取城市码
     *
     * @return citycode - 城市码
     */
    public Integer getCitycode() {
        return citycode;
    }

    /**
     * 设置城市码
     *
     * @param citycode 城市码
     */
    public void setCitycode(Integer citycode) {
        this.citycode = citycode;
    }

    /**
     * @return sort
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * @param sort
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /**
     * 获取省份码
     *
     * @return provincecode - 省份码
     */
    public Integer getProvincecode() {
        return provincecode;
    }

    /**
     * 设置省份码
     *
     * @param provincecode 省份码
     */
    public void setProvincecode(Integer provincecode) {
        this.provincecode = provincecode;
    }

    /**
     * 获取城市名称
     *
     * @return namecn - 城市名称
     */
    public String getNamecn() {
        return namecn;
    }

    /**
     * 设置城市名称
     *
     * @param namecn 城市名称
     */
    public void setNamecn(String namecn) {
        this.namecn = namecn;
    }
}