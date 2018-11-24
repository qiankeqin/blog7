package com.os7blue.su.blog7.service;

import com.os7blue.su.blog7.entity.Options;
import com.os7blue.su.blog7.mapper.LoadMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @Description:    页面加载相关service
* @Author:         os7blue
* @CreateDate:     Create by 18-11-24 下午8:51
* @UpdateUser:     os7blue
* @UpdateDate:     Update by 18-11-24 下午8:51
* @UpdateRemark:   修改内容:无
* @Version:        1.0
*/
@Service
public class LoadService {

    @Autowired
    private LoadMapper loadMapper;

    /**
     * 获取所有设置
     */
    public List<Options> getAddOptions(){
        return loadMapper.selectAllOptions();
    }
}
