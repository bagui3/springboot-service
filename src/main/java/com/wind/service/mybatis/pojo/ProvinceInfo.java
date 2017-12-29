package com.wind.service.mybatis.pojo;

import javax.persistence.*;

@Table(name = "province_info")
public class ProvinceInfo {
    /**
     * 省份编码
     */
    private String provincecode;

    /**
     * 省份名称
     */
    private String namecn;

    /**
     * 国家数字代码
     */
    private String countrycode;

    private Integer sort;

    /**
     * 获取省份编码
     *
     * @return provincecode - 省份编码
     */
    public String getProvincecode() {
        return provincecode;
    }

    /**
     * 设置省份编码
     *
     * @param provincecode 省份编码
     */
    public void setProvincecode(String provincecode) {
        this.provincecode = provincecode;
    }

    /**
     * 获取省份名称
     *
     * @return namecn - 省份名称
     */
    public String getNamecn() {
        return namecn;
    }

    /**
     * 设置省份名称
     *
     * @param namecn 省份名称
     */
    public void setNamecn(String namecn) {
        this.namecn = namecn;
    }

    /**
     * 获取国家数字代码
     *
     * @return countrycode - 国家数字代码
     */
    public String getCountrycode() {
        return countrycode;
    }

    /**
     * 设置国家数字代码
     *
     * @param countrycode 国家数字代码
     */
    public void setCountrycode(String countrycode) {
        this.countrycode = countrycode;
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
}