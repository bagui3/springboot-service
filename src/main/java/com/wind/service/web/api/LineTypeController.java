package com.wind.service.web.api;

import com.wind.service.mybatis.pojo.LineType;
import com.wind.service.web.ExtendController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/line_type")
public class LineTypeController extends ExtendController<LineType> {
}