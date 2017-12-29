package com.wind.service.mybatis.pojo;

import java.util.Date;
import javax.persistence.*;

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 用户名
     */
    private String name;

    /**
     * 头像
     */
    private String photo;

    /**
     * 密码
     */
    private String password;

    /**
     * 密码加密的种子
     */
    private String salt;

    /**
     * 电话
     */
    private String phone;

    /**
     * 推荐人手机号
     */
    @Column(name = "recommend_phone")
    private String recommendPhone;

    /**
     * 微信用户唯一标识
     */
    @Column(name = "wx_union_id")
    private String wxUnionId;

    /**
     * 维度
     */
    private Double lat;

    /**
     * 经度
     */
    private Double lng;

    /**
     * 积分
     */
    private Integer points;

    /**
     * 用户类型：0是普通用户，1是司机，999是管理员
     */
    private Integer type;

    /**
     * 真名
     */
    @Column(name = "real_name")
    private String realName;

    /**
     * 身份证
     */
    @Column(name = "id_card")
    private String idCard;

    /**
     * 学校
     */
    private String school;

    /**
     * 学院
     */
    private String institute;

    /**
     * 表示用户注册来源：0表示一般注册，1表示通过活动注册
     */
    private String source;

    /**
     * 红包状态
     */
    @Column(name = "redType")
    private String redtype;

    /**
     * 用户注册的时间
     */
    @Column(name = "registere_time")
    private Date registereTime;

    /**
     * 最近登录时间
     */
    @Column(name = "login_time")
    private Date loginTime;

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
     * 获取用户名
     *
     * @return name - 用户名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置用户名
     *
     * @param name 用户名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取头像
     *
     * @return photo - 头像
     */
    public String getPhoto() {
        return photo;
    }

    /**
     * 设置头像
     *
     * @param photo 头像
     */
    public void setPhoto(String photo) {
        this.photo = photo;
    }

    /**
     * 获取密码
     *
     * @return password - 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置密码
     *
     * @param password 密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取密码加密的种子
     *
     * @return salt - 密码加密的种子
     */
    public String getSalt() {
        return salt;
    }

    /**
     * 设置密码加密的种子
     *
     * @param salt 密码加密的种子
     */
    public void setSalt(String salt) {
        this.salt = salt;
    }

    /**
     * 获取电话
     *
     * @return phone - 电话
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置电话
     *
     * @param phone 电话
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 获取推荐人手机号
     *
     * @return recommend_phone - 推荐人手机号
     */
    public String getRecommendPhone() {
        return recommendPhone;
    }

    /**
     * 设置推荐人手机号
     *
     * @param recommendPhone 推荐人手机号
     */
    public void setRecommendPhone(String recommendPhone) {
        this.recommendPhone = recommendPhone;
    }

    /**
     * 获取微信用户唯一标识
     *
     * @return wx_union_id - 微信用户唯一标识
     */
    public String getWxUnionId() {
        return wxUnionId;
    }

    /**
     * 设置微信用户唯一标识
     *
     * @param wxUnionId 微信用户唯一标识
     */
    public void setWxUnionId(String wxUnionId) {
        this.wxUnionId = wxUnionId;
    }

    /**
     * 获取维度
     *
     * @return lat - 维度
     */
    public Double getLat() {
        return lat;
    }

    /**
     * 设置维度
     *
     * @param lat 维度
     */
    public void setLat(Double lat) {
        this.lat = lat;
    }

    /**
     * 获取经度
     *
     * @return lng - 经度
     */
    public Double getLng() {
        return lng;
    }

    /**
     * 设置经度
     *
     * @param lng 经度
     */
    public void setLng(Double lng) {
        this.lng = lng;
    }

    /**
     * 获取积分
     *
     * @return points - 积分
     */
    public Integer getPoints() {
        return points;
    }

    /**
     * 设置积分
     *
     * @param points 积分
     */
    public void setPoints(Integer points) {
        this.points = points;
    }

    /**
     * 获取用户类型：0是普通用户，1是司机，999是管理员
     *
     * @return type - 用户类型：0是普通用户，1是司机，999是管理员
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置用户类型：0是普通用户，1是司机，999是管理员
     *
     * @param type 用户类型：0是普通用户，1是司机，999是管理员
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 获取真名
     *
     * @return real_name - 真名
     */
    public String getRealName() {
        return realName;
    }

    /**
     * 设置真名
     *
     * @param realName 真名
     */
    public void setRealName(String realName) {
        this.realName = realName;
    }

    /**
     * 获取身份证
     *
     * @return id_card - 身份证
     */
    public String getIdCard() {
        return idCard;
    }

    /**
     * 设置身份证
     *
     * @param idCard 身份证
     */
    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    /**
     * 获取学校
     *
     * @return school - 学校
     */
    public String getSchool() {
        return school;
    }

    /**
     * 设置学校
     *
     * @param school 学校
     */
    public void setSchool(String school) {
        this.school = school;
    }

    /**
     * 获取学院
     *
     * @return institute - 学院
     */
    public String getInstitute() {
        return institute;
    }

    /**
     * 设置学院
     *
     * @param institute 学院
     */
    public void setInstitute(String institute) {
        this.institute = institute;
    }

    /**
     * 获取表示用户注册来源：0表示一般注册，1表示通过活动注册
     *
     * @return source - 表示用户注册来源：0表示一般注册，1表示通过活动注册
     */
    public String getSource() {
        return source;
    }

    /**
     * 设置表示用户注册来源：0表示一般注册，1表示通过活动注册
     *
     * @param source 表示用户注册来源：0表示一般注册，1表示通过活动注册
     */
    public void setSource(String source) {
        this.source = source;
    }

    /**
     * 获取红包状态
     *
     * @return redType - 红包状态
     */
    public String getRedtype() {
        return redtype;
    }

    /**
     * 设置红包状态
     *
     * @param redtype 红包状态
     */
    public void setRedtype(String redtype) {
        this.redtype = redtype;
    }

    /**
     * 获取用户注册的时间
     *
     * @return registere_time - 用户注册的时间
     */
    public Date getRegistereTime() {
        return registereTime;
    }

    /**
     * 设置用户注册的时间
     *
     * @param registereTime 用户注册的时间
     */
    public void setRegistereTime(Date registereTime) {
        this.registereTime = registereTime;
    }

    /**
     * 获取最近登录时间
     *
     * @return login_time - 最近登录时间
     */
    public Date getLoginTime() {
        return loginTime;
    }

    /**
     * 设置最近登录时间
     *
     * @param loginTime 最近登录时间
     */
    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }
}