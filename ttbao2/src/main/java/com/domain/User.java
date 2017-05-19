package com.domain;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

/**
 * Created by Tim on 2017/5/17.
 */
@Entity
@Table
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int userid;
    @Column(length = 32,nullable = false)
    private String username;
    @Column(length = 32,nullable = false)
    private String vsername;
    @Column(length = 32,nullable = false)
    private String password;
    private double salary;

    @DateTimeFormat( pattern = "yyyy-MM-dd" )
    private Date birthday;
    @Column(length = 16)
    private String gender;
    @Column(length = 64)
    private String email;
    @Column(length = 32)
    private String mobile;

    @DateTimeFormat( pattern = "yyyy-MM-dd" )
    private Date gen_date;
    @DateTimeFormat( pattern = "yyyy-MM-dd" )
    private Date last_login_time;
    private int count;
    @OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.REMOVE)
    private Set<Address> addresses;

    public User() {
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getVsername() {
        return vsername;
    }

    public void setVsername(String vsername) {
        this.vsername = vsername;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Date getGen_date() {
        return gen_date;
    }

    public void setGen_date(Date gen_date) {
        this.gen_date = gen_date;
    }

    public Date getLast_login_time() {
        return last_login_time;
    }

    public void setLast_login_time(Date last_login_time) {
        this.last_login_time = last_login_time;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Set<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(Set<Address> addresses) {
        this.addresses = addresses;
    }
}