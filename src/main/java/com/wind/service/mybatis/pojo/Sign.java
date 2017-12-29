package com.wind.service.mybatis.pojo;

import java.util.Date;
import javax.persistence.*;

public class Sign {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 用户id
     */
    @Column(name = "userId")
    private Long userid;

    /**
     * 签到时间
     */
    @Column(name = "sign_date")
    private Date signDate;

    /**
     * 连续次数
     */
    private Integer succession;

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
     * 获取用户id
     *
     * @return userId - 用户id
     */
    public Long getUserid() {
        return userid;
    }

    /**
     * 设置用户id
     *
     * @param userid 用户id
     */
    public void setUserid(Long userid) {
        this.userid = userid;
    }

    /**
     * 获取签到时间
     *
     * @return sign_date - 签到时间
     */
    public Date getSignDate() {
        return signDate;
    }

    /**
     * 设置签到时间
     *
     * @param signDate 签到时间
     */
    public void setSignDate(Date signDate) {
        this.signDate = signDate;
    }

    /**
     * 获取连续次数
     *
     * @return succession - 连续次数
     */
    public Integer getSuccession() {
        return succession;
    }

    /**
     * 设置连续次数
     *
     * @param succession 连续次数
     */
    public void setSuccession(Integer succession) {
        this.succession = succession;
    }
}