package com.wind.service.mybatis.pojo;

import java.math.BigDecimal;
import javax.persistence.*;

public class Activity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 活动标题
     */
    private String title;

    /**
     * 活动图片
     */
    private String image;

    /**
     * 活动详情
     */
    private String detail;

    /**
     * 人数下限
     */
    @Column(name = "lower_limit")
    private Integer lowerLimit;

    /**
     * 人数上限
     */
    @Column(name = "upper_limit")
    private Integer upperLimit;

    /**
     * 价格
     */
    private BigDecimal price;

    /**
     * 积分
     */
    private Integer integral;

    /**
     * 开始时间
     */
    private String startime;

    /**
     * 结束时间
     */
    private String endtime;

    /**
     * 当前报名人数
     */
    @Column(name = "number_of_people")
    private Integer numberOfPeople;

    /**
     * 活动详情图片
     */
    @Column(name = "detail_image")
    private String detailImage;

    /**
     * 活动类型：1为红包(例如 点击领取20积分的红包等) 2为普通活动 3为进入网页的活动(例如 笑傲浆糊活动等) 4为临时活动(例如 千万积分活动、东湖绿道活动等)
     */
    private Integer type;

    /**
     * 付款的形式 1积分付款 2微信或支付宝付款
     */
    @Column(name = "pay_type")
    private Integer payType;

    /**
     * 活动未开始输入“敬请期待”，活动开始输入“50积分/人”或者“10元/人”
     */
    @Column(name = "pay_status")
    private String payStatus;

    /**
     * 活动类型(例如 团建、亲子游等)
     */
    private String genre;

    /**
     * 站点前缀（用于区分企业版和普通版）
     */
    private String site;

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
     * 获取活动标题
     *
     * @return title - 活动标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置活动标题
     *
     * @param title 活动标题
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 获取活动图片
     *
     * @return image - 活动图片
     */
    public String getImage() {
        return image;
    }

    /**
     * 设置活动图片
     *
     * @param image 活动图片
     */
    public void setImage(String image) {
        this.image = image;
    }

    /**
     * 获取活动详情
     *
     * @return detail - 活动详情
     */
    public String getDetail() {
        return detail;
    }

    /**
     * 设置活动详情
     *
     * @param detail 活动详情
     */
    public void setDetail(String detail) {
        this.detail = detail;
    }

    /**
     * 获取人数下限
     *
     * @return lower_limit - 人数下限
     */
    public Integer getLowerLimit() {
        return lowerLimit;
    }

    /**
     * 设置人数下限
     *
     * @param lowerLimit 人数下限
     */
    public void setLowerLimit(Integer lowerLimit) {
        this.lowerLimit = lowerLimit;
    }

    /**
     * 获取人数上限
     *
     * @return upper_limit - 人数上限
     */
    public Integer getUpperLimit() {
        return upperLimit;
    }

    /**
     * 设置人数上限
     *
     * @param upperLimit 人数上限
     */
    public void setUpperLimit(Integer upperLimit) {
        this.upperLimit = upperLimit;
    }

    /**
     * 获取价格
     *
     * @return price - 价格
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * 设置价格
     *
     * @param price 价格
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * 获取积分
     *
     * @return integral - 积分
     */
    public Integer getIntegral() {
        return integral;
    }

    /**
     * 设置积分
     *
     * @param integral 积分
     */
    public void setIntegral(Integer integral) {
        this.integral = integral;
    }

    /**
     * 获取开始时间
     *
     * @return startime - 开始时间
     */
    public String getStartime() {
        return startime;
    }

    /**
     * 设置开始时间
     *
     * @param startime 开始时间
     */
    public void setStartime(String startime) {
        this.startime = startime;
    }

    /**
     * 获取结束时间
     *
     * @return endtime - 结束时间
     */
    public String getEndtime() {
        return endtime;
    }

    /**
     * 设置结束时间
     *
     * @param endtime 结束时间
     */
    public void setEndtime(String endtime) {
        this.endtime = endtime;
    }

    /**
     * 获取当前报名人数
     *
     * @return number_of_people - 当前报名人数
     */
    public Integer getNumberOfPeople() {
        return numberOfPeople;
    }

    /**
     * 设置当前报名人数
     *
     * @param numberOfPeople 当前报名人数
     */
    public void setNumberOfPeople(Integer numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }

    /**
     * 获取活动详情图片
     *
     * @return detail_image - 活动详情图片
     */
    public String getDetailImage() {
        return detailImage;
    }

    /**
     * 设置活动详情图片
     *
     * @param detailImage 活动详情图片
     */
    public void setDetailImage(String detailImage) {
        this.detailImage = detailImage;
    }

    /**
     * 获取活动类型：1为红包(例如 点击领取20积分的红包等) 2为普通活动 3为进入网页的活动(例如 笑傲浆糊活动等) 4为临时活动(例如 千万积分活动、东湖绿道活动等)
     *
     * @return type - 活动类型：1为红包(例如 点击领取20积分的红包等) 2为普通活动 3为进入网页的活动(例如 笑傲浆糊活动等) 4为临时活动(例如 千万积分活动、东湖绿道活动等)
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置活动类型：1为红包(例如 点击领取20积分的红包等) 2为普通活动 3为进入网页的活动(例如 笑傲浆糊活动等) 4为临时活动(例如 千万积分活动、东湖绿道活动等)
     *
     * @param type 活动类型：1为红包(例如 点击领取20积分的红包等) 2为普通活动 3为进入网页的活动(例如 笑傲浆糊活动等) 4为临时活动(例如 千万积分活动、东湖绿道活动等)
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 获取付款的形式 1积分付款 2微信或支付宝付款
     *
     * @return pay_type - 付款的形式 1积分付款 2微信或支付宝付款
     */
    public Integer getPayType() {
        return payType;
    }

    /**
     * 设置付款的形式 1积分付款 2微信或支付宝付款
     *
     * @param payType 付款的形式 1积分付款 2微信或支付宝付款
     */
    public void setPayType(Integer payType) {
        this.payType = payType;
    }

    /**
     * 获取活动未开始输入“敬请期待”，活动开始输入“50积分/人”或者“10元/人”
     *
     * @return pay_status - 活动未开始输入“敬请期待”，活动开始输入“50积分/人”或者“10元/人”
     */
    public String getPayStatus() {
        return payStatus;
    }

    /**
     * 设置活动未开始输入“敬请期待”，活动开始输入“50积分/人”或者“10元/人”
     *
     * @param payStatus 活动未开始输入“敬请期待”，活动开始输入“50积分/人”或者“10元/人”
     */
    public void setPayStatus(String payStatus) {
        this.payStatus = payStatus;
    }

    /**
     * 获取活动类型(例如 团建、亲子游等)
     *
     * @return genre - 活动类型(例如 团建、亲子游等)
     */
    public String getGenre() {
        return genre;
    }

    /**
     * 设置活动类型(例如 团建、亲子游等)
     *
     * @param genre 活动类型(例如 团建、亲子游等)
     */
    public void setGenre(String genre) {
        this.genre = genre;
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
}