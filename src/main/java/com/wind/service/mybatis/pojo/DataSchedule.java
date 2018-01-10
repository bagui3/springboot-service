package com.wind.service.mybatis.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "data_schedule")
public class DataSchedule {
    /**
     * 记录id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 医生ID
     */
    @Column(name = "professor_id")
    private Long professorId;

    /**
     * 值班日期
     */
    @Column(name = "work_date")
    private Date workDate;

    /**
     * 值班时间段
     */
    @Column(name = "date_section")
    private String dateSection;

    @Column(name = "create_at")
    private Date createAt;

    @Column(name = "update_at")
    private Date updateAt;

    /**
     * 获取记录id
     *
     * @return id - 记录id
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置记录id
     *
     * @param id 记录id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取医生ID
     *
     * @return professor_id - 医生ID
     */
    public Long getProfessorId() {
        return professorId;
    }

    /**
     * 设置医生ID
     *
     * @param professorId 医生ID
     */
    public void setProfessorId(Long professorId) {
        this.professorId = professorId;
    }

    /**
     * 获取值班日期
     *
     * @return work_date - 值班日期
     */
    public Date getWorkDate() {
        return workDate;
    }

    /**
     * 设置值班日期
     *
     * @param workDate 值班日期
     */
    public void setWorkDate(Date workDate) {
        this.workDate = workDate;
    }

    /**
     * 获取值班时间段
     *
     * @return date_section - 值班时间段
     */
    public String getDateSection() {
        return dateSection;
    }

    /**
     * 设置值班时间段
     *
     * @param dateSection 值班时间段
     */
    public void setDateSection(String dateSection) {
        this.dateSection = dateSection;
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