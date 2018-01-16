package com.wind.service.web.service;

import com.wind.service.mybatis.mapper.UserTicketMapper;
import com.wind.service.mybatis.pojo.UserTicket;
import com.wind.service.web.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserTicketService extends BaseService<UserTicket> {

    @Autowired
    public void setBaseMapper(UserTicketMapper mapper) {
        setMapper(mapper);
    }
}