package com.wind.service.web.service;

import com.wind.service.mybatis.mapper.UserMapper;
import com.wind.service.mybatis.pojo.User;
import com.wind.service.web.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService extends BaseService<User> {

    @Autowired
    public void setBaseMapper(UserMapper mapper) {
        setMapper(mapper);
    }
}