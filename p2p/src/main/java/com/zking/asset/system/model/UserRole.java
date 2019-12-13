package com.zking.asset.system.model;

public class UserRole {
    private String userid;

    private String roleid;

    public UserRole(String userid, String roleid) {
        this.userid = userid;
        this.roleid = roleid;
    }

    public UserRole() {
        super();
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getRoleid() {
        return roleid;
    }

    public void setRoleid(String roleid) {
        this.roleid = roleid;
    }
}