package com.Entity;

import java.util.Date;

public class Group {
    private Integer groupid;

    private String groupName;

    private Integer parentGroupid;

    private Date genTime;

    private String description;

    public Group(Integer groupid, String groupName, Integer parentGroupid, Date genTime, String description) {
        this.groupid = groupid;
        this.groupName = groupName;
        this.parentGroupid = parentGroupid;
        this.genTime = genTime;
        this.description = description;
    }

    public Group() {
        super();
    }

    public Integer getGroupid() {
        return groupid;
    }

    public void setGroupid(Integer groupid) {
        this.groupid = groupid;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName == null ? null : groupName.trim();
    }

    public Integer getParentGroupid() {
        return parentGroupid;
    }

    public void setParentGroupid(Integer parentGroupid) {
        this.parentGroupid = parentGroupid;
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