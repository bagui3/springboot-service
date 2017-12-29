package com.wind.service.mybatis.pojo;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

public class Line {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 线路名
     */
    private String name;

    /**
     * 起点
     */
    private String start;

    /**
     * 终点
     */
    private String end;

    /**
     * 站点经纬度json列表，用于在地图上绘运行线路
     */
    private String latlng;

    /**
     * 积分
     */
    private Integer price;

    /**
     * 价钱
     */
    private BigDecimal money;

    /**
     * 发车的时间表
     */
    @Column(name = "depart_times")
    private String departTimes;

    /**
     * 注释
     */
    private String annotation;

    /**
     * 城市名
     */
    @Column(name = "city_name")
    private String cityName;

    /**
     * 属性名
     */
    @Column(name = "prop_name")
    private String propName;

    /**
     * 开始时间
     */
    @Column(name = "start_time")
    private Date startTime;

    /**
     * 结束时间
     */
    @Column(name = "end_time")
    private Date endTime;

    /**
     * 学校和社区的类型id
     */
    @Column(name = "line_type_id")
    private Long lineTypeId;

    /**
     * 站点前缀（用于区分企业版和普通版）
     */
    private String site;

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
     * 获取线路名
     *
     * @return name - 线路名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置线路名
     *
     * @param name 线路名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取起点
     *
     * @return start - 起点
     */
    public String getStart() {
        return start;
    }

    /**
     * 设置起点
     *
     * @param start 起点
     */
    public void setStart(String start) {
        this.start = start;
    }

    /**
     * 获取终点
     *
     * @return end - 终点
     */
    public String getEnd() {
        return end;
    }

    /**
     * 设置终点
     *
     * @param end 终点
     */
    public void setEnd(String end) {
        this.end = end;
    }

    /**
     * 获取站点经纬度json列表，用于在地图上绘运行线路
     *
     * @return latlng - 站点经纬度json列表，用于在地图上绘运行线路
     */
    public String getLatlng() {
        return latlng;
    }

    /**
     * 设置站点经纬度json列表，用于在地图上绘运行线路
     *
     * @param latlng 站点经纬度json列表，用于在地图上绘运行线路
     */
    public void setLatlng(String latlng) {
        this.latlng = latlng;
    }

    /**
     * 获取积分
     *
     * @return price - 积分
     */
    public Integer getPrice() {
        return price;
    }

    /**
     * 设置积分
     *
     * @param price 积分
     */
    public void setPrice(Integer price) {
        this.price = price;
    }

    /**
     * 获取价钱
     *
     * @return money - 价钱
     */
    public BigDecimal getMoney() {
        return money;
    }

    /**
     * 设置价钱
     *
     * @param money 价钱
     */
    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    /**
     * 获取发车的时间表
     *
     * @return depart_times - 发车的时间表
     */
    public String getDepartTimes() {
        return departTimes;
    }

    /**
     * 设置发车的时间表
     *
     * @param departTimes 发车的时间表
     */
    public void setDepartTimes(String departTimes) {
        this.departTimes = departTimes;
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
     * 获取城市名
     *
     * @return city_name - 城市名
     */
    public String getCityName() {
        return cityName;
    }

    /**
     * 设置城市名
     *
     * @param cityName 城市名
     */
    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    /**
     * 获取属性名
     *
     * @return prop_name - 属性名
     */
    public String getPropName() {
        return propName;
    }

    /**
     * 设置属性名
     *
     * @param propName 属性名
     */
    public void setPropName(String propName) {
        this.propName = propName;
    }

    /**
     * 获取开始时间
     *
     * @return start_time - 开始时间
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * 设置开始时间
     *
     * @param startTime 开始时间
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * 获取结束时间
     *
     * @return end_time - 结束时间
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * 设置结束时间
     *
     * @param endTime 结束时间
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * 获取学校和社区的类型id
     *
     * @return line_type_id - 学校和社区的类型id
     */
    public Long getLineTypeId() {
        return lineTypeId;
    }

    /**
     * 设置学校和社区的类型id
     *
     * @param lineTypeId 学校和社区的类型id
     */
    public void setLineTypeId(Long lineTypeId) {
        this.lineTypeId = lineTypeId;
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
     * @return state
     */
    public Integer getState() {
        return state;
    }

    /**
     * @param state
     */
    public void setState(Integer state) {
        this.state = state;
    }
}