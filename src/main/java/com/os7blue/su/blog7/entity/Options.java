package com.os7blue.su.blog7.entity;

import lombok.Data;

/**
* @Description:    加载网页的各项设置
* @Author:         os7blue
* @CreateDate:     Create by 18-11-24 下午8:47
* @UpdateUser:     os7blue
* @UpdateDate:     Update by 18-11-24 下午8:47
* @UpdateRemark:   修改内容:无
* @Version:        1.0
*/
@Data
public class Options {

    //key
    private String name;

    //value
    private String value;

    //说明
    private String description;
}
