package com.os7blue.su.blog7.controller;

import com.os7blue.su.blog7.entity.Options;
import com.os7blue.su.blog7.entity.Post;
import com.os7blue.su.blog7.service.LoadService;
import com.os7blue.su.blog7.service.PostService;
import javafx.geometry.Pos;
import lombok.var;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.xml.soap.SAAJResult;
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

    @Autowired
    private PostService postService;

    @Autowired
    private LoadService loadService;
    /**
     * 默认访问主页
     * @return
     */


    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String gotoIndex(Map<String,Object> model){
        var postlist = postService.getSimplePostList();
        model.put("postList",postlist);
        return "index";
    }

    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String gotoInde(Map<String,Object> model){
        List<Post> list = postService.getSimplePostList();
        System.err.println(list.size());
        model.put("postList",list);
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

    @RequestMapping(value = "article/{cid}",method = RequestMethod.GET)
    public String gotoInfo(@PathVariable Integer cid,Map<String,Object> model){
        Post post = postService.getPostContent(cid);
        model.put("content",post);
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
