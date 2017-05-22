package com.Entity;

import java.util.Date;

public class Organization {
    private Integer organizationid;

    private Integer parentOrganizationid;

    private String organizationname;

    private Date genTime;

    private String description;

    public Organization(Integer organizationid, Integer parentOrganizationid, String organizationname, Date genTime, String description) {
        this.organizationid = organizationid;
        this.parentOrganizationid = parentOrganizationid;
        this.organizationname = organizationname;
        this.genTime = genTime;
        this.description = description;
    }

    public Organization() {
        super();
    }

    public Integer getOrganizationid() {
        return organizationid;
    }

    public void setOrganizationid(Integer organizationid) {
        this.organizationid = organizationid;
    }

    public Integer getParentOrganizationid() {
        return parentOrganizationid;
    }

    public void setParentOrganizationid(Integer parentOrganizationid) {
        this.parentOrganizationid = parentOrganizationid;
    }

    public String getOrganizationname() {
        return organizationname;
    }

    public void setOrganizationname(String organizationname) {
        this.organizationname = organizationname == null ? null : organizationname.trim();
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