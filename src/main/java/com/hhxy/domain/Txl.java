package com.hhxy.domain;

public class Txl {
    private String bh;
    private String xm;
    private String dh;

    public String getBh() {
        return bh;
    }

    public void setBh(String bh) {
        this.bh = bh;
    }

    public String getXm() {
        return xm;
    }

    public void setXm(String xm) {
        this.xm = xm;
    }

    public String getDh() {
        return dh;
    }

    public void setDh(String dh) {
        this.dh = dh;
    }

    public Txl() {
    }

    public Txl(String bh, String xm, String dh) {
        this.bh = bh;
        this.xm = xm;
        this.dh = dh;
    }

    @Override
    public String toString() {
        return bh+"  "+xm+"   "+dh;
    }
}
