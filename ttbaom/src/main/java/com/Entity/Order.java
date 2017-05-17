package com.Entity;

import java.util.Date;

public class Order {
    private Integer orderid;

    private Integer userid;

    private Integer state;

    private Date date;

    public Order(Integer orderid, Integer userid, Integer state, Date date) {
        this.orderid = orderid;
        this.userid = userid;
        this.state = state;
        this.date = date;
    }

    public Order() {
        super();
    }

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}