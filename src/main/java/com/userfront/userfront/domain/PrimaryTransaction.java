package com.userfront.userfront.domain;

import java.math.BigDecimal;
import java.util.Date;

public class PrimaryTransaction {
    public PrimaryTransaction(long id, Date date, String descripion, double amount, BigDecimal availablebalance, String type, String status) {
        this.id = id;
        this.date = date;
        this.descripion = descripion;
        this.amount = amount;
        this.availablebalance = availablebalance;
        this.type = type;
        this.status = status;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDescripion() {
        return descripion;
    }

    public void setDescripion(String descripion) {
        this.descripion = descripion;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public BigDecimal getAvailablebalance() {
        return availablebalance;
    }

    public void setAvailablebalance(BigDecimal availablebalance) {
        this.availablebalance = availablebalance;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public PrimaryTransaction()
    {

    }

    private long id;
    private Date date;
    private String descripion;
    private double amount;
    private BigDecimal availablebalance;
    private String type;
    private String status;
    private PrimaryAccount primaryAccount;

    public PrimaryAccount getPrimaryAccount() {
        return primaryAccount;
    }

    public void setPrimaryAccount(PrimaryAccount primaryAccount) {
        this.primaryAccount = primaryAccount;
    }
}
