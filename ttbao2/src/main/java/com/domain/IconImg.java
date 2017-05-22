package com.domain;

import javax.persistence.*;

/**
 * Created by Tim on 2017/5/21.
 */
@Entity
@Table
public class IconImg {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int iconid;
    @Column(length = 128,nullable = true)
    private String url;

    public IconImg() {
    }

    public int getIconid() {
        return iconid;
    }

    public void setIconid(int iconid) {
        this.iconid = iconid;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
