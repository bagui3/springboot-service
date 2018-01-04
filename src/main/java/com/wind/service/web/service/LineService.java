package com.wind.service.web.service;

import com.github.pagehelper.PageHelper;
import com.wind.service.common.Constant;
import com.wind.service.mybatis.mapper.LineMapper;
import com.wind.service.mybatis.pojo.Line;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class LineService {

    @Autowired
    LineMapper lineMapper;

    public Optional<Line> getLineByID(Long id) {
        return Optional.ofNullable(lineMapper.selectByPrimaryKey(id));
    }

    public Optional<Line> getLineByName(String name) {
        Line instance = new Line();
        instance.setName(name);
        return Optional.ofNullable(lineMapper.selectOne(instance));
    }

    public List<Line> getAll(int page) {
        Example example = new Example(Line.class);
        example.setOrderByClause("id desc");
        PageHelper.startPage(page, Constant.PAGE_SIZE);
        return lineMapper.selectByExample(example);
    }
    public List<Line> getAll(String ids) {
        return lineMapper.selectByIds(ids);
    }

    public List<Line> getAll(String type, String value, int page) {
        Example example = new Example(Line.class);
        example.setOrderByClause("id desc");
        Example.Criteria criteria = example.createCriteria();
        criteria.andLike(type, "%" + value + "%");
        PageHelper.startPage(page, Constant.PAGE_SIZE);
        return lineMapper.selectByExample(example);
    }

    public int getCount() {
        int count = lineMapper.selectCount(new Line());
        return count;
    }

    public int getCount(String type, String value) {
        Example example = new Example(Line.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andLike(type, "%" + value + "%");
        int count = lineMapper.selectCountByExample(example);
        return count;
    }

    public List<Long> searchIds(String type, String value) {
        Example example = new Example(Line.class);
        example.setOrderByClause("id desc");
        Example.Criteria criteria = example.createCriteria();
        criteria.andLike(type, "%" + value + "%");
        List<Line> list = lineMapper.selectByExample(example);
        List<Long> ids = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            ids.add(list.get(i).getId());
        }
        return ids;
    }

    @Transactional
    public boolean addLine(Line Line) {
        return lineMapper.insertUseGeneratedKeys(Line) > 0;
    }

    @Transactional
    public boolean modifyLineById(Line Line) {
        return lineMapper.updateByPrimaryKey(Line) > 0;
    }

    @Transactional
    public boolean deleteLineById(Long id) {
        return lineMapper.deleteByPrimaryKey(id) > 0;
    }
}