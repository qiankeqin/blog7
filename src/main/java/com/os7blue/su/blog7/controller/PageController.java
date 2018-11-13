package com.os7blue.su.blog7.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Description:    用作页面跳转之用 图个方便省事
 * @Author:         os7blue
 * @CreateDate:     Create by 2018/9/10 19:52
 * @UpdateUser:     os7blue
 * @UpdateDate:     Update by 2018/9/10 19:52
 * @UpdateRemark:
 * @Version:        1.0
 */
@Controller
public class PageController {

    /**
     * 默认访问主页
     * @return
     */
    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String gotoIndex(){
        return "index.html";
    }

    @RequestMapping(value = "/about",method = RequestMethod.GET)
    public String gotoAbout(){
        return "about.html";
    }

    @RequestMapping(value = "/blog",method = RequestMethod.GET)
    public String gotoBlog(){
        return "blog.html";
    }

    @RequestMapping(value = "/blog-details",method = RequestMethod.GET)
    public String gotoBlogDetails(){
        return "blog-details.html";
    }

    @RequestMapping(value = "/contact",method = RequestMethod.GET)
    public String gotoContact(){
        return "contact.html";
    }

    @RequestMapping(value = "/works-details",method = RequestMethod.GET)
    public String gotoWorksDetails(){
        return "works-details.html";
    }





}
