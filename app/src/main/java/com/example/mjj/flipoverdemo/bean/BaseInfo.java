package com.example.mjj.flipoverdemo.bean;

/**
 * 实体类基类
 * <p>
 * Created by Mjj on 2016/12/20.
 */

public class BaseInfo {

    private int code;
    private String success;
    private String msg;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getSuccess() {
        return success;
    }

    public void setSuccess(String success) {
        this.success = success;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
