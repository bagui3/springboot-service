package com.wind.service.mybatis.pojo;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "user_order")
public class UserOrder {
    /**
     * id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 类型
     */
    @Column(name = "order_type")
    private String orderType;

    /**
     * 用户ID
     */
    @Column(name = "user_id")
    private Long userId;

    /**
     * 商品ID
     */
    @Column(name = "commodity_id")
    private Long commodityId;

    /**
     * 商品数量
     */
    @Column(name = "commodity_count")
    private BigDecimal commodityCount;

    /**
     * 积分价格
     */
    @Column(name = "order_point")
    private BigDecimal orderPoint;

    /**
     * 实际支付价格
     */
    @Column(name = "order_price")
    private BigDecimal orderPrice;

    /**
     * 下单时间
     */
    @Column(name = "order_time")
    private Date orderTime;

    /**
     * 描述
     */
    private String note;

    /**
     * 订单状态
     */
    @Column(name = "order_status")
    private Integer orderStatus;

    /**
     * 订单完成时间
     */
    @Column(name = "order_finish_time")
    private Date orderFinishTime;

    /**
     * 订单来源
     */
    @Column(name = "order_source")
    private String orderSource;

    /**
     * 商品品规
     */
    @Column(name = "commodity_attributes")
    private String commodityAttributes;

    @Column(name = "express_person")
    private String expressPerson;

    @Column(name = "express_address")
    private String expressAddress;

    @Column(name = "express_contact")
    private String expressContact;

    @Column(name = "express_code")
    private String expressCode;

    @Column(name = "create_at")
    private Date createAt;

    @Column(name = "update_at")
    private Date updateAt;

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
     * 获取类型
     *
     * @return order_type - 类型
     */
    public String getOrderType() {
        return orderType;
    }

    /**
     * 设置类型
     *
     * @param orderType 类型
     */
    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    /**
     * 获取用户ID
     *
     * @return user_id - 用户ID
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 设置用户ID
     *
     * @param userId 用户ID
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 获取商品ID
     *
     * @return commodity_id - 商品ID
     */
    public Long getCommodityId() {
        return commodityId;
    }

    /**
     * 设置商品ID
     *
     * @param commodityId 商品ID
     */
    public void setCommodityId(Long commodityId) {
        this.commodityId = commodityId;
    }

    /**
     * 获取商品数量
     *
     * @return commodity_count - 商品数量
     */
    public BigDecimal getCommodityCount() {
        return commodityCount;
    }

    /**
     * 设置商品数量
     *
     * @param commodityCount 商品数量
     */
    public void setCommodityCount(BigDecimal commodityCount) {
        this.commodityCount = commodityCount;
    }

    /**
     * 获取积分价格
     *
     * @return order_point - 积分价格
     */
    public BigDecimal getOrderPoint() {
        return orderPoint;
    }

    /**
     * 设置积分价格
     *
     * @param orderPoint 积分价格
     */
    public void setOrderPoint(BigDecimal orderPoint) {
        this.orderPoint = orderPoint;
    }

    /**
     * 获取实际支付价格
     *
     * @return order_price - 实际支付价格
     */
    public BigDecimal getOrderPrice() {
        return orderPrice;
    }

    /**
     * 设置实际支付价格
     *
     * @param orderPrice 实际支付价格
     */
    public void setOrderPrice(BigDecimal orderPrice) {
        this.orderPrice = orderPrice;
    }

    /**
     * 获取下单时间
     *
     * @return order_time - 下单时间
     */
    public Date getOrderTime() {
        return orderTime;
    }

    /**
     * 设置下单时间
     *
     * @param orderTime 下单时间
     */
    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    /**
     * 获取描述
     *
     * @return note - 描述
     */
    public String getNote() {
        return note;
    }

    /**
     * 设置描述
     *
     * @param note 描述
     */
    public void setNote(String note) {
        this.note = note;
    }

    /**
     * 获取订单状态
     *
     * @return order_status - 订单状态
     */
    public Integer getOrderStatus() {
        return orderStatus;
    }

    /**
     * 设置订单状态
     *
     * @param orderStatus 订单状态
     */
    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    /**
     * 获取订单完成时间
     *
     * @return order_finish_time - 订单完成时间
     */
    public Date getOrderFinishTime() {
        return orderFinishTime;
    }

    /**
     * 设置订单完成时间
     *
     * @param orderFinishTime 订单完成时间
     */
    public void setOrderFinishTime(Date orderFinishTime) {
        this.orderFinishTime = orderFinishTime;
    }

    /**
     * 获取订单来源
     *
     * @return order_source - 订单来源
     */
    public String getOrderSource() {
        return orderSource;
    }

    /**
     * 设置订单来源
     *
     * @param orderSource 订单来源
     */
    public void setOrderSource(String orderSource) {
        this.orderSource = orderSource;
    }

    /**
     * 获取商品品规
     *
     * @return commodity_attributes - 商品品规
     */
    public String getCommodityAttributes() {
        return commodityAttributes;
    }

    /**
     * 设置商品品规
     *
     * @param commodityAttributes 商品品规
     */
    public void setCommodityAttributes(String commodityAttributes) {
        this.commodityAttributes = commodityAttributes;
    }

    /**
     * @return express_person
     */
    public String getExpressPerson() {
        return expressPerson;
    }

    /**
     * @param expressPerson
     */
    public void setExpressPerson(String expressPerson) {
        this.expressPerson = expressPerson;
    }

    /**
     * @return express_address
     */
    public String getExpressAddress() {
        return expressAddress;
    }

    /**
     * @param expressAddress
     */
    public void setExpressAddress(String expressAddress) {
        this.expressAddress = expressAddress;
    }

    /**
     * @return express_contact
     */
    public String getExpressContact() {
        return expressContact;
    }

    /**
     * @param expressContact
     */
    public void setExpressContact(String expressContact) {
        this.expressContact = expressContact;
    }

    /**
     * @return express_code
     */
    public String getExpressCode() {
        return expressCode;
    }

    /**
     * @param expressCode
     */
    public void setExpressCode(String expressCode) {
        this.expressCode = expressCode;
    }

    /**
     * @return create_at
     */
    public Date getCreateAt() {
        return createAt;
    }

    /**
     * @param createAt
     */
    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    /**
     * @return update_at
     */
    public Date getUpdateAt() {
        return updateAt;
    }

    /**
     * @param updateAt
     */
    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }
}