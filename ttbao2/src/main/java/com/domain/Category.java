package com.domain;

import com.tim.BaseClass.BasePojo;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by timhuo on 2017/5/23.
 */
@Entity
@Table
public class Category extends BasePojo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer categoryid;
    @Column(length = 256,nullable = false)
    private String category_name;
    private Integer pid;

    @OneToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL,orphanRemoval = true)
    private IconImg iconImg;

    @OneToMany(fetch = FetchType.LAZY)
    private Set<Item> itemSet;

    public Set<Item> getItemSet() {
        return itemSet;
    }

    public void setItemSet(Set<Item> itemSet) {
        this.itemSet = itemSet;
    }

    public Category() {
    }

    public Integer getCategoryid() {
        return categoryid;
    }

    public void setCategoryid(Integer categoryid) {
        this.categoryid = categoryid;
    }

    public String getCategory_name() {
        return category_name;
    }

    public void setCategory_name(String category_name) {
        this.category_name = category_name;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public IconImg getIconImg() {
        return iconImg;
    }

    public void setIconImg(IconImg iconImg) {
        this.iconImg = iconImg;
    }
}
