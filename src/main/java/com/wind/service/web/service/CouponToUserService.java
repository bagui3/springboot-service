package com.wind.service.web.service;

import com.github.pagehelper.PageHelper;
import com.wind.service.common.Constant;
import com.wind.service.mybatis.mapper.CouponToUserMapper;
import com.wind.service.mybatis.pojo.CouponToUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

import java.util.List;
import java.util.Optional;

@Service
public class CouponToUserService {

    @Autowired
    CouponToUserMapper couponToUserMapper;

    public Optional<CouponToUser> getCouponToUserByID(Long id) {
        return Optional.ofNullable(couponToUserMapper.selectByPrimaryKey(id));
    }

    public List<CouponToUser> getAll(int page) {
        Example example = new Example(CouponToUser.class);
        example.setOrderByClause("id desc");
        PageHelper.startPage(page, Constant.PAGE_SIZE);
        return couponToUserMapper.selectByExample(example);
    }

    public List<CouponToUser> getAll(String type, String value, int page) {
        Example example = new Example(CouponToUser.class);
        example.setOrderByClause("id desc");
        Example.Criteria criteria = example.createCriteria();
        if (type.toLowerCase().contains("id")) {
            criteria.andEqualTo(Long.valueOf(value));
        } else {
            criteria.andLike(type, "%" + value + "%");
        }
        PageHelper.startPage(page, Constant.PAGE_SIZE);
        return couponToUserMapper.selectByExample(example);
    }

    public List<CouponToUser> getAll(String type, List<Long> value, int page) {
        Example example = new Example(CouponToUser.class);
        example.setOrderByClause("id desc");
        Example.Criteria criteria = example.createCriteria();
        criteria.andIn(type, value);
        PageHelper.startPage(page, Constant.PAGE_SIZE);
        return couponToUserMapper.selectByExample(example);
    }

    public int getCount() {
        int count = couponToUserMapper.selectCount(new CouponToUser());
        return count;
    }

    public int getCount(String type, String value) {
        Example example = new Example(CouponToUser.class);
        Example.Criteria criteria = example.createCriteria();
        if (type.toLowerCase().contains("id")) {
            criteria.andEqualTo(Long.valueOf(value));
        } else {
            criteria.andLike(type, "%" + value + "%");
        }
        int count = couponToUserMapper.selectCountByExample(example);
        return count;
    }

    public int getCount(String type, List<Long> value) {
        Example example = new Example(CouponToUser.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andIn(type, value);
        int count = couponToUserMapper.selectCountByExample(example);
        return count;
    }

    public String getUserIds(List<CouponToUser> list) {
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
    public boolean addCouponToUser(CouponToUser CouponToUser) {
        return couponToUserMapper.insertUseGeneratedKeys(CouponToUser) > 0;
    }

    @Transactional
    public boolean modifyCouponToUserById(CouponToUser CouponToUser) {
        return couponToUserMapper.updateByPrimaryKey(CouponToUser) > 0;
    }

    @Transactional
    public boolean deleteCouponToUserById(Long id) {
        return couponToUserMapper.deleteByPrimaryKey(id) > 0;
    }
}