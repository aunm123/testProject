package com.Entity;

public class UserGroup {
    private Integer ugid;

    private Integer userid;

    private Integer groupid;

    public UserGroup(Integer ugid, Integer userid, Integer groupid) {
        this.ugid = ugid;
        this.userid = userid;
        this.groupid = groupid;
    }

    public UserGroup() {
        super();
    }

    public Integer getUgid() {
        return ugid;
    }

    public void setUgid(Integer ugid) {
        this.ugid = ugid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getGroupid() {
        return groupid;
    }

    public void setGroupid(Integer groupid) {
        this.groupid = groupid;
    }
}