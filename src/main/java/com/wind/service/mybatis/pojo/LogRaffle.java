package com.wind.service.mybatis.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "log_raffle")
public class LogRaffle {
    /**
     * 记录ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "user_phone")
    private String userPhone;

    @Column(name = "user_name")
    private String userName;

    /**
     * 抽奖类型
     */
    @Column(name = "raffle_type")
    private String raffleType;

    /**
     * 中奖号码
     */
    @Column(name = "raffle_code")
    private String raffleCode;

    /**
     * 抽奖物品名称
     */
    private String name;

    /**
     * 抽奖物品描述
     */
    private String description;

    /**
     * 过期时间
     */
    @Column(name = "expire_time")
    private Date expireTime;

    /**
     * 抽奖物品图片
     */
    @Column(name = "raffle_pic")
    private String rafflePic;

    /**
     * 兑换代码
     */
    private String code;

    /**
     * 兑换状态
     */
    @Column(name = "raffle_status")
    private Integer raffleStatus;

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
     * @return user_phone
     */
    public String getUserPhone() {
        return userPhone;
    }

    /**
     * @param userPhone
     */
    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    /**
     * @return user_name
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
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
     * 获取中奖号码
     *
     * @return raffle_code - 中奖号码
     */
    public String getRaffleCode() {
        return raffleCode;
    }

    /**
     * 设置中奖号码
     *
     * @param raffleCode 中奖号码
     */
    public void setRaffleCode(String raffleCode) {
        this.raffleCode = raffleCode;
    }

    /**
     * 获取抽奖物品名称
     *
     * @return name - 抽奖物品名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置抽奖物品名称
     *
     * @param name 抽奖物品名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取抽奖物品描述
     *
     * @return description - 抽奖物品描述
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置抽奖物品描述
     *
     * @param description 抽奖物品描述
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 获取过期时间
     *
     * @return expire_time - 过期时间
     */
    public Date getExpireTime() {
        return expireTime;
    }

    /**
     * 设置过期时间
     *
     * @param expireTime 过期时间
     */
    public void setExpireTime(Date expireTime) {
        this.expireTime = expireTime;
    }

    /**
     * 获取抽奖物品图片
     *
     * @return raffle_pic - 抽奖物品图片
     */
    public String getRafflePic() {
        return rafflePic;
    }

    /**
     * 设置抽奖物品图片
     *
     * @param rafflePic 抽奖物品图片
     */
    public void setRafflePic(String rafflePic) {
        this.rafflePic = rafflePic;
    }

    /**
     * 获取兑换代码
     *
     * @return code - 兑换代码
     */
    public String getCode() {
        return code;
    }

    /**
     * 设置兑换代码
     *
     * @param code 兑换代码
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * 获取兑换状态
     *
     * @return raffle_status - 兑换状态
     */
    public Integer getRaffleStatus() {
        return raffleStatus;
    }

    /**
     * 设置兑换状态
     *
     * @param raffleStatus 兑换状态
     */
    public void setRaffleStatus(Integer raffleStatus) {
        this.raffleStatus = raffleStatus;
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