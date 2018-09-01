package com.userfront.userfront.domain;

import java.math.BigDecimal;
import java.util.Date;

public class SavingsTransaction {

    private long id;

    private Date date;

    private String description;

    private String type;

    public SavingsTransaction(Date date, String description, String type, String status, double amount, BigDecimal availableBalance, SavingsAccount savingsAccount) {
        this.date = date;
        this.description = description;
        this.type = type;
        this.status = status;
        this.amount = amount;
        this.availableBalance = availableBalance;
        this.savingsAccount = savingsAccount;
    }

    private String status;

    private double amount;

    private BigDecimal availableBalance;

    private SavingsAccount savingsAccount;

    public SavingsTransaction()
    {

    }



}
