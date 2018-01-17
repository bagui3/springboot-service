package com.wind.service.web.api;

import com.wind.service.mybatis.pojo.User;
import com.wind.service.web.ExtendController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController extends ExtendController<User> {
}
