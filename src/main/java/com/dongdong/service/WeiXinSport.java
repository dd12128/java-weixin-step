package com.dongdong.service;

import com.alibaba.fastjson.JSONObject;
import com.dongdong.Constants;
import com.dongdong.bean.WeiXinResult;
import com.dongdong.utils.HttpUtils;

/**
 * @author:yujiayi
 * @email:1302525942@1000phone.com
 * @desc:
 * @datetime: 2022-04-26 22:30
 */
public class WeiXinSport {
    public String getSport(){
        String url = Constants.WeiXin_Keep
                + "?phone=" + Constants.WeiXin_Phone
                + "&password=" + Constants.WeiXin_Passworld
                + "&steps=" + Constants.WeiXin_Steps;
        String result = HttpUtils.get(url);
        WeiXinResult weiXinResult = JSONObject.parseObject(result, WeiXinResult.class);
        return weiXinResult.code;
    }
}
