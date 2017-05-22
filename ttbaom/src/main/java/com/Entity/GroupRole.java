package com.Entity;

public class GroupRole {
    private Integer grid;

    private Integer groupid;

    private Integer roleid;

    public GroupRole(Integer grid, Integer groupid, Integer roleid) {
        this.grid = grid;
        this.groupid = groupid;
        this.roleid = roleid;
    }

    public GroupRole() {
        super();
    }

    public Integer getGrid() {
        return grid;
    }

    public void setGrid(Integer grid) {
        this.grid = grid;
    }

    public Integer getGroupid() {
        return groupid;
    }

    public void setGroupid(Integer groupid) {
        this.groupid = groupid;
    }

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }
}