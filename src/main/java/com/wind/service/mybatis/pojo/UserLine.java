package com.wind.service.mybatis.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "user_line")
public class UserLine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 用户id
     */
    @Column(name = "user_id")
    private Long userId;

    /**
     * 线路id
     */
    @Column(name = "line_id")
    private Long lineId;

    /**
     * 时间
     */
    private Date time;

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
     * 获取线路id
     *
     * @return line_id - 线路id
     */
    public Long getLineId() {
        return lineId;
    }

    /**
     * 设置线路id
     *
     * @param lineId 线路id
     */
    public void setLineId(Long lineId) {
        this.lineId = lineId;
    }

    /**
     * 获取时间
     *
     * @return time - 时间
     */
    public Date getTime() {
        return time;
    }

    /**
     * 设置时间
     *
     * @param time 时间
     */
    public void setTime(Date time) {
        this.time = time;
    }
}