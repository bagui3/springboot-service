package com.wind.service.web.service;

import com.wind.service.mybatis.mapper.UserFreeMapper;
import com.wind.service.mybatis.pojo.UserFree;
import com.wind.service.web.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserFreeService extends BaseService<UserFree> {

    @Autowired
    public void setBaseMapper(UserFreeMapper mapper) {
        setMapper(mapper);
    }
}