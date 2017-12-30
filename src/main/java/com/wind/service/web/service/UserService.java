package com.wind.service.web.service;

import com.github.pagehelper.PageHelper;
import com.wind.service.common.Constant;
import com.wind.service.mybatis.mapper.UserMapper;
import com.wind.service.mybatis.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    UserMapper userMapper;

    public Optional<User> getUserByID(Long id) {
        return Optional.ofNullable(userMapper.selectByPrimaryKey(id));
    }

    public Optional<User> getUserByName(String name) {
        User instance = new User();
        instance.setName(name);
        return Optional.ofNullable(userMapper.selectOne(instance));
    }

    public List<User> getAll(int page) {
        Example example = new Example(User.class);
        example.setOrderByClause("id desc");
        PageHelper.startPage(page, Constant.PAGE_SIZE);
        return userMapper.selectByExample(example);
    }

    public List<User> getAll(String type, String value, int page) {
        Example example = new Example(User.class);
        example.setOrderByClause("id desc");
        Example.Criteria criteria = example.createCriteria();
        criteria.andLike(type, "%" + value + "%");
        PageHelper.startPage(page, Constant.PAGE_SIZE);
        return userMapper.selectByExample(example);
    }

    public int getCount() {
        int count = userMapper.selectCount(new User());
        return count;
    }

    public int getCount(String type, String value) {
        Example example = new Example(User.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andLike(type, "%" + value + "%");
        int count = userMapper.selectCountByExample(example);
        return count;
    }

    @Transactional
    public boolean addUser(User User) {
        return userMapper.insertUseGeneratedKeys(User) > 0;
    }

    @Transactional
    public boolean modifyUserById(User User) {
        User original = userMapper.selectByPrimaryKey(User);
        return userMapper.updateByPrimaryKey(User) > 0;
    }

    @Transactional
    public boolean deleteUserById(Long id) {
        return userMapper.deleteByPrimaryKey(id) > 0;
    }
}