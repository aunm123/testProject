package com.Entity;

public class UserRight {
    private Integer urid;

    private Integer userid;

    private Integer rightid;

    private Integer rightType;

    public UserRight(Integer urid, Integer userid, Integer rightid, Integer rightType) {
        this.urid = urid;
        this.userid = userid;
        this.rightid = rightid;
        this.rightType = rightType;
    }

    public UserRight() {
        super();
    }

    public Integer getUrid() {
        return urid;
    }

    public void setUrid(Integer urid) {
        this.urid = urid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getRightid() {
        return rightid;
    }

    public void setRightid(Integer rightid) {
        this.rightid = rightid;
    }

    public Integer getRightType() {
        return rightType;
    }

    public void setRightType(Integer rightType) {
        this.rightType = rightType;
    }
}