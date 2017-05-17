package com.Entity;

public class Item {
    private Integer itemid;

    private String name;

    private Float price;

    private String content;

    private String detail;

    public Item(Integer itemid, String name, Float price, String content, String detail) {
        this.itemid = itemid;
        this.name = name;
        this.price = price;
        this.content = content;
        this.detail = detail;
    }

    public Item() {
        super();
    }

    public Integer getItemid() {
        return itemid;
    }

    public void setItemid(Integer itemid) {
        this.itemid = itemid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail == null ? null : detail.trim();
    }
}