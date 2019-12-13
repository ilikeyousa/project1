package com.zking.asset.system.model;

import lombok.ToString;

import java.util.Date;
@ToString
public class User {
    private String id;

    private String username;

    private String password;

    private String deptment;

    private Date createdate;

    public User(String id, String username, String password, String deptment, Date createdate) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.deptment = deptment;
        this.createdate = createdate;
    }


    public User() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDeptment() {
        return deptment;
    }

    public void setDeptment(String deptment) {
        this.deptment = deptment;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }


}