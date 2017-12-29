package com.wind.service.mybatis.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "coupon_to_user")
public class CouponToUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 积分券id
     */
    @Column(name = "coupon_id")
    private Long couponId;

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
     * 得到积分券的时间
     */
    @Column(name = "obtain_time")
    private Date obtainTime;

    /**
     * 积分券开始生效时间
     */
    @Column(name = "start_time")
    private Date startTime;

    /**
     * 积分券失效的时间
     */
    @Column(name = "end_time")
    private Date endTime;

    /**
     * 0未使用1已使用2已过期
     */
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
     * 获取积分券id
     *
     * @return coupon_id - 积分券id
     */
    public Long getCouponId() {
        return couponId;
    }

    /**
     * 设置积分券id
     *
     * @param couponId 积分券id
     */
    public void setCouponId(Long couponId) {
        this.couponId = couponId;
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
     * 获取得到积分券的时间
     *
     * @return obtain_time - 得到积分券的时间
     */
    public Date getObtainTime() {
        return obtainTime;
    }

    /**
     * 设置得到积分券的时间
     *
     * @param obtainTime 得到积分券的时间
     */
    public void setObtainTime(Date obtainTime) {
        this.obtainTime = obtainTime;
    }

    /**
     * 获取积分券开始生效时间
     *
     * @return start_time - 积分券开始生效时间
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * 设置积分券开始生效时间
     *
     * @param startTime 积分券开始生效时间
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * 获取积分券失效的时间
     *
     * @return end_time - 积分券失效的时间
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * 设置积分券失效的时间
     *
     * @param endTime 积分券失效的时间
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * 获取0未使用1已使用2已过期
     *
     * @return state - 0未使用1已使用2已过期
     */
    public Integer getState() {
        return state;
    }

    /**
     * 设置0未使用1已使用2已过期
     *
     * @param state 0未使用1已使用2已过期
     */
    public void setState(Integer state) {
        this.state = state;
    }
}