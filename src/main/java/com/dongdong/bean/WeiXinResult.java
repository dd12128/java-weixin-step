package com.dongdong.bean;

import java.util.Arrays;
import java.util.List;

/**
 * @author:yujiayi
 * @email:1302525942@1000phone.com
 * @desc:
 * @datetime: 2022-04-26 22:47
 */
public class WeiXinResult {
    public String code;
    public String message;
    public List<WeiXinCode> data;

    public WeiXinResult(String code, String message, List<WeiXinCode> data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<WeiXinCode> getData() {
        return data;
    }

    public void setData(List<WeiXinCode> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "WeiXinResult{" +
                "code='" + code + '\'' +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
