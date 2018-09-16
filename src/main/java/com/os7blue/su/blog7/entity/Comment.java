package com.os7blue.su.blog7.entity;

import lombok.Data;

/**
 * @Description:    文章下面的评论
 * @Author:         os7blue
 * @CreateDate:     Create by 2018/9/15 23:56
 * @UpdateUser:     os7blue
 * @UpdateDate:     Update by 2018/9/15 23:56
 * @UpdateRemark:   
 * @Version:        1.0
 */
@Data
public class Comment {

    private Long timeId;

    private String email;

    private String content;

    private String url;

    private String nickName;

    private String postId;

    /**
     * 回复评论是否发送邮件提醒，0为不发，1为发送。默认为0
     */
    private Integer sendEmail = 0;
}
