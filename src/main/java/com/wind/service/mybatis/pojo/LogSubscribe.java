package com.wind.service.mybatis.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "log_subscribe")
public class LogSubscribe {
    /**
     * 记录ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 医生ID
     */
    @Column(name = "professor_id")
    private Long professorId;

    @Column(name = "user_id")
    private Long userId;

    /**
     * 预约人姓名
     */
    @Column(name = "subscribe_name")
    private String subscribeName;

    /**
     * 预约人手机
     */
    @Column(name = "subscribe_phone")
    private String subscribePhone;

    /**
     * 医生姓名
     */
    @Column(name = "professor_name")
    private String professorName;

    /**
     * 预约时间
     */
    @Column(name = "subscribe_time")
    private Date subscribeTime;

    /**
     * 预约时间段
     */
    @Column(name = "subscribe_section")
    private String subscribeSection;

    @Column(name = "create_at")
    private Date createAt;

    @Column(name = "update_at")
    private Date updateAt;

    /**
     * 获取记录ID
     *
     * @return id - 记录ID
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置记录ID
     *
     * @param id 记录ID
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取医生ID
     *
     * @return professor_id - 医生ID
     */
    public Long getProfessorId() {
        return professorId;
    }

    /**
     * 设置医生ID
     *
     * @param professorId 医生ID
     */
    public void setProfessorId(Long professorId) {
        this.professorId = professorId;
    }

    /**
     * @return user_id
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * @param userId
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 获取预约人姓名
     *
     * @return subscribe_name - 预约人姓名
     */
    public String getSubscribeName() {
        return subscribeName;
    }

    /**
     * 设置预约人姓名
     *
     * @param subscribeName 预约人姓名
     */
    public void setSubscribeName(String subscribeName) {
        this.subscribeName = subscribeName;
    }

    /**
     * 获取预约人手机
     *
     * @return subscribe_phone - 预约人手机
     */
    public String getSubscribePhone() {
        return subscribePhone;
    }

    /**
     * 设置预约人手机
     *
     * @param subscribePhone 预约人手机
     */
    public void setSubscribePhone(String subscribePhone) {
        this.subscribePhone = subscribePhone;
    }

    /**
     * 获取医生姓名
     *
     * @return professor_name - 医生姓名
     */
    public String getProfessorName() {
        return professorName;
    }

    /**
     * 设置医生姓名
     *
     * @param professorName 医生姓名
     */
    public void setProfessorName(String professorName) {
        this.professorName = professorName;
    }

    /**
     * 获取预约时间
     *
     * @return subscribe_time - 预约时间
     */
    public Date getSubscribeTime() {
        return subscribeTime;
    }

    /**
     * 设置预约时间
     *
     * @param subscribeTime 预约时间
     */
    public void setSubscribeTime(Date subscribeTime) {
        this.subscribeTime = subscribeTime;
    }

    /**
     * 获取预约时间段
     *
     * @return subscribe_section - 预约时间段
     */
    public String getSubscribeSection() {
        return subscribeSection;
    }

    /**
     * 设置预约时间段
     *
     * @param subscribeSection 预约时间段
     */
    public void setSubscribeSection(String subscribeSection) {
        this.subscribeSection = subscribeSection;
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