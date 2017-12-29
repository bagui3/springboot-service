package com.wind.service.mybatis.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "point_record")
public class PointRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 用户id
     */
    @Column(name = "userId")
    private Long userid;

    /**
     * 类型
     */
    private String type;

    /**
     * 来源
     */
    private String source;

    /**
     * 账户
     */
    private Integer account;

    /**
     * 说明
     */
    private String remark;

    /**
     * 记录时间
     */
    @Column(name = "record_time")
    private Date recordTime;

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
     * 获取类型
     *
     * @return type - 类型
     */
    public String getType() {
        return type;
    }

    /**
     * 设置类型
     *
     * @param type 类型
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 获取来源
     *
     * @return source - 来源
     */
    public String getSource() {
        return source;
    }

    /**
     * 设置来源
     *
     * @param source 来源
     */
    public void setSource(String source) {
        this.source = source;
    }

    /**
     * 获取账户
     *
     * @return account - 账户
     */
    public Integer getAccount() {
        return account;
    }

    /**
     * 设置账户
     *
     * @param account 账户
     */
    public void setAccount(Integer account) {
        this.account = account;
    }

    /**
     * 获取说明
     *
     * @return remark - 说明
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置说明
     *
     * @param remark 说明
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * 获取记录时间
     *
     * @return record_time - 记录时间
     */
    public Date getRecordTime() {
        return recordTime;
    }

    /**
     * 设置记录时间
     *
     * @param recordTime 记录时间
     */
    public void setRecordTime(Date recordTime) {
        this.recordTime = recordTime;
    }
}