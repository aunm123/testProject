package com.Entity;

public class Right {
    private Integer rightid;

    private Integer parentRightid;

    private String rightName;

    private String description;

    public Right(Integer rightid, Integer parentRightid, String rightName, String description) {
        this.rightid = rightid;
        this.parentRightid = parentRightid;
        this.rightName = rightName;
        this.description = description;
    }

    public Right() {
        super();
    }

    public Integer getRightid() {
        return rightid;
    }

    public void setRightid(Integer rightid) {
        this.rightid = rightid;
    }

    public Integer getParentRightid() {
        return parentRightid;
    }

    public void setParentRightid(Integer parentRightid) {
        this.parentRightid = parentRightid;
    }

    public String getRightName() {
        return rightName;
    }

    public void setRightName(String rightName) {
        this.rightName = rightName == null ? null : rightName.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}