package com.os7blue.su.blog7.mapper;

import com.os7blue.su.blog7.entity.Post;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

/**
* @Description:    文章相关mapper
* @Author:         os7blue
* @CreateDate:     Create by 18-11-16 上午1:13
* @UpdateUser:     os7blue
* @UpdateDate:     Update by 18-11-16 上午1:13
* @UpdateRemark:   修改内容:无
* @Version:        1.0
*/

@Mapper
@Component
public interface PostMapper {

    @Select("SELECT cid AS timeId,title,content,tags FROM t_contents WHERE cid > 4")
    List<Post> selectSimplePostList();

    @Select("SELECT cid AS timeId,title,content,tags FROM t_contents WHERE cid = #{cid}")
    Post selectPostContent(Integer cid);
}
