package com.hhxy.domain;

public class TxlFh {
    private String bha;
    private String xma;
    private String dha;

    public TxlFh(String bha, String xma, String dha) {
        this.bha = bha;
        this.xma = xma;
        this.dha = dha;
    }

    public TxlFh() {
    }

    public String getBha() {
        return bha;
    }

    public void setBha(String bha) {
        this.bha = bha;
    }

    public String getXma() {
        return xma;
    }

    public void setXma(String xma) {
        this.xma = xma;
    }

    public String getDha() {
        return dha;
    }

    public void setDha(String dha) {
        this.dha = dha;
    }

    @Override
    public String toString() {
        return dha+"   "+xma+"     "+dha;
    }
}
