package com.userfront.userfront.domain;

import com.userfront.userfront.Security.UserRole;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class User {

    private Long userID;

    private String username;

    private String password;

    private String firstname;

    public Long getUserID() {
        return userID;
    }

    @Override
    public String toString() {
        return "User{" +
                "userID=" + userID +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", firstname='" + firstname + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", primaryAccount=" + primaryAccount +
                ", savingsAccount=" + savingsAccount +
                ", appointmentList=" + appointmentList +
                ", userole=" + userole +
                '}';
    }

    public void setUserID(Long userID) {
        this.userID = userID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public PrimaryAccount getPrimaryAccount() {
        return primaryAccount;
    }

    public void setPrimaryAccount(PrimaryAccount primaryAccount) {
        this.primaryAccount = primaryAccount;
    }

    public SavingsAccount getSavingsAccount() {
        return savingsAccount;
    }

    public void setSavingsAccount(SavingsAccount savingsAccount) {
        this.savingsAccount = savingsAccount;
    }

    public List<Appointment> getAppointmentList() {
        return appointmentList;
    }

    public void setAppointmentList(List<Appointment> appointmentList) {
        this.appointmentList = appointmentList;
    }

    public Set<UserRole> getUserole() {
        return userole;
    }

    public void setUserole(Set<UserRole> userole) {
        this.userole = userole;
    }

    private String email;

    private String phone;

    private PrimaryAccount primaryAccount;

    private SavingsAccount savingsAccount;

    private List<Appointment> appointmentList;

    private Set<UserRole> userole=new HashSet<>();
}
