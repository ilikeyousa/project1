package com.zking.asset.manage.model;

import java.util.Date;

public class TAssetAllocation {
    private String id;

    private String djbh;

    private String djmc;

    private String ybm;

    private String yzrr;

    private String ycfd;

    private String drbm;

    private String xzrr;

    private String xcfd;

    private Date dbrq;

    private String dbly;

    private String lrr;

    private Date lrrq;

    private String sfsh;

    private String shr;

    public TAssetAllocation(String id, String djbh, String djmc, String ybm, String yzrr, String ycfd, String drbm, String xzrr, String xcfd, Date dbrq, String dbly, String lrr, Date lrrq, String sfsh, String shr) {
        this.id = id;
        this.djbh = djbh;
        this.djmc = djmc;
        this.ybm = ybm;
        this.yzrr = yzrr;
        this.ycfd = ycfd;
        this.drbm = drbm;
        this.xzrr = xzrr;
        this.xcfd = xcfd;
        this.dbrq = dbrq;
        this.dbly = dbly;
        this.lrr = lrr;
        this.lrrq = lrrq;
        this.sfsh = sfsh;
        this.shr = shr;
    }

    public TAssetAllocation() {
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

    public String getYbm() {
        return ybm;
    }

    public void setYbm(String ybm) {
        this.ybm = ybm;
    }

    public String getYzrr() {
        return yzrr;
    }

    public void setYzrr(String yzrr) {
        this.yzrr = yzrr;
    }

    public String getYcfd() {
        return ycfd;
    }

    public void setYcfd(String ycfd) {
        this.ycfd = ycfd;
    }

    public String getDrbm() {
        return drbm;
    }

    public void setDrbm(String drbm) {
        this.drbm = drbm;
    }

    public String getXzrr() {
        return xzrr;
    }

    public void setXzrr(String xzrr) {
        this.xzrr = xzrr;
    }

    public String getXcfd() {
        return xcfd;
    }

    public void setXcfd(String xcfd) {
        this.xcfd = xcfd;
    }

    public Date getDbrq() {
        return dbrq;
    }

    public void setDbrq(Date dbrq) {
        this.dbrq = dbrq;
    }

    public String getDbly() {
        return dbly;
    }

    public void setDbly(String dbly) {
        this.dbly = dbly;
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

    public String getSfsh() {
        return sfsh;
    }

    public void setSfsh(String sfsh) {
        this.sfsh = sfsh;
    }

    public String getShr() {
        return shr;
    }

    public void setShr(String shr) {
        this.shr = shr;
    }
}