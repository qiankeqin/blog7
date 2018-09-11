package com.os7blue.su.blog7.utils;


import java.text.SimpleDateFormat;
import java.util.Date;

/**
* @Description:    处理日期格式的工具类 鉴于sqlite的约束，可选用直接储存时间戳，或者储存转换过的localtime字符串（可能需要设置服务器时区/地区）
                   做归档处理是会模糊查询日期，所以具体hh:ss:mm的格式不影响查询。
* @Author:         os7blue
* @CreateDate:     Create by 18-8-25 下午8:16
* @UpdateUser:     os7blue
* @UpdateDate:     Update by 18-8-25 下午8:16
* @UpdateRemark:   修改内容:无
* @Version:        1.0
*/
public class DateUtil {

    public static String getDateNow(){
        return new SimpleDateFormat("yyyy-MM-dd-EEE-HH:mm").format(new Date());
    }

    public static String getDateNowByPattern(String pattern){
        return new SimpleDateFormat(pattern).format(new Date());
    }
}
