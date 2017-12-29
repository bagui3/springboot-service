package com.wind.service.mybatis.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "online_active")
public class OnlineActive {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 报名参加活动人的姓名
     */
    private String name;

    /**
     * 报名参加活动人的手机号
     */
    private String phone;

    /**
     * 报名参加活动人的学校地址
     */
    @Column(name = "school_address")
    private String schoolAddress;

    /**
     * 活动的类型或名称
     */
    private String type;

    /**
     * 报名的时间
     */
    private Date data;

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
     * 获取报名参加活动人的姓名
     *
     * @return name - 报名参加活动人的姓名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置报名参加活动人的姓名
     *
     * @param name 报名参加活动人的姓名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取报名参加活动人的手机号
     *
     * @return phone - 报名参加活动人的手机号
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置报名参加活动人的手机号
     *
     * @param phone 报名参加活动人的手机号
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 获取报名参加活动人的学校地址
     *
     * @return school_address - 报名参加活动人的学校地址
     */
    public String getSchoolAddress() {
        return schoolAddress;
    }

    /**
     * 设置报名参加活动人的学校地址
     *
     * @param schoolAddress 报名参加活动人的学校地址
     */
    public void setSchoolAddress(String schoolAddress) {
        this.schoolAddress = schoolAddress;
    }

    /**
     * 获取活动的类型或名称
     *
     * @return type - 活动的类型或名称
     */
    public String getType() {
        return type;
    }

    /**
     * 设置活动的类型或名称
     *
     * @param type 活动的类型或名称
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 获取报名的时间
     *
     * @return data - 报名的时间
     */
    public Date getData() {
        return data;
    }

    /**
     * 设置报名的时间
     *
     * @param data 报名的时间
     */
    public void setData(Date data) {
        this.data = data;
    }
}