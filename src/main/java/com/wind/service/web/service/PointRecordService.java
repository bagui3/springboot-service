package com.wind.service.web.service;

import com.github.pagehelper.PageHelper;
import com.wind.service.common.Constant;
import com.wind.service.mybatis.mapper.PointRecordMapper;
import com.wind.service.mybatis.pojo.PointRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

import java.util.List;
import java.util.Optional;

@Service
public class PointRecordService {

    @Autowired
    PointRecordMapper pointRecordMapper;

    public Optional<PointRecord> getPointRecordByID(Long id) {
        return Optional.ofNullable(pointRecordMapper.selectByPrimaryKey(id));
    }

    public List<PointRecord> getAll(int page) {
        Example example = new Example(PointRecord.class);
        example.setOrderByClause("id desc");
        PageHelper.startPage(page, Constant.PAGE_SIZE);
        return pointRecordMapper.selectByExample(example);
    }

    public List<PointRecord> getAll(String type, String value, int page) {
        Example example = new Example(PointRecord.class);
        example.setOrderByClause("id desc");
        Example.Criteria criteria = example.createCriteria();
        if (type.toLowerCase().contains("id")) {
            criteria.andEqualTo(Long.valueOf(value));
        } else {
            criteria.andLike(type, "%" + value + "%");
        }
        PageHelper.startPage(page, Constant.PAGE_SIZE);
        return pointRecordMapper.selectByExample(example);
    }

    public List<PointRecord> getAll(String type, List<Long> value, int page) {
        Example example = new Example(PointRecord.class);
        example.setOrderByClause("id desc");
        Example.Criteria criteria = example.createCriteria();
        criteria.andIn(type, value);
        PageHelper.startPage(page, Constant.PAGE_SIZE);
        return pointRecordMapper.selectByExample(example);
    }

    public int getCount() {
        int count = pointRecordMapper.selectCount(new PointRecord());
        return count;
    }

    public int getCount(String type, String value) {
        Example example = new Example(PointRecord.class);
        Example.Criteria criteria = example.createCriteria();
        if (type.toLowerCase().contains("id")) {
            criteria.andEqualTo(Long.valueOf(value));
        } else {
            criteria.andLike(type, "%" + value + "%");
        }
        int count = pointRecordMapper.selectCountByExample(example);
        return count;
    }

    public int getCount(String type, List<Long> value) {
        Example example = new Example(PointRecord.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andIn(type, value);
        int count = pointRecordMapper.selectCountByExample(example);
        return count;
    }

    public String getUserIds(List<PointRecord> list) {
        String ids = "";
        for (int index = 0; index < list.size(); index++) {
            ids += list.get(index).getUserid().toString();
            if (index != list.size() - 1) {
                ids += ",";
            }
        }
        return ids;
    }

    @Transactional
    public boolean addPointRecord(PointRecord PointRecord) {
        return pointRecordMapper.insertUseGeneratedKeys(PointRecord) > 0;
    }

    @Transactional
    public boolean modifyPointRecordById(PointRecord PointRecord) {
        return pointRecordMapper.updateByPrimaryKey(PointRecord) > 0;
    }

    @Transactional
    public boolean deletePointRecordById(Long id) {
        return pointRecordMapper.deleteByPrimaryKey(id) > 0;
    }
}