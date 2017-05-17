package com.Entity;

public class OrderItem extends OrderItemKey {
    private Integer number;

    public OrderItem(Integer orderid, Integer itemid, Integer number) {
        super(orderid, itemid);
        this.number = number;
    }

    public OrderItem() {
        super();
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
}