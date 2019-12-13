package com.zking.asset.manage.model;

import java.util.Date;

public class TAssetTransfer {
    private String id;

    private String zcbh;

    private String zcmc;

    private String bdxm;

    private Float bdqz;

    private Float bdhz;

    private Date bdrq;

    private String bdyy;

    private String lrr;

    private String shr;

    private Date lrrq;

    private String bzsm;

    public TAssetTransfer(String id, String zcbh, String zcmc, String bdxm, Float bdqz, Float bdhz, Date bdrq, String bdyy, String lrr, String shr, Date lrrq, String bzsm) {
        this.id = id;
        this.zcbh = zcbh;
        this.zcmc = zcmc;
        this.bdxm = bdxm;
        this.bdqz = bdqz;
        this.bdhz = bdhz;
        this.bdrq = bdrq;
        this.bdyy = bdyy;
        this.lrr = lrr;
        this.shr = shr;
        this.lrrq = lrrq;
        this.bzsm = bzsm;
    }

    public TAssetTransfer() {
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

    public String getBdxm() {
        return bdxm;
    }

    public void setBdxm(String bdxm) {
        this.bdxm = bdxm;
    }

    public Float getBdqz() {
        return bdqz;
    }

    public void setBdqz(Float bdqz) {
        this.bdqz = bdqz;
    }

    public Float getBdhz() {
        return bdhz;
    }

    public void setBdhz(Float bdhz) {
        this.bdhz = bdhz;
    }

    public Date getBdrq() {
        return bdrq;
    }

    public void setBdrq(Date bdrq) {
        this.bdrq = bdrq;
    }

    public String getBdyy() {
        return bdyy;
    }

    public void setBdyy(String bdyy) {
        this.bdyy = bdyy;
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

    public String getBzsm() {
        return bzsm;
    }

    public void setBzsm(String bzsm) {
        this.bzsm = bzsm;
    }
}