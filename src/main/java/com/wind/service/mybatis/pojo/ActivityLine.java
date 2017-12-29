package com.wind.service.mybatis.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "activity_line")
public class ActivityLine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 活动发起人名字
     */
    private String name;

    /**
     * 发起人手机号
     */
    private String phone;

    /**
     * 起点
     */
    @Column(name = "start_address")
    private String startAddress;

    /**
     * 终点
     */
    @Column(name = "end_address")
    private String endAddress;

    /**
     * 提交的时间
     */
    @Column(name = "create_time")
    private Date createTime;

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
     * 获取活动发起人名字
     *
     * @return name - 活动发起人名字
     */
    public String getName() {
        return name;
    }

    /**
     * 设置活动发起人名字
     *
     * @param name 活动发起人名字
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取发起人手机号
     *
     * @return phone - 发起人手机号
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置发起人手机号
     *
     * @param phone 发起人手机号
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 获取起点
     *
     * @return start_address - 起点
     */
    public String getStartAddress() {
        return startAddress;
    }

    /**
     * 设置起点
     *
     * @param startAddress 起点
     */
    public void setStartAddress(String startAddress) {
        this.startAddress = startAddress;
    }

    /**
     * 获取终点
     *
     * @return end_address - 终点
     */
    public String getEndAddress() {
        return endAddress;
    }

    /**
     * 设置终点
     *
     * @param endAddress 终点
     */
    public void setEndAddress(String endAddress) {
        this.endAddress = endAddress;
    }

    /**
     * 获取提交的时间
     *
     * @return create_time - 提交的时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置提交的时间
     *
     * @param createTime 提交的时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}