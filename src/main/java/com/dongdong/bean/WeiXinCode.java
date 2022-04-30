package com.dongdong.bean;

/**
 * @author:yujiayi
 * @email:1302525942@1000phone.com
 * @desc:
 * @datetime: 2022-04-26 23:20
 */
public class WeiXinCode {
    public String code;

    public WeiXinCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "WeiXinCode{" +
                "code='" + code + '\'' +
                '}';
    }
}
