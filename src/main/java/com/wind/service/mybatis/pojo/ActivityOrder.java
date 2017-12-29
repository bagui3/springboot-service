package com.wind.service.mybatis.pojo;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "activity_order")
public class ActivityOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 商户平台订单号
     */
    @Column(name = "trade_no")
    private String tradeNo;

    /**
     * 用户id
     */
    @Column(name = "user_id")
    private Long userId;

    /**
     * 活动id
     */
    @Column(name = "activity_id")
    private Long activityId;

    /**
     * 数量
     */
    private Integer amount;

    /**
     * 价格
     */
    private BigDecimal price;

    /**
     * 付款金额
     */
    private BigDecimal pay;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 付款时间
     */
    @Column(name = "pay_time")
    private Date payTime;

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
     * 获取商户平台订单号
     *
     * @return trade_no - 商户平台订单号
     */
    public String getTradeNo() {
        return tradeNo;
    }

    /**
     * 设置商户平台订单号
     *
     * @param tradeNo 商户平台订单号
     */
    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
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
     * 获取活动id
     *
     * @return activity_id - 活动id
     */
    public Long getActivityId() {
        return activityId;
    }

    /**
     * 设置活动id
     *
     * @param activityId 活动id
     */
    public void setActivityId(Long activityId) {
        this.activityId = activityId;
    }

    /**
     * 获取数量
     *
     * @return amount - 数量
     */
    public Integer getAmount() {
        return amount;
    }

    /**
     * 设置数量
     *
     * @param amount 数量
     */
    public void setAmount(Integer amount) {
        this.amount = amount;
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
     * 获取付款金额
     *
     * @return pay - 付款金额
     */
    public BigDecimal getPay() {
        return pay;
    }

    /**
     * 设置付款金额
     *
     * @param pay 付款金额
     */
    public void setPay(BigDecimal pay) {
        this.pay = pay;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取付款时间
     *
     * @return pay_time - 付款时间
     */
    public Date getPayTime() {
        return payTime;
    }

    /**
     * 设置付款时间
     *
     * @param payTime 付款时间
     */
    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }
}