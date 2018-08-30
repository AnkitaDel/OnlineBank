package com.userfront.userfront.domain;

import java.math.BigDecimal;
import java.util.List;

public class SavingsAccount {
    private Long id;
    private int accountNumber;

    public List<SavingsTransaction> getSavingsTransactions() {
        return savingsTransactions;
    }

    public void setSavingsTransactions(List<SavingsTransaction> savingsTransactions) {
        this.savingsTransactions = savingsTransactions;
    }

    private BigDecimal accountBalance;
    private List<SavingsTransaction>  savingsTransactions;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public BigDecimal getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(BigDecimal accountBalance) {
        this.accountBalance = accountBalance;
    }
}
