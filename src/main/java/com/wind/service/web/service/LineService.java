package com.wind.service.web.service;

import com.wind.service.mybatis.mapper.LineMapper;
import com.wind.service.mybatis.pojo.Line;
import com.wind.service.web.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LineService  extends BaseService<Line> {

    @Autowired
    public void setBaseMapper(LineMapper mapper) {
        setMapper(mapper);
    }
}