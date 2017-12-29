package com.wind.service.mybatis.pojo;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

public class Commodity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 商品名称
     */
    private String name;

    /**
     * 描述
     */
    private String depict;

    /**
     * 价格
     */
    private BigDecimal price;

    /**
     * 数量
     */
    private Integer amount;

    /**
     * 标题图片
     */
    @Column(name = "item_img")
    private String itemImg;

    /**
     * 商品图片
     */
    private String img;

    /**
     * 积分
     */
    private Integer point;

    /**
     * 优惠券类型
     */
    @Column(name = "coupon_type")
    private Integer couponType;

    /**
     * 商品类型id
     */
    @Column(name = "type_id")
    private Long typeId;

    /**
     * 创建时间
     */
    @Column(name = "active_time")
    private Date activeTime;

    private Integer flag;

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
     * 获取商品名称
     *
     * @return name - 商品名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置商品名称
     *
     * @param name 商品名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取描述
     *
     * @return depict - 描述
     */
    public String getDepict() {
        return depict;
    }

    /**
     * 设置描述
     *
     * @param depict 描述
     */
    public void setDepict(String depict) {
        this.depict = depict;
    }

    /**
     * 获取价格
     *
     * @return price - 价格
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * 设置价格
     *
     * @param price 价格
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * 获取数量
     *
     * @return amount - 数量
     */
    public Integer getAmount() {
        return amount;
    }

    /**
     * 设置数量
     *
     * @param amount 数量
     */
    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    /**
     * 获取标题图片
     *
     * @return item_img - 标题图片
     */
    public String getItemImg() {
        return itemImg;
    }

    /**
     * 设置标题图片
     *
     * @param itemImg 标题图片
     */
    public void setItemImg(String itemImg) {
        this.itemImg = itemImg;
    }

    /**
     * 获取商品图片
     *
     * @return img - 商品图片
     */
    public String getImg() {
        return img;
    }

    /**
     * 设置商品图片
     *
     * @param img 商品图片
     */
    public void setImg(String img) {
        this.img = img;
    }

    /**
     * 获取积分
     *
     * @return point - 积分
     */
    public Integer getPoint() {
        return point;
    }

    /**
     * 设置积分
     *
     * @param point 积分
     */
    public void setPoint(Integer point) {
        this.point = point;
    }

    /**
     * 获取优惠券类型
     *
     * @return coupon_type - 优惠券类型
     */
    public Integer getCouponType() {
        return couponType;
    }

    /**
     * 设置优惠券类型
     *
     * @param couponType 优惠券类型
     */
    public void setCouponType(Integer couponType) {
        this.couponType = couponType;
    }

    /**
     * 获取商品类型id
     *
     * @return type_id - 商品类型id
     */
    public Long getTypeId() {
        return typeId;
    }

    /**
     * 设置商品类型id
     *
     * @param typeId 商品类型id
     */
    public void setTypeId(Long typeId) {
        this.typeId = typeId;
    }

    /**
     * 获取创建时间
     *
     * @return active_time - 创建时间
     */
    public Date getActiveTime() {
        return activeTime;
    }

    /**
     * 设置创建时间
     *
     * @param activeTime 创建时间
     */
    public void setActiveTime(Date activeTime) {
        this.activeTime = activeTime;
    }

    /**
     * @return flag
     */
    public Integer getFlag() {
        return flag;
    }

    /**
     * @param flag
     */
    public void setFlag(Integer flag) {
        this.flag = flag;
    }
}