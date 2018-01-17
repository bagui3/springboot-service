package com.wind.service.web.api;

import com.wind.service.mybatis.pojo.Line;
import com.wind.service.web.ExtendController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/line")
public class LineController extends ExtendController<Line> {
}