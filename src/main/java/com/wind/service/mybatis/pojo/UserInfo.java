package com.wind.service.mybatis.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "user_info")
public class UserInfo {
    /**
     * 用户ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 角色
     */
    private String role;

    /**
     * 用户昵称
     */
    private String nickname;

    /**
     * 用户头像
     */
    private String avatar;

    /**
     * 用户手机号
     */
    private String phone;

    /**
     * 用户身份证号
     */
    private String idcard;

    /**
     * 是否认证
     */
    @Column(name = "is_certification")
    private Boolean isCertification;

    /**
     * 真实姓名
     */
    private String realname;

    /**
     * 用户积分
     */
    private Integer point;

    /**
     * 微信openid
     */
    private String weixin;

    /**
     * QQopenid
     */
    private String qq;

    /**
     * 微博openid
     */
    private String weibo;

    /**
     * 预产期
     */
    @Column(name = "pregnancy_time")
    private Date pregnancyTime;

    /**
     * 收货地址
     */
    @Column(name = "user_address")
    private String userAddress;

    /**
     * 邀请用户ID
     */
    @Column(name = "parent_user_id")
    private Long parentUserId;

    private String privilege;

    @Column(name = "create_at")
    private Date createAt;

    @Column(name = "update_at")
    private Date updateAt;

    /**
     * 获取用户ID
     *
     * @return id - 用户ID
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置用户ID
     *
     * @param id 用户ID
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取角色
     *
     * @return role - 角色
     */
    public String getRole() {
        return role;
    }

    /**
     * 设置角色
     *
     * @param role 角色
     */
    public void setRole(String role) {
        this.role = role;
    }

    /**
     * 获取用户昵称
     *
     * @return nickname - 用户昵称
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * 设置用户昵称
     *
     * @param nickname 用户昵称
     */
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    /**
     * 获取用户头像
     *
     * @return avatar - 用户头像
     */
    public String getAvatar() {
        return avatar;
    }

    /**
     * 设置用户头像
     *
     * @param avatar 用户头像
     */
    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    /**
     * 获取用户手机号
     *
     * @return phone - 用户手机号
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置用户手机号
     *
     * @param phone 用户手机号
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 获取用户身份证号
     *
     * @return idcard - 用户身份证号
     */
    public String getIdcard() {
        return idcard;
    }

    /**
     * 设置用户身份证号
     *
     * @param idcard 用户身份证号
     */
    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    /**
     * 获取是否认证
     *
     * @return is_certification - 是否认证
     */
    public Boolean getIsCertification() {
        return isCertification;
    }

    /**
     * 设置是否认证
     *
     * @param isCertification 是否认证
     */
    public void setIsCertification(Boolean isCertification) {
        this.isCertification = isCertification;
    }

    /**
     * 获取真实姓名
     *
     * @return realname - 真实姓名
     */
    public String getRealname() {
        return realname;
    }

    /**
     * 设置真实姓名
     *
     * @param realname 真实姓名
     */
    public void setRealname(String realname) {
        this.realname = realname;
    }

    /**
     * 获取用户积分
     *
     * @return point - 用户积分
     */
    public Integer getPoint() {
        return point;
    }

    /**
     * 设置用户积分
     *
     * @param point 用户积分
     */
    public void setPoint(Integer point) {
        this.point = point;
    }

    /**
     * 获取微信openid
     *
     * @return weixin - 微信openid
     */
    public String getWeixin() {
        return weixin;
    }

    /**
     * 设置微信openid
     *
     * @param weixin 微信openid
     */
    public void setWeixin(String weixin) {
        this.weixin = weixin;
    }

    /**
     * 获取QQopenid
     *
     * @return qq - QQopenid
     */
    public String getQq() {
        return qq;
    }

    /**
     * 设置QQopenid
     *
     * @param qq QQopenid
     */
    public void setQq(String qq) {
        this.qq = qq;
    }

    /**
     * 获取微博openid
     *
     * @return weibo - 微博openid
     */
    public String getWeibo() {
        return weibo;
    }

    /**
     * 设置微博openid
     *
     * @param weibo 微博openid
     */
    public void setWeibo(String weibo) {
        this.weibo = weibo;
    }

    /**
     * 获取预产期
     *
     * @return pregnancy_time - 预产期
     */
    public Date getPregnancyTime() {
        return pregnancyTime;
    }

    /**
     * 设置预产期
     *
     * @param pregnancyTime 预产期
     */
    public void setPregnancyTime(Date pregnancyTime) {
        this.pregnancyTime = pregnancyTime;
    }

    /**
     * 获取收货地址
     *
     * @return user_address - 收货地址
     */
    public String getUserAddress() {
        return userAddress;
    }

    /**
     * 设置收货地址
     *
     * @param userAddress 收货地址
     */
    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    /**
     * 获取邀请用户ID
     *
     * @return parent_user_id - 邀请用户ID
     */
    public Long getParentUserId() {
        return parentUserId;
    }

    /**
     * 设置邀请用户ID
     *
     * @param parentUserId 邀请用户ID
     */
    public void setParentUserId(Long parentUserId) {
        this.parentUserId = parentUserId;
    }

    /**
     * @return privilege
     */
    public String getPrivilege() {
        return privilege;
    }

    /**
     * @param privilege
     */
    public void setPrivilege(String privilege) {
        this.privilege = privilege;
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