package com.zking.asset.book.model;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

@ToString
@Data
public class SysPermission implements Serializable {
    private Integer perid;

    private String title;

    private Integer pid;

    private String href;

    private String icon;

    private String target;

    public SysPermission() {
    }

    public SysPermission(Integer perid, String title, Integer pid, String href, String icon,String target) {
        this.perid = perid;
        this.title = title;
        this.pid = pid;
        this.href = href;
        this.icon = icon;
        this.target=target;
    }
}