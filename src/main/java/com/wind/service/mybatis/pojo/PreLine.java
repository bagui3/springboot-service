package com.wind.service.mybatis.pojo;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "pre_line")
public class PreLine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 姓名
     */
    private String name;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 线路id
     */
    @Column(name = "line_id")
    private Long lineId;

    /**
     * 用户选择的发车时间
     */
    @Column(name = "select_time")
    private String selectTime;

    /**
     * 订单创建的时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 付款
     */
    private BigDecimal pay;

    /**
     * 商户平台订单号
     */
    @Column(name = "trade_no")
    private String tradeNo;

    /**
     * 支付平台订单号
     */
    @Column(name = "pay_no")
    private String payNo;

    /**
     * 付款时间
     */
    @Column(name = "pay_time")
    private Date payTime;

    /**
     * 车票状态  0代表没有乘车1代表已乘车 2代表退款
     */
    @Column(name = "ticket_state")
    private Integer ticketState;

    /**
     * 订单状态 0表示未付款 1表示已付款 2表示已退款
     */
    @Column(name = "pay_state")
    private Integer payState;

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
     * 获取姓名
     *
     * @return name - 姓名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置姓名
     *
     * @param name 姓名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取手机号
     *
     * @return phone - 手机号
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置手机号
     *
     * @param phone 手机号
     */
    public void setPhone(String phone) {
        this.phone = phone;
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
     * 获取用户选择的发车时间
     *
     * @return select_time - 用户选择的发车时间
     */
    public String getSelectTime() {
        return selectTime;
    }

    /**
     * 设置用户选择的发车时间
     *
     * @param selectTime 用户选择的发车时间
     */
    public void setSelectTime(String selectTime) {
        this.selectTime = selectTime;
    }

    /**
     * 获取订单创建的时间
     *
     * @return create_time - 订单创建的时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置订单创建的时间
     *
     * @param createTime 订单创建的时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
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
     * 获取支付平台订单号
     *
     * @return pay_no - 支付平台订单号
     */
    public String getPayNo() {
        return payNo;
    }

    /**
     * 设置支付平台订单号
     *
     * @param payNo 支付平台订单号
     */
    public void setPayNo(String payNo) {
        this.payNo = payNo;
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

    /**
     * 获取车票状态  0代表没有乘车1代表已乘车 2代表退款
     *
     * @return ticket_state - 车票状态  0代表没有乘车1代表已乘车 2代表退款
     */
    public Integer getTicketState() {
        return ticketState;
    }

    /**
     * 设置车票状态  0代表没有乘车1代表已乘车 2代表退款
     *
     * @param ticketState 车票状态  0代表没有乘车1代表已乘车 2代表退款
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
}