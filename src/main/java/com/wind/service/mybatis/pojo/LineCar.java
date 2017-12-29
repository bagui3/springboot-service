package com.wind.service.mybatis.pojo;

import javax.persistence.*;

@Table(name = "line_car")
public class LineCar {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 线路id
     */
    @Column(name = "line_id")
    private Long lineId;

    private String licenseplate;

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
     * @return licenseplate
     */
    public String getLicenseplate() {
        return licenseplate;
    }

    /**
     * @param licenseplate
     */
    public void setLicenseplate(String licenseplate) {
        this.licenseplate = licenseplate;
    }
}