package com.wind.service.mybatis.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "data_user_child")
public class DataUserChild {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 用户编号
     */
    @Column(name = "user_id")
    private Long userId;

    /**
     * 宝宝出生日期
     */
    @Column(name = "birth_at")
    private Date birthAt;

    /**
     * 宝宝姓名
     */
    @Column(name = "child_name")
    private String childName;

    /**
     * 宝宝图片
     */
    @Column(name = "pic_url")
    private String picUrl;

    /**
     * 标题
     */
    private String title;

    /**
     * 提示
     */
    private String tip;

    /**
     * 区域
     */
    @Column(name = "child_region")
    private String childRegion;

    /**
     * 点赞数
     */
    @Column(name = "like_count")
    private Integer likeCount;

    /**
     * 转发数
     */
    @Column(name = "forward_count")
    private Integer forwardCount;

    /**
     * 阅读数
     */
    @Column(name = "read_count")
    private Integer readCount;

    @Column(name = "create_at")
    private Date createAt;

    @Column(name = "update_at")
    private Date updateAt;

    /**
     * 喜得宝内容
     */
    private String content;

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
     * 获取用户编号
     *
     * @return user_id - 用户编号
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 设置用户编号
     *
     * @param userId 用户编号
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 获取宝宝出生日期
     *
     * @return birth_at - 宝宝出生日期
     */
    public Date getBirthAt() {
        return birthAt;
    }

    /**
     * 设置宝宝出生日期
     *
     * @param birthAt 宝宝出生日期
     */
    public void setBirthAt(Date birthAt) {
        this.birthAt = birthAt;
    }

    /**
     * 获取宝宝姓名
     *
     * @return child_name - 宝宝姓名
     */
    public String getChildName() {
        return childName;
    }

    /**
     * 设置宝宝姓名
     *
     * @param childName 宝宝姓名
     */
    public void setChildName(String childName) {
        this.childName = childName;
    }

    /**
     * 获取宝宝图片
     *
     * @return pic_url - 宝宝图片
     */
    public String getPicUrl() {
        return picUrl;
    }

    /**
     * 设置宝宝图片
     *
     * @param picUrl 宝宝图片
     */
    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    /**
     * 获取标题
     *
     * @return title - 标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置标题
     *
     * @param title 标题
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 获取提示
     *
     * @return tip - 提示
     */
    public String getTip() {
        return tip;
    }

    /**
     * 设置提示
     *
     * @param tip 提示
     */
    public void setTip(String tip) {
        this.tip = tip;
    }

    /**
     * 获取区域
     *
     * @return child_region - 区域
     */
    public String getChildRegion() {
        return childRegion;
    }

    /**
     * 设置区域
     *
     * @param childRegion 区域
     */
    public void setChildRegion(String childRegion) {
        this.childRegion = childRegion;
    }

    /**
     * 获取点赞数
     *
     * @return like_count - 点赞数
     */
    public Integer getLikeCount() {
        return likeCount;
    }

    /**
     * 设置点赞数
     *
     * @param likeCount 点赞数
     */
    public void setLikeCount(Integer likeCount) {
        this.likeCount = likeCount;
    }

    /**
     * 获取转发数
     *
     * @return forward_count - 转发数
     */
    public Integer getForwardCount() {
        return forwardCount;
    }

    /**
     * 设置转发数
     *
     * @param forwardCount 转发数
     */
    public void setForwardCount(Integer forwardCount) {
        this.forwardCount = forwardCount;
    }

    /**
     * 获取阅读数
     *
     * @return read_count - 阅读数
     */
    public Integer getReadCount() {
        return readCount;
    }

    /**
     * 设置阅读数
     *
     * @param readCount 阅读数
     */
    public void setReadCount(Integer readCount) {
        this.readCount = readCount;
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

    /**
     * 获取喜得宝内容
     *
     * @return content - 喜得宝内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置喜得宝内容
     *
     * @param content 喜得宝内容
     */
    public void setContent(String content) {
        this.content = content;
    }
}