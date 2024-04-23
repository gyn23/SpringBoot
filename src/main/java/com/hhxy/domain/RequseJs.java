package com.hhxy.domain;
//200  正常  400失败  500异常
public class RequseJs {
    private int code;
    private String msg;
    private Object data;
    public RequseJs() {
    }
    public RequseJs(int code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static RequseJs chaxunshibai(String msg) {
        return new RequseJs(400,msg,null);
    }

    public int getCode() {
        return code;
    }
    public void setCode(int code) {
        this.code = code;
    }
    public String getMsg() {
        return msg;
    }
    public void setMsg(String msg) {
        this.msg = msg;
    }
    public Object getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
    public static RequseJs shibai(String msg) {
        return new RequseJs(400,msg,null);
    }
    public static RequseJs success(String msg) {
        return new RequseJs(200, msg, null);
    }
    public static RequseJs yihcang(String msg) {
        return new RequseJs(200,msg, null);
    }
    public static RequseJs crcf(String msg) {
        return new RequseJs(200,msg, null);
    }
    public static RequseJs chaxun(Object data) {
        return new RequseJs(200,"查询成功", data);
    }
}
