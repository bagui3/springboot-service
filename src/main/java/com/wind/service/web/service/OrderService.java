package com.wind.service.web.service;

import com.github.pagehelper.PageHelper;
import com.wind.service.common.Constant;
import com.wind.service.mybatis.mapper.OrdersMapper;
import com.wind.service.mybatis.pojo.Orders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    OrdersMapper ordersMapper;

    public Optional<Orders> getOrdersByID(Long id) {
        return Optional.ofNullable(ordersMapper.selectByPrimaryKey(id));
    }

    public List<Orders> getAll(int page) {
        Example example = new Example(Orders.class);
        example.setOrderByClause("id desc");
        PageHelper.startPage(page, Constant.PAGE_SIZE);
        return ordersMapper.selectByExample(example);
    }

    public List<Orders> getAll(String type, String value, int page) {
        Example example = new Example(Orders.class);
        example.setOrderByClause("id desc");
        Example.Criteria criteria = example.createCriteria();
        if (type.toLowerCase().contains("id")) {
            criteria.andEqualTo(Long.valueOf(value));
        } else {
            criteria.andLike(type, "%" + value + "%");
        }
        PageHelper.startPage(page, Constant.PAGE_SIZE);
        return ordersMapper.selectByExample(example);
    }

    public List<Orders> getAll(String type, List<Long> value, int page) {
        Example example = new Example(Orders.class);
        example.setOrderByClause("id desc");
        Example.Criteria criteria = example.createCriteria();
        criteria.andIn(type, value);
        PageHelper.startPage(page, Constant.PAGE_SIZE);
        return ordersMapper.selectByExample(example);
    }

    public int getCount() {
        int count = ordersMapper.selectCount(new Orders());
        return count;
    }

    public int getCount(String type, String value) {
        Example example = new Example(Orders.class);
        Example.Criteria criteria = example.createCriteria();
        if (type.toLowerCase().contains("id")) {
            criteria.andEqualTo(Long.valueOf(value));
        } else {
            criteria.andLike(type, "%" + value + "%");
        }
        int count = ordersMapper.selectCountByExample(example);
        return count;
    }

    public int getCount(String type, List<Long> value) {
        Example example = new Example(Orders.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andIn(type, value);
        int count = ordersMapper.selectCountByExample(example);
        return count;
    }

    public String getUserIds(List<Orders> list) {
        String ids = "";
        for (int index = 0; index < list.size(); index++) {
            ids += list.get(index).getUserId().toString();
            if (index != list.size() - 1) {
                ids += ",";
            }
        }
        return ids;
    }

    @Transactional
    public boolean addOrders(Orders Orders) {
        return ordersMapper.insertUseGeneratedKeys(Orders) > 0;
    }

    @Transactional
    public boolean modifyOrdersById(Orders Orders) {
        return ordersMapper.updateByPrimaryKey(Orders) > 0;
    }

    @Transactional
    public boolean deleteOrdersById(Long id) {
        return ordersMapper.deleteByPrimaryKey(id) > 0;
    }
}