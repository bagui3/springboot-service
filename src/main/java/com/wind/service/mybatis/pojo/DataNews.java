package com.wind.service.mybatis.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "data_news")
public class DataNews {
    /**
     * 新闻id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 新闻标题
     */
    private String title;

    /**
     * 新闻来源
     */
    private String source;

    /**
     * 新闻分类
     */
    private String category;

    /**
     * 视频连接
     */
    @Column(name = "video_url")
    private String videoUrl;

    /**
     * 新闻标签[逗号隔开]
     */
    private String tags;

    /**
     * 顺序
     */
    private Integer sequence;

    @Column(name = "publish_time")
    private Date publishTime;

    /**
     * 阅读次数
     */
    @Column(name = "read_count")
    private Integer readCount;

    @Column(name = "create_at")
    private Date createAt;

    @Column(name = "update_at")
    private Date updateAt;

    /**
     * 新闻内容
     */
    private String content;

    /**
     * 获取新闻id
     *
     * @return id - 新闻id
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置新闻id
     *
     * @param id 新闻id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取新闻标题
     *
     * @return title - 新闻标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置新闻标题
     *
     * @param title 新闻标题
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 获取新闻来源
     *
     * @return source - 新闻来源
     */
    public String getSource() {
        return source;
    }

    /**
     * 设置新闻来源
     *
     * @param source 新闻来源
     */
    public void setSource(String source) {
        this.source = source;
    }

    /**
     * 获取新闻分类
     *
     * @return category - 新闻分类
     */
    public String getCategory() {
        return category;
    }

    /**
     * 设置新闻分类
     *
     * @param category 新闻分类
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * 获取视频连接
     *
     * @return video_url - 视频连接
     */
    public String getVideoUrl() {
        return videoUrl;
    }

    /**
     * 设置视频连接
     *
     * @param videoUrl 视频连接
     */
    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    /**
     * 获取新闻标签[逗号隔开]
     *
     * @return tags - 新闻标签[逗号隔开]
     */
    public String getTags() {
        return tags;
    }

    /**
     * 设置新闻标签[逗号隔开]
     *
     * @param tags 新闻标签[逗号隔开]
     */
    public void setTags(String tags) {
        this.tags = tags;
    }

    /**
     * 获取顺序
     *
     * @return sequence - 顺序
     */
    public Integer getSequence() {
        return sequence;
    }

    /**
     * 设置顺序
     *
     * @param sequence 顺序
     */
    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }

    /**
     * @return publish_time
     */
    public Date getPublishTime() {
        return publishTime;
    }

    /**
     * @param publishTime
     */
    public void setPublishTime(Date publishTime) {
        this.publishTime = publishTime;
    }

    /**
     * 获取阅读次数
     *
     * @return read_count - 阅读次数
     */
    public Integer getReadCount() {
        return readCount;
    }

    /**
     * 设置阅读次数
     *
     * @param readCount 阅读次数
     */
    public void setReadCount(Integer readCount) {
        this.readCount = readCount;
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
     * 获取新闻内容
     *
     * @return content - 新闻内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置新闻内容
     *
     * @param content 新闻内容
     */
    public void setContent(String content) {
        this.content = content;
    }
}