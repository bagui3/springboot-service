package com.wind.service.web.api;

import com.wind.service.mybatis.pojo.Line;
import com.wind.service.web.BaseController;
import com.wind.service.web.service.LineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/line")
public class LineController extends BaseController<Line> {

    @Autowired
    public void setBaseService(LineService service) {
        setService(service);
    }
}