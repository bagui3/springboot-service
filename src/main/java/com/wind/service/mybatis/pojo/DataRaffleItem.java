package com.wind.service.mybatis.pojo;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "data_raffle_item")
public class DataRaffleItem {
    /**
     * id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 抽奖id
     */
    @Column(name = "raffle_id")
    private Long raffleId;

    /**
     * 抽奖物品id(commodity)
     */
    @Column(name = "commodity_id")
    private Long commodityId;

    /**
     * 抽奖物品名称(非commodity)
     */
    @Column(name = "prize_name")
    private String prizeName;

    /**
     * 抽奖积分
     */
    private Integer point;

    /**
     * 每次抽奖限制数量
     */
    @Column(name = "pre_num")
    private Integer preNum;

    /**
     * 图片url
     */
    @Column(name = "pic_url")
    private String picUrl;

    /**
     * 库存
     */
    private Integer num;

    /**
     * 中奖概率
     */
    private BigDecimal probability;

    /**
     * 抽奖类型
     */
    private String type;

    /**
     * 初始值
     */
    @Column(name = "default_num")
    private Integer defaultNum;

    @Column(name = "create_at")
    private Date createAt;

    @Column(name = "update_at")
    private Date updateAt;

    /**
     * 获取id
     *
     * @return id - id
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置id
     *
     * @param id id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取抽奖id
     *
     * @return raffle_id - 抽奖id
     */
    public Long getRaffleId() {
        return raffleId;
    }

    /**
     * 设置抽奖id
     *
     * @param raffleId 抽奖id
     */
    public void setRaffleId(Long raffleId) {
        this.raffleId = raffleId;
    }

    /**
     * 获取抽奖物品id(commodity)
     *
     * @return commodity_id - 抽奖物品id(commodity)
     */
    public Long getCommodityId() {
        return commodityId;
    }

    /**
     * 设置抽奖物品id(commodity)
     *
     * @param commodityId 抽奖物品id(commodity)
     */
    public void setCommodityId(Long commodityId) {
        this.commodityId = commodityId;
    }

    /**
     * 获取抽奖物品名称(非commodity)
     *
     * @return prize_name - 抽奖物品名称(非commodity)
     */
    public String getPrizeName() {
        return prizeName;
    }

    /**
     * 设置抽奖物品名称(非commodity)
     *
     * @param prizeName 抽奖物品名称(非commodity)
     */
    public void setPrizeName(String prizeName) {
        this.prizeName = prizeName;
    }

    /**
     * 获取抽奖积分
     *
     * @return point - 抽奖积分
     */
    public Integer getPoint() {
        return point;
    }

    /**
     * 设置抽奖积分
     *
     * @param point 抽奖积分
     */
    public void setPoint(Integer point) {
        this.point = point;
    }

    /**
     * 获取每次抽奖限制数量
     *
     * @return pre_num - 每次抽奖限制数量
     */
    public Integer getPreNum() {
        return preNum;
    }

    /**
     * 设置每次抽奖限制数量
     *
     * @param preNum 每次抽奖限制数量
     */
    public void setPreNum(Integer preNum) {
        this.preNum = preNum;
    }

    /**
     * 获取图片url
     *
     * @return pic_url - 图片url
     */
    public String getPicUrl() {
        return picUrl;
    }

    /**
     * 设置图片url
     *
     * @param picUrl 图片url
     */
    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    /**
     * 获取库存
     *
     * @return num - 库存
     */
    public Integer getNum() {
        return num;
    }

    /**
     * 设置库存
     *
     * @param num 库存
     */
    public void setNum(Integer num) {
        this.num = num;
    }

    /**
     * 获取中奖概率
     *
     * @return probability - 中奖概率
     */
    public BigDecimal getProbability() {
        return probability;
    }

    /**
     * 设置中奖概率
     *
     * @param probability 中奖概率
     */
    public void setProbability(BigDecimal probability) {
        this.probability = probability;
    }

    /**
     * 获取抽奖类型
     *
     * @return type - 抽奖类型
     */
    public String getType() {
        return type;
    }

    /**
     * 设置抽奖类型
     *
     * @param type 抽奖类型
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 获取初始值
     *
     * @return default_num - 初始值
     */
    public Integer getDefaultNum() {
        return defaultNum;
    }

    /**
     * 设置初始值
     *
     * @param defaultNum 初始值
     */
    public void setDefaultNum(Integer defaultNum) {
        this.defaultNum = defaultNum;
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