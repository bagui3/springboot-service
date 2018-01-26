package com.wind.service.web.service;

import com.wind.service.mybatis.mapper.OrdersMapper;
import com.wind.service.mybatis.pojo.Orders;
import com.wind.service.web.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService  extends BaseService<Orders> {
}