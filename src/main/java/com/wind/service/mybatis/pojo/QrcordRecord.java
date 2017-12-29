package com.wind.service.mybatis.pojo;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "qrcord_record")
public class QrcordRecord {
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
     * 站点编号
     */
    @Column(name = "station_id")
    private Long stationId;

    /**
     * 经度
     */
    private Double lng;

    /**
     * 纬度
     */
    private Double lat;

    /**
     * 微信用户id
     */
    private String openid;

    /**
     * 记录类型 1-微信扫码 2-支付宝扫码
     */
    private Integer type;

    /**
     * 总价
     */
    private BigDecimal price;

    /**
     * 商户订单编号
     */
    @Column(name = "trade_no")
    private String tradeNo;

    /**
     * 平台交易编号
     */
    @Column(name = "pay_trade_no")
    private String payTradeNo;

    /**
     * 订单创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 支付成功的时间
     */
    private Date time;

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
     * 获取站点编号
     *
     * @return station_id - 站点编号
     */
    public Long getStationId() {
        return stationId;
    }

    /**
     * 设置站点编号
     *
     * @param stationId 站点编号
     */
    public void setStationId(Long stationId) {
        this.stationId = stationId;
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
     * 获取微信用户id
     *
     * @return openid - 微信用户id
     */
    public String getOpenid() {
        return openid;
    }

    /**
     * 设置微信用户id
     *
     * @param openid 微信用户id
     */
    public void setOpenid(String openid) {
        this.openid = openid;
    }

    /**
     * 获取记录类型 1-微信扫码 2-支付宝扫码
     *
     * @return type - 记录类型 1-微信扫码 2-支付宝扫码
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置记录类型 1-微信扫码 2-支付宝扫码
     *
     * @param type 记录类型 1-微信扫码 2-支付宝扫码
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 获取总价
     *
     * @return price - 总价
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * 设置总价
     *
     * @param price 总价
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * 获取商户订单编号
     *
     * @return trade_no - 商户订单编号
     */
    public String getTradeNo() {
        return tradeNo;
    }

    /**
     * 设置商户订单编号
     *
     * @param tradeNo 商户订单编号
     */
    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    /**
     * 获取平台交易编号
     *
     * @return pay_trade_no - 平台交易编号
     */
    public String getPayTradeNo() {
        return payTradeNo;
    }

    /**
     * 设置平台交易编号
     *
     * @param payTradeNo 平台交易编号
     */
    public void setPayTradeNo(String payTradeNo) {
        this.payTradeNo = payTradeNo;
    }

    /**
     * 获取订单创建时间
     *
     * @return create_time - 订单创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置订单创建时间
     *
     * @param createTime 订单创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取支付成功的时间
     *
     * @return time - 支付成功的时间
     */
    public Date getTime() {
        return time;
    }

    /**
     * 设置支付成功的时间
     *
     * @param time 支付成功的时间
     */
    public void setTime(Date time) {
        this.time = time;
    }
}