package com.dongdong.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 * @author:yujiayi
 * @email:1302525942@1000phone.com
 * @desc:
 * @datetime: 2022-04-26 22:17
 */
public class HttpUtils {

    public static String get(String path){
        InputStream inputStream = null;
        BufferedReader reader = null;
        String line = "";  //最开始得空行
        String result = ""; //读取到得结果
        try {
            URL url = new URL(path);
            //获取连接
            URLConnection urlConnection = url.openConnection();
            //进行连接
            urlConnection.connect();
            //字节流读取内容
           inputStream = urlConnection.getInputStream();
           reader = new BufferedReader(new InputStreamReader(inputStream));
           while ((line = reader.readLine()) != null) {
               result += line;
           }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //关闭流从上到下
            try {
                if (reader != null) {
                    reader.close();
                }
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return result;
    }
}
