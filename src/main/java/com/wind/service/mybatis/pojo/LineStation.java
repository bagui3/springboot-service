package com.wind.service.mybatis.pojo;

import javax.persistence.*;

@Table(name = "line_station")
public class LineStation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 线路id
     */
    @Column(name = "line_id")
    private Long lineId;

    /**
     * 站点id
     */
    @Column(name = "station_id")
    private Long stationId;

    /**
     * 序号
     */
    private Integer index;

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
     * 获取站点id
     *
     * @return station_id - 站点id
     */
    public Long getStationId() {
        return stationId;
    }

    /**
     * 设置站点id
     *
     * @param stationId 站点id
     */
    public void setStationId(Long stationId) {
        this.stationId = stationId;
    }

    /**
     * 获取序号
     *
     * @return index - 序号
     */
    public Integer getIndex() {
        return index;
    }

    /**
     * 设置序号
     *
     * @param index 序号
     */
    public void setIndex(Integer index) {
        this.index = index;
    }
}