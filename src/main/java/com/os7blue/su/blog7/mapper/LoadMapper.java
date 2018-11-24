package com.os7blue.su.blog7.mapper;

import com.os7blue.su.blog7.entity.Options;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Description: 页面加载相关mapper
 * @Author: os7blue
 * @CreateDate: Create by 18-11-24 下午8:50
 * @UpdateUser: os7blue
 * @UpdateDate: Update by 18-11-24 下午8:50
 * @UpdateRemark: 修改内容:无
 * @Version: 1.0
 */
@Mapper
@Component
public interface LoadMapper {

    @Select("SELECT name,value FROM t_options")
    List<Options> selectAllOptions();
}
