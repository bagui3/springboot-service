package com.wind.service.mybatis.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "data_professor")
public class DataProfessor {
    /**
     * 医生ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 部门名称
     */
    @Column(name = "department_name")
    private String departmentName;

    /**
     * 医生姓名
     */
    private String name;

    /**
     * 医生职位
     */
    private String position;

    /**
     * 医生专长
     */
    private String skill;

    /**
     * 医生描述
     */
    private String descript;

    /**
     * 显示排序
     */
    private Integer sequence;

    /**
     * 医生评分
     */
    private String level;

    /**
     * 医生图片
     */
    @Column(name = "pic_url")
    private String picUrl;

    @Column(name = "create_at")
    private Date createAt;

    @Column(name = "update_at")
    private Date updateAt;

    /**
     * 获取医生ID
     *
     * @return id - 医生ID
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置医生ID
     *
     * @param id 医生ID
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取部门名称
     *
     * @return department_name - 部门名称
     */
    public String getDepartmentName() {
        return departmentName;
    }

    /**
     * 设置部门名称
     *
     * @param departmentName 部门名称
     */
    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    /**
     * 获取医生姓名
     *
     * @return name - 医生姓名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置医生姓名
     *
     * @param name 医生姓名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取医生职位
     *
     * @return position - 医生职位
     */
    public String getPosition() {
        return position;
    }

    /**
     * 设置医生职位
     *
     * @param position 医生职位
     */
    public void setPosition(String position) {
        this.position = position;
    }

    /**
     * 获取医生专长
     *
     * @return skill - 医生专长
     */
    public String getSkill() {
        return skill;
    }

    /**
     * 设置医生专长
     *
     * @param skill 医生专长
     */
    public void setSkill(String skill) {
        this.skill = skill;
    }

    /**
     * 获取医生描述
     *
     * @return descript - 医生描述
     */
    public String getDescript() {
        return descript;
    }

    /**
     * 设置医生描述
     *
     * @param descript 医生描述
     */
    public void setDescript(String descript) {
        this.descript = descript;
    }

    /**
     * 获取显示排序
     *
     * @return sequence - 显示排序
     */
    public Integer getSequence() {
        return sequence;
    }

    /**
     * 设置显示排序
     *
     * @param sequence 显示排序
     */
    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }

    /**
     * 获取医生评分
     *
     * @return level - 医生评分
     */
    public String getLevel() {
        return level;
    }

    /**
     * 设置医生评分
     *
     * @param level 医生评分
     */
    public void setLevel(String level) {
        this.level = level;
    }

    /**
     * 获取医生图片
     *
     * @return pic_url - 医生图片
     */
    public String getPicUrl() {
        return picUrl;
    }

    /**
     * 设置医生图片
     *
     * @param picUrl 医生图片
     */
    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
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