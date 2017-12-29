package com.wind.service.mybatis.pojo;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "commodity_order")
public class CommodityOrder {
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
     * 商品id
     */
    @Column(name = "commodity_id")
    private Long commodityId;

    /**
     * 数量
     */
    private Integer amount;

    /**
     * 价格
     */
    private BigDecimal price;

    /**
     * 付款
     */
    private BigDecimal pay;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 支付时间
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
     * 获取商品id
     *
     * @return commodity_id - 商品id
     */
    public Long getCommodityId() {
        return commodityId;
    }

    /**
     * 设置商品id
     *
     * @param commodityId 商品id
     */
    public void setCommodityId(Long commodityId) {
        this.commodityId = commodityId;
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
     * 获取付款
     *
     * @return pay - 付款
     */
    public BigDecimal getPay() {
        return pay;
    }

    /**
     * 设置付款
     *
     * @param pay 付款
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
     * 获取支付时间
     *
     * @return pay_time - 支付时间
     */
    public Date getPayTime() {
        return payTime;
    }

    /**
     * 设置支付时间
     *
     * @param payTime 支付时间
     */
    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }
}