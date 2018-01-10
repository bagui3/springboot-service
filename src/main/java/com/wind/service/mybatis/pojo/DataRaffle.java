package com.wind.service.mybatis.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "data_raffle")
public class DataRaffle {
    /**
     * id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 抽奖名称
     */
    @Column(name = "raffle_name")
    private String raffleName;

    /**
     * 间隔时间(s)
     */
    @Column(name = "second_interval")
    private Integer secondInterval;

    /**
     * 抽奖持续时间(s)
     */
    @Column(name = "second_duration")
    private Integer secondDuration;

    /**
     * 谢谢数量
     */
    @Column(name = "thank_count")
    private Integer thankCount;

    /**
     * 抽奖类型
     */
    @Column(name = "raffle_type")
    private String raffleType;

    /**
     * 是否自动开启关闭[0-否  1-是]
     */
    @Column(name = "is_auto")
    private Integer isAuto;

    /**
     * 抽奖状态[1 开始抽奖活动  0 抽奖活动结束]
     */
    private Integer status;

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
     * 获取抽奖名称
     *
     * @return raffle_name - 抽奖名称
     */
    public String getRaffleName() {
        return raffleName;
    }

    /**
     * 设置抽奖名称
     *
     * @param raffleName 抽奖名称
     */
    public void setRaffleName(String raffleName) {
        this.raffleName = raffleName;
    }

    /**
     * 获取间隔时间(s)
     *
     * @return second_interval - 间隔时间(s)
     */
    public Integer getSecondInterval() {
        return secondInterval;
    }

    /**
     * 设置间隔时间(s)
     *
     * @param secondInterval 间隔时间(s)
     */
    public void setSecondInterval(Integer secondInterval) {
        this.secondInterval = secondInterval;
    }

    /**
     * 获取抽奖持续时间(s)
     *
     * @return second_duration - 抽奖持续时间(s)
     */
    public Integer getSecondDuration() {
        return secondDuration;
    }

    /**
     * 设置抽奖持续时间(s)
     *
     * @param secondDuration 抽奖持续时间(s)
     */
    public void setSecondDuration(Integer secondDuration) {
        this.secondDuration = secondDuration;
    }

    /**
     * 获取谢谢数量
     *
     * @return thank_count - 谢谢数量
     */
    public Integer getThankCount() {
        return thankCount;
    }

    /**
     * 设置谢谢数量
     *
     * @param thankCount 谢谢数量
     */
    public void setThankCount(Integer thankCount) {
        this.thankCount = thankCount;
    }

    /**
     * 获取抽奖类型
     *
     * @return raffle_type - 抽奖类型
     */
    public String getRaffleType() {
        return raffleType;
    }

    /**
     * 设置抽奖类型
     *
     * @param raffleType 抽奖类型
     */
    public void setRaffleType(String raffleType) {
        this.raffleType = raffleType;
    }

    /**
     * 获取是否自动开启关闭[0-否  1-是]
     *
     * @return is_auto - 是否自动开启关闭[0-否  1-是]
     */
    public Integer getIsAuto() {
        return isAuto;
    }

    /**
     * 设置是否自动开启关闭[0-否  1-是]
     *
     * @param isAuto 是否自动开启关闭[0-否  1-是]
     */
    public void setIsAuto(Integer isAuto) {
        this.isAuto = isAuto;
    }

    /**
     * 获取抽奖状态[1 开始抽奖活动  0 抽奖活动结束]
     *
     * @return status - 抽奖状态[1 开始抽奖活动  0 抽奖活动结束]
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置抽奖状态[1 开始抽奖活动  0 抽奖活动结束]
     *
     * @param status 抽奖状态[1 开始抽奖活动  0 抽奖活动结束]
     */
    public void setStatus(Integer status) {
        this.status = status;
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