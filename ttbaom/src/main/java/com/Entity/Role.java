package com.Entity;

import java.util.Date;

public class Role {
    private Integer roleid;

    private Integer parentRoleid;

    private String roleName;

    private Date genTime;

    private String description;

    public Role(Integer roleid, Integer parentRoleid, String roleName, Date genTime, String description) {
        this.roleid = roleid;
        this.parentRoleid = parentRoleid;
        this.roleName = roleName;
        this.genTime = genTime;
        this.description = description;
    }

    public Role() {
        super();
    }

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    public Integer getParentRoleid() {
        return parentRoleid;
    }

    public void setParentRoleid(Integer parentRoleid) {
        this.parentRoleid = parentRoleid;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    public Date getGenTime() {
        return genTime;
    }

    public void setGenTime(Date genTime) {
        this.genTime = genTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}