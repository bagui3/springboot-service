package com.wind.service.mybatis.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "terminal_record")
public class TerminalRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 设备编号
     */
    private String device;

    /**
     * 线路编号
     */
    @Column(name = "line_id")
    private Long lineId;

    /**
     * 线路编号
     */
    @Column(name = "station_id")
    private Long stationId;

    /**
     * 设备编号
     */
    @Column(name = "user_id")
    private Long userId;

    /**
     * 设备编号设备编号
     */
    @Column(name = "card_uid")
    private String cardUid;

    /**
     * 设备编号设备编号设备编号
     */
    private Integer type;

    /**
     * 纬度
     */
    private Double lat;

    /**
     * 经度
     */
    private Double lng;

    /**
     * 0-待检票 1-已检票
     */
    private Integer state;

    /**
     * 刷卡时间
     */
    private Date time;

    /**
     * 上传时间
     */
    @Column(name = "create_time")
    private Date createTime;

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
     * 获取设备编号
     *
     * @return device - 设备编号
     */
    public String getDevice() {
        return device;
    }

    /**
     * 设置设备编号
     *
     * @param device 设备编号
     */
    public void setDevice(String device) {
        this.device = device;
    }

    /**
     * 获取线路编号
     *
     * @return line_id - 线路编号
     */
    public Long getLineId() {
        return lineId;
    }

    /**
     * 设置线路编号
     *
     * @param lineId 线路编号
     */
    public void setLineId(Long lineId) {
        this.lineId = lineId;
    }

    /**
     * 获取线路编号
     *
     * @return station_id - 线路编号
     */
    public Long getStationId() {
        return stationId;
    }

    /**
     * 设置线路编号
     *
     * @param stationId 线路编号
     */
    public void setStationId(Long stationId) {
        this.stationId = stationId;
    }

    /**
     * 获取设备编号
     *
     * @return user_id - 设备编号
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 设置设备编号
     *
     * @param userId 设备编号
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 获取设备编号设备编号
     *
     * @return card_uid - 设备编号设备编号
     */
    public String getCardUid() {
        return cardUid;
    }

    /**
     * 设置设备编号设备编号
     *
     * @param cardUid 设备编号设备编号
     */
    public void setCardUid(String cardUid) {
        this.cardUid = cardUid;
    }

    /**
     * 获取设备编号设备编号设备编号
     *
     * @return type - 设备编号设备编号设备编号
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置设备编号设备编号设备编号
     *
     * @param type 设备编号设备编号设备编号
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 获取纬度
     *
     * @return lat - 纬度
     */
    public Double getLat() {
        return lat;
    }

    /**
     * 设置纬度
     *
     * @param lat 纬度
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
     * 获取0-待检票 1-已检票
     *
     * @return state - 0-待检票 1-已检票
     */
    public Integer getState() {
        return state;
    }

    /**
     * 设置0-待检票 1-已检票
     *
     * @param state 0-待检票 1-已检票
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * 获取刷卡时间
     *
     * @return time - 刷卡时间
     */
    public Date getTime() {
        return time;
    }

    /**
     * 设置刷卡时间
     *
     * @param time 刷卡时间
     */
    public void setTime(Date time) {
        this.time = time;
    }

    /**
     * 获取上传时间
     *
     * @return create_time - 上传时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置上传时间
     *
     * @param createTime 上传时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}