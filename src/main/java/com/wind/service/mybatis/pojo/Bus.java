package com.wind.service.mybatis.pojo;

import java.util.Date;
import javax.persistence.*;

public class Bus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 名字
     */
    private String name;

    /**
     * 用户id
     */
    @Column(name = "user_id")
    private Long userId;

    /**
     * 线路id
     */
    @Column(name = "line_id")
    private Long lineId;

    /**
     * 维度
     */
    private Double lat;

    /**
     * 经度
     */
    private Double lng;

    /**
     * 活动时间
     */
    @Column(name = "active_time")
    private Date activeTime;

    /**
     * 设备
     */
    private String device;

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
     * 获取名字
     *
     * @return name - 名字
     */
    public String getName() {
        return name;
    }

    /**
     * 设置名字
     *
     * @param name 名字
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取用户id
     *
     * @return user_id - 用户id
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 设置用户id
     *
     * @param userId 用户id
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 获取线路id
     *
     * @return line_id - 线路id
     */
    public Long getLineId() {
        return lineId;
    }

    /**
     * 设置线路id
     *
     * @param lineId 线路id
     */
    public void setLineId(Long lineId) {
        this.lineId = lineId;
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
     * 获取活动时间
     *
     * @return active_time - 活动时间
     */
    public Date getActiveTime() {
        return activeTime;
    }

    /**
     * 设置活动时间
     *
     * @param activeTime 活动时间
     */
    public void setActiveTime(Date activeTime) {
        this.activeTime = activeTime;
    }

    /**
     * 获取设备
     *
     * @return device - 设备
     */
    public String getDevice() {
        return device;
    }

    /**
     * 设置设备
     *
     * @param device 设备
     */
    public void setDevice(String device) {
        this.device = device;
    }
}