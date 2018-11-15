package com.os7blue.su.blog7.entity;

import lombok.Data;


/**
 * @Description:    文章实体
 * @Author:         os7blue
 * @CreateDate:     Create by 2018/9/15 23:43
 * @UpdateUser:     os7blue
 * @UpdateDate:     Update by 2018/9/15 23:43
 * @UpdateRemark:
 * @Version:        1.0
 */
@Data
public class Post {

    /**
     * 采用转换后的时间戳毫秒值时间作文章id
     * 个人博客系统只有单用户操作，不存在多用户同时操作可能产生的同时操作冲突的问题
     */
    private long timeId;

    private String title;

    private String content;

    private String titleImgUrl = "http://tale.os7blue.com/upload/2017/11/27ul4ttsj2i2grv58ksnjbfmnh.png";

    private long updateTime;

    private String tags;
    /**
     * emmmmmm 让我再想想 今天就到这里
     */


}
