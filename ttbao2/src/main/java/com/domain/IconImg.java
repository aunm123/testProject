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
    private Integer iconid;
    @Column(length = 128,nullable = true)
    private String url;

    public IconImg() {
    }

    public Integer getIconid() {
        return iconid;
    }

    public void setIconid(Integer iconid) {
        this.iconid = iconid;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
