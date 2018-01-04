package com.wind.service.web.service;

import com.github.pagehelper.PageHelper;
import com.wind.service.common.Constant;
import com.wind.service.mybatis.mapper.UserTicketMapper;
import com.wind.service.mybatis.pojo.UserTicket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

import java.util.List;
import java.util.Optional;

@Service
public class UserTicketService {

    @Autowired
    UserTicketMapper userTicketMapper;

    public Optional<UserTicket> getUserTicketByID(Long id) {
        return Optional.ofNullable(userTicketMapper.selectByPrimaryKey(id));
    }

    public List<UserTicket> getAll(int page) {
        Example example = new Example(UserTicket.class);
        example.setOrderByClause("id desc");
        PageHelper.startPage(page, Constant.PAGE_SIZE);
        return userTicketMapper.selectByExample(example);
    }

    public List<UserTicket> getAll(String type, String value, int page) {
        Example example = new Example(UserTicket.class);
        example.setOrderByClause("id desc");
        Example.Criteria criteria = example.createCriteria();
        if (type.toLowerCase().contains("id")) {
            criteria.andEqualTo(Long.valueOf(value));
        } else {
            criteria.andLike(type, "%" + value + "%");
        }
        PageHelper.startPage(page, Constant.PAGE_SIZE);
        return userTicketMapper.selectByExample(example);
    }

    public List<UserTicket> getAll(String type, List<Long> value, int page) {
        Example example = new Example(UserTicket.class);
        example.setOrderByClause("id desc");
        Example.Criteria criteria = example.createCriteria();
        criteria.andIn(type, value);
        PageHelper.startPage(page, Constant.PAGE_SIZE);
        return userTicketMapper.selectByExample(example);
    }

    public int getCount() {
        int count = userTicketMapper.selectCount(new UserTicket());
        return count;
    }

    public int getCount(String type, String value) {
        Example example = new Example(UserTicket.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andLike(type, "%" + value + "%");
        int count = userTicketMapper.selectCountByExample(example);
        return count;
    }

    public int getCount(String type, List<Long> value) {
        Example example = new Example(UserTicket.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andIn(type, value);
        int count = userTicketMapper.selectCountByExample(example);
        return count;
    }

    public String getUserIds(List<UserTicket> list) {
        String ids = "";
        for (int index = 0; index < list.size(); index++) {
            ids += list.get(index).getUserId().toString();
            if (index != list.size() - 1) {
                ids += ",";
            }
        }
        return ids;
    }

    public String getLineIds(List<UserTicket> list) {
        String ids = "";
        for (int index = 0; index < list.size(); index++) {
            ids += list.get(index).getLineId().toString();
            if (index != list.size() - 1) {
                ids += ",";
            }
        }
        return ids;
    }

    @Transactional
    public boolean addUserTicket(UserTicket UserTicket) {
        return userTicketMapper.insertUseGeneratedKeys(UserTicket) > 0;
    }

    @Transactional
    public boolean modifyUserTicketById(UserTicket UserTicket) {
        return userTicketMapper.updateByPrimaryKey(UserTicket) > 0;
    }

    @Transactional
    public boolean deleteUserTicketById(Long id) {
        return userTicketMapper.deleteByPrimaryKey(id) > 0;
    }
}