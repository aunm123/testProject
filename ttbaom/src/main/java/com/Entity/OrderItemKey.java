package com.Entity;

import java.io.Serializable;

public class OrderItemKey implements Serializable {
    private Integer orderid;

    private Integer itemid;

    public OrderItemKey(Integer orderid, Integer itemid) {
        this.orderid = orderid;
        this.itemid = itemid;
    }

    public OrderItemKey() {
        super();
    }

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    public Integer getItemid() {
        return itemid;
    }

    public void setItemid(Integer itemid) {
        this.itemid = itemid;
    }
}