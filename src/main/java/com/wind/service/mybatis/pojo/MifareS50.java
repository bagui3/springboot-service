package com.wind.service.mybatis.pojo;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "mifare_s50")
public class MifareS50 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * UID
     */
    private String uid;

    /**
     * 余额
     */
    private BigDecimal balance;

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
     * 获取UID
     *
     * @return uid - UID
     */
    public String getUid() {
        return uid;
    }

    /**
     * 设置UID
     *
     * @param uid UID
     */
    public void setUid(String uid) {
        this.uid = uid;
    }

    /**
     * 获取余额
     *
     * @return balance - 余额
     */
    public BigDecimal getBalance() {
        return balance;
    }

    /**
     * 设置余额
     *
     * @param balance 余额
     */
    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }
}