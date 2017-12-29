package com.wind.service.mybatis.pojo;

import java.util.Date;
import javax.persistence.*;

public class News {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 图片
     */
    private String image;

    /**
     * 标题
     */
    private String title;

    /**
     * 内容
     */
    private String content;

    /**
     * 类型
     */
    private String type;

    /**
     * 作者
     */
    private String author;

    /**
     * 时间
     */
    private Date time;

    /**
     * 1：表示列表新闻 2：表示轮播新闻
     */
    private Integer source;

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
     * 获取图片
     *
     * @return image - 图片
     */
    public String getImage() {
        return image;
    }

    /**
     * 设置图片
     *
     * @param image 图片
     */
    public void setImage(String image) {
        this.image = image;
    }

    /**
     * 获取标题
     *
     * @return title - 标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置标题
     *
     * @param title 标题
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 获取内容
     *
     * @return content - 内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置内容
     *
     * @param content 内容
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * 获取类型
     *
     * @return type - 类型
     */
    public String getType() {
        return type;
    }

    /**
     * 设置类型
     *
     * @param type 类型
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 获取作者
     *
     * @return author - 作者
     */
    public String getAuthor() {
        return author;
    }

    /**
     * 设置作者
     *
     * @param author 作者
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * 获取时间
     *
     * @return time - 时间
     */
    public Date getTime() {
        return time;
    }

    /**
     * 设置时间
     *
     * @param time 时间
     */
    public void setTime(Date time) {
        this.time = time;
    }

    /**
     * 获取1：表示列表新闻 2：表示轮播新闻
     *
     * @return source - 1：表示列表新闻 2：表示轮播新闻
     */
    public Integer getSource() {
        return source;
    }

    /**
     * 设置1：表示列表新闻 2：表示轮播新闻
     *
     * @param source 1：表示列表新闻 2：表示轮播新闻
     */
    public void setSource(Integer source) {
        this.source = source;
    }
}