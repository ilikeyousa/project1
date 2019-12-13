package com.zking.asset.manage.model;

public class TAssetType {
    private String id;

    private String lbmc;

    private String lbdm;

    private String lbdj;

    private String jldw;

    private String synx;

    private String sjlb;

    private String ssdl;

    public TAssetType(String id, String lbmc, String lbdm, String lbdj, String jldw, String synx, String sjlb, String ssdl) {
        this.id = id;
        this.lbmc = lbmc;
        this.lbdm = lbdm;
        this.lbdj = lbdj;
        this.jldw = jldw;
        this.synx = synx;
        this.sjlb = sjlb;
        this.ssdl = ssdl;
    }

    public TAssetType() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLbmc() {
        return lbmc;
    }

    public void setLbmc(String lbmc) {
        this.lbmc = lbmc;
    }

    public String getLbdm() {
        return lbdm;
    }

    public void setLbdm(String lbdm) {
        this.lbdm = lbdm;
    }

    public String getLbdj() {
        return lbdj;
    }

    public void setLbdj(String lbdj) {
        this.lbdj = lbdj;
    }

    public String getJldw() {
        return jldw;
    }

    public void setJldw(String jldw) {
        this.jldw = jldw;
    }

    public String getSynx() {
        return synx;
    }

    public void setSynx(String synx) {
        this.synx = synx;
    }

    public String getSjlb() {
        return sjlb;
    }

    public void setSjlb(String sjlb) {
        this.sjlb = sjlb;
    }

    public String getSsdl() {
        return ssdl;
    }

    public void setSsdl(String ssdl) {
        this.ssdl = ssdl;
    }
}