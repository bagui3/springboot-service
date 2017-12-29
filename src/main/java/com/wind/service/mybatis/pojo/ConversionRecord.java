package com.wind.service.mybatis.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "conversion_record")
public class ConversionRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 兑换码使用的时间
     */
    @Id
    private Date time;

    /**
     * 用户id
     */
    @Column(name = "user_id")
    private Long userId;

    /**
     * 兑换码id
     */
    @Column(name = "code_id")
    private Long codeId;

    /**
     * 兑换码大小
     */
    private Integer size;

    /**
     * 使用的兑换码来源
     */
    private String source;

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
     * 获取兑换码使用的时间
     *
     * @return time - 兑换码使用的时间
     */
    public Date getTime() {
        return time;
    }

    /**
     * 设置兑换码使用的时间
     *
     * @param time 兑换码使用的时间
     */
    public void setTime(Date time) {
        this.time = time;
    }

    /**
     * 获取用户id
     *
     * @return user_id - 用户id
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 设置用户id
     *
     * @param userId 用户id
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 获取兑换码id
     *
     * @return code_id - 兑换码id
     */
    public Long getCodeId() {
        return codeId;
    }

    /**
     * 设置兑换码id
     *
     * @param codeId 兑换码id
     */
    public void setCodeId(Long codeId) {
        this.codeId = codeId;
    }

    /**
     * 获取兑换码大小
     *
     * @return size - 兑换码大小
     */
    public Integer getSize() {
        return size;
    }

    /**
     * 设置兑换码大小
     *
     * @param size 兑换码大小
     */
    public void setSize(Integer size) {
        this.size = size;
    }

    /**
     * 获取使用的兑换码来源
     *
     * @return source - 使用的兑换码来源
     */
    public String getSource() {
        return source;
    }

    /**
     * 设置使用的兑换码来源
     *
     * @param source 使用的兑换码来源
     */
    public void setSource(String source) {
        this.source = source;
    }
}