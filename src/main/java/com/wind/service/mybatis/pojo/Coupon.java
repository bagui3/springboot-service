package com.wind.service.mybatis.pojo;

import java.util.Date;
import javax.persistence.*;

public class Coupon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 积分券名称
     */
    private String name;

    /**
     * 面额
     */
    private Integer denomination;

    /**
     * 1活动2代表注册3代表分享
     */
    private Integer source;

    /**
     * 有效天数：从用户领取积分券到积分券失效的天数
     */
    @Column(name = "valid_days")
    private Integer validDays;

    /**
     * 积分券图片
     */
    private String img;

    /**
     * 积分券数量(针对活动)
     */
    private Integer amount;

    /**
     * 活动开始时间
     */
    @Column(name = "activity_start_time")
    private Date activityStartTime;

    /**
     * 活动结束时间
     */
    @Column(name = "activity_end_time")
    private Date activityEndTime;

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
     * 获取积分券名称
     *
     * @return name - 积分券名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置积分券名称
     *
     * @param name 积分券名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取面额
     *
     * @return denomination - 面额
     */
    public Integer getDenomination() {
        return denomination;
    }

    /**
     * 设置面额
     *
     * @param denomination 面额
     */
    public void setDenomination(Integer denomination) {
        this.denomination = denomination;
    }

    /**
     * 获取1活动2代表注册3代表分享
     *
     * @return source - 1活动2代表注册3代表分享
     */
    public Integer getSource() {
        return source;
    }

    /**
     * 设置1活动2代表注册3代表分享
     *
     * @param source 1活动2代表注册3代表分享
     */
    public void setSource(Integer source) {
        this.source = source;
    }

    /**
     * 获取有效天数：从用户领取积分券到积分券失效的天数
     *
     * @return valid_days - 有效天数：从用户领取积分券到积分券失效的天数
     */
    public Integer getValidDays() {
        return validDays;
    }

    /**
     * 设置有效天数：从用户领取积分券到积分券失效的天数
     *
     * @param validDays 有效天数：从用户领取积分券到积分券失效的天数
     */
    public void setValidDays(Integer validDays) {
        this.validDays = validDays;
    }

    /**
     * 获取积分券图片
     *
     * @return img - 积分券图片
     */
    public String getImg() {
        return img;
    }

    /**
     * 设置积分券图片
     *
     * @param img 积分券图片
     */
    public void setImg(String img) {
        this.img = img;
    }

    /**
     * 获取积分券数量(针对活动)
     *
     * @return amount - 积分券数量(针对活动)
     */
    public Integer getAmount() {
        return amount;
    }

    /**
     * 设置积分券数量(针对活动)
     *
     * @param amount 积分券数量(针对活动)
     */
    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    /**
     * 获取活动开始时间
     *
     * @return activity_start_time - 活动开始时间
     */
    public Date getActivityStartTime() {
        return activityStartTime;
    }

    /**
     * 设置活动开始时间
     *
     * @param activityStartTime 活动开始时间
     */
    public void setActivityStartTime(Date activityStartTime) {
        this.activityStartTime = activityStartTime;
    }

    /**
     * 获取活动结束时间
     *
     * @return activity_end_time - 活动结束时间
     */
    public Date getActivityEndTime() {
        return activityEndTime;
    }

    /**
     * 设置活动结束时间
     *
     * @param activityEndTime 活动结束时间
     */
    public void setActivityEndTime(Date activityEndTime) {
        this.activityEndTime = activityEndTime;
    }
}