package com.wind.service.mybatis.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "log_user_child")
public class LogUserChild {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 用户编号
     */
    @Column(name = "user_id")
    private Long userId;

    /**
     * 喜得宝编号
     */
    @Column(name = "user_child_id")
    private Long userChildId;

    /**
     * 点赞
     */
    @Column(name = "is_like")
    private Boolean isLike;

    /**
     * 转发
     */
    @Column(name = "is_forward")
    private Boolean isForward;

    @Column(name = "create_at")
    private Date createAt;

    @Column(name = "update_at")
    private Date updateAt;

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
     * 获取喜得宝编号
     *
     * @return user_child_id - 喜得宝编号
     */
    public Long getUserChildId() {
        return userChildId;
    }

    /**
     * 设置喜得宝编号
     *
     * @param userChildId 喜得宝编号
     */
    public void setUserChildId(Long userChildId) {
        this.userChildId = userChildId;
    }

    /**
     * 获取点赞
     *
     * @return is_like - 点赞
     */
    public Boolean getIsLike() {
        return isLike;
    }

    /**
     * 设置点赞
     *
     * @param isLike 点赞
     */
    public void setIsLike(Boolean isLike) {
        this.isLike = isLike;
    }

    /**
     * 获取转发
     *
     * @return is_forward - 转发
     */
    public Boolean getIsForward() {
        return isForward;
    }

    /**
     * 设置转发
     *
     * @param isForward 转发
     */
    public void setIsForward(Boolean isForward) {
        this.isForward = isForward;
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