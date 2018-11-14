package com.os7blue.su.blog7.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
        return "index";
    }

    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String gotoInde(){
        return "index";
    }


    @RequestMapping(value = "/about",method = RequestMethod.GET)
    public String gotoAbout(){
        return "about";
    }

    @RequestMapping(value = "/gbook",method = RequestMethod.GET)
    public String gotoGbook(){
        return "gbook";
    }

    @RequestMapping(value = "/info",method = RequestMethod.GET)
    public String gotoInfo(){
        return "info";
    }

    @RequestMapping(value = "/infopic",method = RequestMethod.GET)
    public String gotoInfoPic(){
        return "infopic";
    }

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public String gotoList(){
        return "list";
    }

    @RequestMapping(value = "/share",method = RequestMethod.GET)
    public String gotoShare(){
        return "share";
    }





}
