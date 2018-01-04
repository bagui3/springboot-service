package com.wind.service.mybatis.pojo;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

public class Orders {
    /**
     * id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 商户平台订单编号
     */
    @Column(name = "trade_no")
    private String tradeNo;

    /**
     * 支付平台订单编号
     */
    @Column(name = "pay_trade_no")
    private String payTradeNo;

    /**
     * 支付方式 1-支付宝 2-微信
     */
    @Column(name = "trade_type")
    private Integer tradeType;

    /**
     * 用户id
     */
    @Column(name = "user_id")
    private Long userId;

    /**
     * 产品id
     */
    @Column(name = "product_id")
    private Long productId;

    /**
     * 产品类型 1-商品 2-活动
     */
    @Column(name = "product_type")
    private Integer productType;

    /**
     * 数量
     */
    private Integer amount;

    /**
     * 使用积分付款时扣除的积分
     */
    private Integer integral;

    /**
     * 总价
     */
    private BigDecimal price;

    /**
     * 付款
     */
    private BigDecimal pay;

    /**
     * 0-待付款 1-已付款 2-退款 3-删除
     */
    private Integer state;

    /**
     * 订单创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 支付时间
     */
    @Column(name = "pay_time")
    private Date payTime;

    /**
     * 修改时间
     */
    @Column(name = "modify_time")
    private Date modifyTime;

    /**
     * 获取id
     *
     * @return id - id
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置id
     *
     * @param id id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取商户平台订单编号
     *
     * @return trade_no - 商户平台订单编号
     */
    public String getTradeNo() {
        return tradeNo;
    }

    /**
     * 设置商户平台订单编号
     *
     * @param tradeNo 商户平台订单编号
     */
    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    /**
     * 获取支付平台订单编号
     *
     * @return pay_trade_no - 支付平台订单编号
     */
    public String getPayTradeNo() {
        return payTradeNo;
    }

    /**
     * 设置支付平台订单编号
     *
     * @param payTradeNo 支付平台订单编号
     */
    public void setPayTradeNo(String payTradeNo) {
        this.payTradeNo = payTradeNo;
    }

    /**
     * 获取支付方式 1-支付宝 2-微信
     *
     * @return trade_type - 支付方式 1-支付宝 2-微信
     */
    public Integer getTradeType() {
        return tradeType;
    }

    /**
     * 设置支付方式 1-支付宝 2-微信
     *
     * @param tradeType 支付方式 1-支付宝 2-微信
     */
    public void setTradeType(Integer tradeType) {
        this.tradeType = tradeType;
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
     * 获取产品id
     *
     * @return product_id - 产品id
     */
    public Long getProductId() {
        return productId;
    }

    /**
     * 设置产品id
     *
     * @param productId 产品id
     */
    public void setProductId(Long productId) {
        this.productId = productId;
    }

    /**
     * 获取产品类型 1-商品 2-活动
     *
     * @return product_type - 产品类型 1-商品 2-活动
     */
    public Integer getProductType() {
        return productType;
    }

    /**
     * 设置产品类型 1-商品 2-活动
     *
     * @param productType 产品类型 1-商品 2-活动
     */
    public void setProductType(Integer productType) {
        this.productType = productType;
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
     * 获取使用积分付款时扣除的积分
     *
     * @return integral - 使用积分付款时扣除的积分
     */
    public Integer getIntegral() {
        return integral;
    }

    /**
     * 设置使用积分付款时扣除的积分
     *
     * @param integral 使用积分付款时扣除的积分
     */
    public void setIntegral(Integer integral) {
        this.integral = integral;
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
     * 获取0-待付款 1-已付款 2-退款 3-删除
     *
     * @return state - 0-待付款 1-已付款 2-退款 3-删除
     */
    public Integer getState() {
        return state;
    }

    /**
     * 设置0-待付款 1-已付款 2-退款 3-删除
     *
     * @param state 0-待付款 1-已付款 2-退款 3-删除
     */
    public void setState(Integer state) {
        this.state = state;
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

    /**
     * 获取修改时间
     *
     * @return modify_time - 修改时间
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * 设置修改时间
     *
     * @param modifyTime 修改时间
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }
}