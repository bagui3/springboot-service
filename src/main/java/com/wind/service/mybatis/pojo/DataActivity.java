package com.wind.service.mybatis.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "data_activity")
public class DataActivity {
    /**
     * 活动id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

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
     * 活动分类
     */
    @Column(name = "active_type")
    private String activeType;

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

    @Column(name = "create_at")
    private Date createAt;

    @Column(name = "update_at")
    private Date updateAt;

    /**
     * 获取活动id
     *
     * @return id - 活动id
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置活动id
     *
     * @param id 活动id
     */
    public void setId(Long id) {
        this.id = id;
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
     * 获取活动分类
     *
     * @return active_type - 活动分类
     */
    public String getActiveType() {
        return activeType;
    }

    /**
     * 设置活动分类
     *
     * @param activeType 活动分类
     */
    public void setActiveType(String activeType) {
        this.activeType = activeType;
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