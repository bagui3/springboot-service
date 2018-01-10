package com.wind.service.mybatis.pojo;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "data_commodity")
public class DataCommodity {
    /**
     * 商品ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 商品所属店铺
     */
    @Column(name = "shop_id")
    private Long shopId;

    /**
     * 商品名称
     */
    private String name;

    /**
     * 商品数量
     */
    private Integer inventory;

    /**
     * 商品价格
     */
    private BigDecimal price;

    /**
     * 商品描述
     */
    private String description;

    /**
     * 商品类别[摇奖 体检]
     */
    @Column(name = "commodity_type")
    private String commodityType;

    /**
     * 商品积分
     */
    private Integer point;

    private String classify;

    private Integer sequence;

    private Integer status;

    @Column(name = "original_price")
    private BigDecimal originalPrice;

    private String attributes;

    @Column(name = "start_time")
    private Date startTime;

    @Column(name = "end_time")
    private Date endTime;

    @Column(name = "create_at")
    private Date createAt;

    @Column(name = "update_at")
    private Date updateAt;

    private String url;

    @Column(name = "commodity_title")
    private String commodityTitle;

    @Column(name = "commodity_name")
    private String commodityName;

    @Column(name = "commodity_description")
    private String commodityDescription;

    /**
     * 获取商品ID
     *
     * @return id - 商品ID
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置商品ID
     *
     * @param id 商品ID
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取商品所属店铺
     *
     * @return shop_id - 商品所属店铺
     */
    public Long getShopId() {
        return shopId;
    }

    /**
     * 设置商品所属店铺
     *
     * @param shopId 商品所属店铺
     */
    public void setShopId(Long shopId) {
        this.shopId = shopId;
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
     * 获取商品数量
     *
     * @return inventory - 商品数量
     */
    public Integer getInventory() {
        return inventory;
    }

    /**
     * 设置商品数量
     *
     * @param inventory 商品数量
     */
    public void setInventory(Integer inventory) {
        this.inventory = inventory;
    }

    /**
     * 获取商品价格
     *
     * @return price - 商品价格
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * 设置商品价格
     *
     * @param price 商品价格
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * 获取商品描述
     *
     * @return description - 商品描述
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置商品描述
     *
     * @param description 商品描述
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 获取商品类别[摇奖 体检]
     *
     * @return commodity_type - 商品类别[摇奖 体检]
     */
    public String getCommodityType() {
        return commodityType;
    }

    /**
     * 设置商品类别[摇奖 体检]
     *
     * @param commodityType 商品类别[摇奖 体检]
     */
    public void setCommodityType(String commodityType) {
        this.commodityType = commodityType;
    }

    /**
     * 获取商品积分
     *
     * @return point - 商品积分
     */
    public Integer getPoint() {
        return point;
    }

    /**
     * 设置商品积分
     *
     * @param point 商品积分
     */
    public void setPoint(Integer point) {
        this.point = point;
    }

    /**
     * @return classify
     */
    public String getClassify() {
        return classify;
    }

    /**
     * @param classify
     */
    public void setClassify(String classify) {
        this.classify = classify;
    }

    /**
     * @return sequence
     */
    public Integer getSequence() {
        return sequence;
    }

    /**
     * @param sequence
     */
    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * @param status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * @return original_price
     */
    public BigDecimal getOriginalPrice() {
        return originalPrice;
    }

    /**
     * @param originalPrice
     */
    public void setOriginalPrice(BigDecimal originalPrice) {
        this.originalPrice = originalPrice;
    }

    /**
     * @return attributes
     */
    public String getAttributes() {
        return attributes;
    }

    /**
     * @param attributes
     */
    public void setAttributes(String attributes) {
        this.attributes = attributes;
    }

    /**
     * @return start_time
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * @param startTime
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * @return end_time
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * @param endTime
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
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

    /**
     * @return url
     */
    public String getUrl() {
        return url;
    }

    /**
     * @param url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * @return commodity_title
     */
    public String getCommodityTitle() {
        return commodityTitle;
    }

    /**
     * @param commodityTitle
     */
    public void setCommodityTitle(String commodityTitle) {
        this.commodityTitle = commodityTitle;
    }

    /**
     * @return commodity_name
     */
    public String getCommodityName() {
        return commodityName;
    }

    /**
     * @param commodityName
     */
    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName;
    }

    /**
     * @return commodity_description
     */
    public String getCommodityDescription() {
        return commodityDescription;
    }

    /**
     * @param commodityDescription
     */
    public void setCommodityDescription(String commodityDescription) {
        this.commodityDescription = commodityDescription;
    }
}