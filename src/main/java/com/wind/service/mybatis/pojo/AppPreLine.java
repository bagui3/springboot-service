package com.wind.service.mybatis.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "app_pre_line")
public class AppPreLine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

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
     * 用户选择发车的时间
     */
    @Column(name = "select_time")
    private String selectTime;

    /**
     * 支付的积分
     */
    private Integer integral;

    /**
     * 商户订单号
     */
    @Column(name = "trade_no")
    private String tradeNo;

    /**
     * 车票状态  0代表没有乘车1代表已乘车
     */
    @Column(name = "ticket_state")
    private Integer ticketState;

    /**
     * 订单状态 0表示未付款 1表示已付款 2表示已退款
     */
    @Column(name = "pay_state")
    private Integer payState;

    /**
     * 订单创建及付款的时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 注意：这是扫码时间
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
     * 获取用户选择发车的时间
     *
     * @return select_time - 用户选择发车的时间
     */
    public String getSelectTime() {
        return selectTime;
    }

    /**
     * 设置用户选择发车的时间
     *
     * @param selectTime 用户选择发车的时间
     */
    public void setSelectTime(String selectTime) {
        this.selectTime = selectTime;
    }

    /**
     * 获取支付的积分
     *
     * @return integral - 支付的积分
     */
    public Integer getIntegral() {
        return integral;
    }

    /**
     * 设置支付的积分
     *
     * @param integral 支付的积分
     */
    public void setIntegral(Integer integral) {
        this.integral = integral;
    }

    /**
     * 获取商户订单号
     *
     * @return trade_no - 商户订单号
     */
    public String getTradeNo() {
        return tradeNo;
    }

    /**
     * 设置商户订单号
     *
     * @param tradeNo 商户订单号
     */
    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    /**
     * 获取车票状态  0代表没有乘车1代表已乘车
     *
     * @return ticket_state - 车票状态  0代表没有乘车1代表已乘车
     */
    public Integer getTicketState() {
        return ticketState;
    }

    /**
     * 设置车票状态  0代表没有乘车1代表已乘车
     *
     * @param ticketState 车票状态  0代表没有乘车1代表已乘车
     */
    public void setTicketState(Integer ticketState) {
        this.ticketState = ticketState;
    }

    /**
     * 获取订单状态 0表示未付款 1表示已付款 2表示已退款
     *
     * @return pay_state - 订单状态 0表示未付款 1表示已付款 2表示已退款
     */
    public Integer getPayState() {
        return payState;
    }

    /**
     * 设置订单状态 0表示未付款 1表示已付款 2表示已退款
     *
     * @param payState 订单状态 0表示未付款 1表示已付款 2表示已退款
     */
    public void setPayState(Integer payState) {
        this.payState = payState;
    }

    /**
     * 获取订单创建及付款的时间
     *
     * @return create_time - 订单创建及付款的时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置订单创建及付款的时间
     *
     * @param createTime 订单创建及付款的时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取注意：这是扫码时间
     *
     * @return pay_time - 注意：这是扫码时间
     */
    public Date getPayTime() {
        return payTime;
    }

    /**
     * 设置注意：这是扫码时间
     *
     * @param payTime 注意：这是扫码时间
     */
    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }
}