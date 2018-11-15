package com.os7blue.su.blog7.service;

import com.os7blue.su.blog7.entity.Post;
import com.os7blue.su.blog7.mapper.PostMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    @Autowired
    private PostMapper postMapper;

    public List<Post> getSimplePostList(){
        return postMapper.selectSimplePostList();
    }

    public Post getPostContent(Integer cid) {
        return postMapper.selectPostContent(cid);
    }
}
