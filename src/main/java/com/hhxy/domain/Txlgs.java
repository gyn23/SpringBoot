package com.hhxy.domain;

public class Txlgs {
    private String bh;
    private String xm;
    private String dh;

    public Txlgs() {
    }

    public Txlgs(String bh, String xm, String dh) {
        this.bh = bh;
        this.xm = xm;
        this.dh = dh;
    }

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
}
