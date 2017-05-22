package com.Entity;

public class GroupRight {
    private Integer grid;

    private Integer groupid;

    private Integer rightid;

    private Integer rightType;

    public GroupRight(Integer grid, Integer groupid, Integer rightid, Integer rightType) {
        this.grid = grid;
        this.groupid = groupid;
        this.rightid = rightid;
        this.rightType = rightType;
    }

    public GroupRight() {
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