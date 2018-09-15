package com.os7blue.su.blog7.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.os7blue.su.blog7.utils.BaseUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

/**
 * @Description: 一些公用逻辑，包含一些为了避免特殊处理的伪静态注入方法。
 * @Author: os7blue
 * @CreateDate: Create by 2018/7/11 19:24
 * @UpdateUser: os7blue
 * @UpdateDate: Update by 2018/7/11 19:24
 * @UpdateRemark: null
 * @Version: 1.0
 */
@Service
public class BaseService {

    /**
     * 发送方的标识
     */
    @Value("${spring.mail.username}")
    private String from;
    /**
     * spring boot提供发送邮件接口
     */
    @Autowired
    private JavaMailSender sender;


    /**
     * 发送一封只包含文本信息的电子邮件
     *
     * @param toEmail 收件人电子邮箱地址
     * @param title   邮件标题
     * @param content 邮件内容
     */
    public void sendMail(String toEmail, String title, String content) {

        //创建一封简单的电子邮件对象.
        SimpleMailMessage message = new SimpleMailMessage();
        //发送者
        message.setFrom(from);
        //接受者
        message.setTo(toEmail);
        //发送标题
        message.setSubject(title);
        //发送内容
        message.setText(content);
        sender.send(message);
    }

    /**
     * 根据用户ip地址获取具体的国家地区isp服务商信息
     * @param ipAddress
     * @return
     */
    public String getIpMessage(String ipAddress) {
        String message = BaseUtils.getIpMessage(ipAddress);
        JSONObject ipMessage = JSON.parseObject(message);
        JSONObject im = JSONObject.parseObject(ipMessage.getString("data"));
        return (im.getString("country") + im.getString("region") + im.getString("city") + im.getString("isp"));
    }
}
