package com.zking.asset.manage.model;

import java.util.Date;

public class TAssetRepair {
    private String id;

    private String djbh;

    private String djmc;

    private Float wxfy;

    private Float pjsj;

    private Date bxsj;

    private String wxdw;

    private Date wxrq;

    private String wxsm;

    private String lrr;

    private Date lrrq;

    public TAssetRepair(String id, String djbh, String djmc, Float wxfy, Float pjsj, Date bxsj, String wxdw, Date wxrq, String wxsm, String lrr, Date lrrq) {
        this.id = id;
        this.djbh = djbh;
        this.djmc = djmc;
        this.wxfy = wxfy;
        this.pjsj = pjsj;
        this.bxsj = bxsj;
        this.wxdw = wxdw;
        this.wxrq = wxrq;
        this.wxsm = wxsm;
        this.lrr = lrr;
        this.lrrq = lrrq;
    }

    public TAssetRepair() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDjbh() {
        return djbh;
    }

    public void setDjbh(String djbh) {
        this.djbh = djbh;
    }

    public String getDjmc() {
        return djmc;
    }

    public void setDjmc(String djmc) {
        this.djmc = djmc;
    }

    public Float getWxfy() {
        return wxfy;
    }

    public void setWxfy(Float wxfy) {
        this.wxfy = wxfy;
    }

    public Float getPjsj() {
        return pjsj;
    }

    public void setPjsj(Float pjsj) {
        this.pjsj = pjsj;
    }

    public Date getBxsj() {
        return bxsj;
    }

    public void setBxsj(Date bxsj) {
        this.bxsj = bxsj;
    }

    public String getWxdw() {
        return wxdw;
    }

    public void setWxdw(String wxdw) {
        this.wxdw = wxdw;
    }

    public Date getWxrq() {
        return wxrq;
    }

    public void setWxrq(Date wxrq) {
        this.wxrq = wxrq;
    }

    public String getWxsm() {
        return wxsm;
    }

    public void setWxsm(String wxsm) {
        this.wxsm = wxsm;
    }

    public String getLrr() {
        return lrr;
    }

    public void setLrr(String lrr) {
        this.lrr = lrr;
    }

    public Date getLrrq() {
        return lrrq;
    }

    public void setLrrq(Date lrrq) {
        this.lrrq = lrrq;
    }
}