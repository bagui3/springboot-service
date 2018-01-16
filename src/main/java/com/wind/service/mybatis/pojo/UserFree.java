package com.wind.service.mybatis.pojo;

import javax.persistence.*;

@Table(name = "user_free")
public class UserFree {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 账户
     */
    private String account;

    /**
     * 账户类型
     */
    @Column(name = "account_type")
    private String accountType;

    /**
     * 免费的线路Id example:1,2,3
     */
    @Column(name = "line_ids")
    private String lineIds;

    /**
     * 来源
     */
    private String source;

    /**
     * 免费的线路类型Id example:1,2,3
     */
    @Column(name = "line_type_ids")
    private String lineTypeIds;

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
     * 获取账户
     *
     * @return account - 账户
     */
    public String getAccount() {
        return account;
    }

    /**
     * 设置账户
     *
     * @param account 账户
     */
    public void setAccount(String account) {
        this.account = account;
    }

    /**
     * 获取账户类型
     *
     * @return account_type - 账户类型
     */
    public String getAccountType() {
        return accountType;
    }

    /**
     * 设置账户类型
     *
     * @param accountType 账户类型
     */
    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    /**
     * 获取免费的线路Id example:1,2,3
     *
     * @return line_ids - 免费的线路Id example:1,2,3
     */
    public String getLineIds() {
        return lineIds;
    }

    /**
     * 设置免费的线路Id example:1,2,3
     *
     * @param lineIds 免费的线路Id example:1,2,3
     */
    public void setLineIds(String lineIds) {
        this.lineIds = lineIds;
    }

    /**
     * 获取来源
     *
     * @return source - 来源
     */
    public String getSource() {
        return source;
    }

    /**
     * 设置来源
     *
     * @param source 来源
     */
    public void setSource(String source) {
        this.source = source;
    }

    /**
     * 获取免费的线路类型Id example:1,2,3
     *
     * @return line_type_ids - 免费的线路类型Id example:1,2,3
     */
    public String getLineTypeIds() {
        return lineTypeIds;
    }

    /**
     * 设置免费的线路类型Id example:1,2,3
     *
     * @param lineTypeIds 免费的线路类型Id example:1,2,3
     */
    public void setLineTypeIds(String lineTypeIds) {
        this.lineTypeIds = lineTypeIds;
    }
}