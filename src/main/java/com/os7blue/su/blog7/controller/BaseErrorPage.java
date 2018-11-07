package com.os7blue.su.blog7.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/error")
public class BaseErrorPage implements ErrorController {

    Logger logger = LoggerFactory.getLogger(BaseErrorPage.class);

    @Override
    public String getErrorPath() {
        logger.info("进入自定义错误页面");
        return "error.html";
    }

    @RequestMapping
    public String error() {
        return getErrorPath();
    }

}