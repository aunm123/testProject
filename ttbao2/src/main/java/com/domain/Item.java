package com.domain;

import com.tim.BaseClass.BasePojo;

import javax.persistence.*;

/**
 * Created by timhuo on 2017/5/23.
 */
@Entity
@Table
public class Item extends BasePojo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer itemid;
    @Column(length = 256,nullable = false)
    private String item_name;
    private String item_detail;
    private String item_summary;
    private String item_otherjson;
    private String item_html;
    private double item_price;
    @ManyToOne
    private Category category;

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Item() {
    }

    public Integer getItemid() {
        return itemid;
    }

    public void setItemid(Integer itemid) {
        this.itemid = itemid;
    }

    public String getItem_name() {
        return item_name;
    }

    public void setItem_name(String item_name) {
        this.item_name = item_name;
    }

    public String getItem_detail() {
        return item_detail;
    }

    public void setItem_detail(String item_detail) {
        this.item_detail = item_detail;
    }

    public String getItem_summary() {
        return item_summary;
    }

    public void setItem_summary(String item_summary) {
        this.item_summary = item_summary;
    }

    public String getItem_otherjson() {
        return item_otherjson;
    }

    public void setItem_otherjson(String item_otherjson) {
        this.item_otherjson = item_otherjson;
    }

    public String getItem_html() {
        return item_html;
    }

    public void setItem_html(String item_html) {
        this.item_html = item_html;
    }

    public double getItem_price() {
        return item_price;
    }

    public void setItem_price(double item_price) {
        this.item_price = item_price;
    }
}
