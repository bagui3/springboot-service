package com.wind.service.mybatis.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "data_activity_sign")
public class DataActivitySign {
    /**
     * 报名ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_id")
    private Long userId;

    /**
     * 活动ID
     */
    @Column(name = "activity_id")
    private Long activityId;

    /**
     * 活动名称
     */
    @Column(name = "activity_name")
    private String activityName;

    /**
     * 活动内容
     */
    @Column(name = "activity_content")
    private String activityContent;

    /**
     * 活动开始时间
     */
    @Column(name = "activity_start")
    private Date activityStart;

    /**
     * 活动结束时间
     */
    @Column(name = "activity_end")
    private Date activityEnd;

    /**
     * 报名时间
     */
    @Column(name = "sign_time")
    private Date signTime;

    @Column(name = "create_at")
    private Date createAt;

    @Column(name = "update_at")
    private Date updateAt;

    /**
     * 获取报名ID
     *
     * @return id - 报名ID
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置报名ID
     *
     * @param id 报名ID
     */
    public void setId(Long id) {
        this.id = id;
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
     * 获取活动ID
     *
     * @return activity_id - 活动ID
     */
    public Long getActivityId() {
        return activityId;
    }

    /**
     * 设置活动ID
     *
     * @param activityId 活动ID
     */
    public void setActivityId(Long activityId) {
        this.activityId = activityId;
    }

    /**
     * 获取活动名称
     *
     * @return activity_name - 活动名称
     */
    public String getActivityName() {
        return activityName;
    }

    /**
     * 设置活动名称
     *
     * @param activityName 活动名称
     */
    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

    /**
     * 获取活动内容
     *
     * @return activity_content - 活动内容
     */
    public String getActivityContent() {
        return activityContent;
    }

    /**
     * 设置活动内容
     *
     * @param activityContent 活动内容
     */
    public void setActivityContent(String activityContent) {
        this.activityContent = activityContent;
    }

    /**
     * 获取活动开始时间
     *
     * @return activity_start - 活动开始时间
     */
    public Date getActivityStart() {
        return activityStart;
    }

    /**
     * 设置活动开始时间
     *
     * @param activityStart 活动开始时间
     */
    public void setActivityStart(Date activityStart) {
        this.activityStart = activityStart;
    }

    /**
     * 获取活动结束时间
     *
     * @return activity_end - 活动结束时间
     */
    public Date getActivityEnd() {
        return activityEnd;
    }

    /**
     * 设置活动结束时间
     *
     * @param activityEnd 活动结束时间
     */
    public void setActivityEnd(Date activityEnd) {
        this.activityEnd = activityEnd;
    }

    /**
     * 获取报名时间
     *
     * @return sign_time - 报名时间
     */
    public Date getSignTime() {
        return signTime;
    }

    /**
     * 设置报名时间
     *
     * @param signTime 报名时间
     */
    public void setSignTime(Date signTime) {
        this.signTime = signTime;
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