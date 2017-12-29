package com.wind.service.mybatis.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "conversion_code")
public class ConversionCode {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 兑换码
     */
    private String code;

    /**
     * 积分的大小面额
     */
    private Integer size;

    /**
     * 兑换码的来源
     */
    private String source;

    /**
     * 是否使用 1代表已使用 0代表未使用
     */
    private Integer state;

    /**
     * 兑换码的分类(例如 来源是欧亚达家居广场，分类就写OYD)
     */
    private String type;

    /**
     * 生成兑换码的时间
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
     * 获取兑换码
     *
     * @return code - 兑换码
     */
    public String getCode() {
        return code;
    }

    /**
     * 设置兑换码
     *
     * @param code 兑换码
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * 获取积分的大小面额
     *
     * @return size - 积分的大小面额
     */
    public Integer getSize() {
        return size;
    }

    /**
     * 设置积分的大小面额
     *
     * @param size 积分的大小面额
     */
    public void setSize(Integer size) {
        this.size = size;
    }

    /**
     * 获取兑换码的来源
     *
     * @return source - 兑换码的来源
     */
    public String getSource() {
        return source;
    }

    /**
     * 设置兑换码的来源
     *
     * @param source 兑换码的来源
     */
    public void setSource(String source) {
        this.source = source;
    }

    /**
     * 获取是否使用 1代表已使用 0代表未使用
     *
     * @return state - 是否使用 1代表已使用 0代表未使用
     */
    public Integer getState() {
        return state;
    }

    /**
     * 设置是否使用 1代表已使用 0代表未使用
     *
     * @param state 是否使用 1代表已使用 0代表未使用
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * 获取兑换码的分类(例如 来源是欧亚达家居广场，分类就写OYD)
     *
     * @return type - 兑换码的分类(例如 来源是欧亚达家居广场，分类就写OYD)
     */
    public String getType() {
        return type;
    }

    /**
     * 设置兑换码的分类(例如 来源是欧亚达家居广场，分类就写OYD)
     *
     * @param type 兑换码的分类(例如 来源是欧亚达家居广场，分类就写OYD)
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 获取生成兑换码的时间
     *
     * @return time - 生成兑换码的时间
     */
    public Date getTime() {
        return time;
    }

    /**
     * 设置生成兑换码的时间
     *
     * @param time 生成兑换码的时间
     */
    public void setTime(Date time) {
        this.time = time;
    }
}