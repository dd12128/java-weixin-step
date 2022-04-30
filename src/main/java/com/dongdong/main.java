package com.dongdong;

import com.dongdong.service.WeiXinSport;

/**
 * @author:yujiayi
 * @email:1302525942@1000phone.com
 * @desc:
 * @datetime: 2022-04-26 22:39
 */
public class main {
//更改对应参数去Constants这个类
    public static void main(String[] args) {
        WeiXinSport weiXinSport = new WeiXinSport();
        String sport = weiXinSport.getSport();
        if (sport.equals("1")) {
            System.out.println("修改成功");
        } else {
            System.out.println("修改失败，去看看你参数是否正确");
        }
    }
}
