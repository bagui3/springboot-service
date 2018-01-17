package com.wind.service.web.service;

import com.wind.service.mybatis.mapper.LineTypeMapper;
import com.wind.service.mybatis.pojo.LineType;
import com.wind.service.web.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LineTypeService extends BaseService<LineType> {

    @Autowired
    public void setBaseMapper(LineTypeMapper mapper) {
        setMapper(mapper);
    }
}