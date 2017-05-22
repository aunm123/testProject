package com.Entity;

public class RoleRight {
    private Integer rrid;

    private Integer roleid;

    private Integer rightid;

    private Integer rightType;

    public RoleRight(Integer rrid, Integer roleid, Integer rightid, Integer rightType) {
        this.rrid = rrid;
        this.roleid = roleid;
        this.rightid = rightid;
        this.rightType = rightType;
    }

    public RoleRight() {
        super();
    }

    public Integer getRrid() {
        return rrid;
    }

    public void setRrid(Integer rrid) {
        this.rrid = rrid;
    }

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
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