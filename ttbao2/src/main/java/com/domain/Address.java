package com.domain;

import com.tim.BaseClass.BasePojo;

import javax.persistence.*;

/**
 * Created by timhuo on 2017/5/18.
 */
@Entity
@Table
public class Address extends BasePojo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer addressid;
    private int provinceid;
    private int countryid;
    private int cityid;
    private int regionid;
    private String addressStr;

    public String getAddressStr() {
        return addressStr;
    }

    public void setAddressStr(String addressStr) {
        this.addressStr = addressStr;
    }

    @ManyToOne
    private User user;

    public Address() {
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Integer getAddressid() {
        return addressid;
    }

    public void setAddressid(Integer addressid) {
        this.addressid = addressid;
    }

    public int getProvinceid() {
        return provinceid;
    }

    public void setProvinceid(int provinceid) {
        this.provinceid = provinceid;
    }

    public int getCountryid() {
        return countryid;
    }

    public void setCountryid(int countryid) {
        this.countryid = countryid;
    }

    public int getCityid() {
        return cityid;
    }

    public void setCityid(int cityid) {
        this.cityid = cityid;
    }

    public int getRegionid() {
        return regionid;
    }

    public void setRegionid(int regionid) {
        this.regionid = regionid;
    }
}
