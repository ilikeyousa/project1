package com.zking.asset.manage.model;

import java.util.Date;

public class TAssetScrap {
    private String id;

    private String zcbh;

    private String zcmc;

    private String clfs;

    private String bfly;

    private Date clrq;

    private Float hscz;

    private String zrr;

    private String lrr;

    private String shr;

    private Date lrrq;

    private String bfsm;

    public TAssetScrap(String id, String zcbh, String zcmc, String clfs, String bfly, Date clrq, Float hscz, String zrr, String lrr, String shr, Date lrrq, String bfsm) {
        this.id = id;
        this.zcbh = zcbh;
        this.zcmc = zcmc;
        this.clfs = clfs;
        this.bfly = bfly;
        this.clrq = clrq;
        this.hscz = hscz;
        this.zrr = zrr;
        this.lrr = lrr;
        this.shr = shr;
        this.lrrq = lrrq;
        this.bfsm = bfsm;
    }

    public TAssetScrap() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getZcbh() {
        return zcbh;
    }

    public void setZcbh(String zcbh) {
        this.zcbh = zcbh;
    }

    public String getZcmc() {
        return zcmc;
    }

    public void setZcmc(String zcmc) {
        this.zcmc = zcmc;
    }

    public String getClfs() {
        return clfs;
    }

    public void setClfs(String clfs) {
        this.clfs = clfs;
    }

    public String getBfly() {
        return bfly;
    }

    public void setBfly(String bfly) {
        this.bfly = bfly;
    }

    public Date getClrq() {
        return clrq;
    }

    public void setClrq(Date clrq) {
        this.clrq = clrq;
    }

    public Float getHscz() {
        return hscz;
    }

    public void setHscz(Float hscz) {
        this.hscz = hscz;
    }

    public String getZrr() {
        return zrr;
    }

    public void setZrr(String zrr) {
        this.zrr = zrr;
    }

    public String getLrr() {
        return lrr;
    }

    public void setLrr(String lrr) {
        this.lrr = lrr;
    }

    public String getShr() {
        return shr;
    }

    public void setShr(String shr) {
        this.shr = shr;
    }

    public Date getLrrq() {
        return lrrq;
    }

    public void setLrrq(Date lrrq) {
        this.lrrq = lrrq;
    }

    public String getBfsm() {
        return bfsm;
    }

    public void setBfsm(String bfsm) {
        this.bfsm = bfsm;
    }
}