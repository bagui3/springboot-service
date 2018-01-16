package com.wind.service.web.api;

import com.wind.service.common.Constant;
import com.wind.service.common.PaginatedResult;
import com.wind.service.exception.ResourceNotFoundException;
import com.wind.service.mybatis.pojo.User;
import com.wind.service.mybatis.pojo.Orders;
import com.wind.service.web.BaseController;
import com.wind.service.web.service.OrderService;
import com.wind.service.web.service.UserService;
import io.swagger.annotations.ApiOperation;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/user_order")
public class OrderController extends BaseController<Orders> {

    @Autowired
    public void setBaseService(OrderService service) {
        setService(service);
    }

    @Autowired
    private UserService userService;

    @ApiOperation(value = "分页查询订单记录")
    @GetMapping("/all/{page}")
    public ResponseEntity<?> search(
            @RequestParam(value = "type", required = false, defaultValue = "") String type,
            @RequestParam(value = "value", required = false, defaultValue = "") String value,
            @PathVariable int page) throws Exception{
        List<Long> userIds;
        List<User> userList;
        List<Orders> list;
        int count;
        if ("".equals(type)) {
            list = getService().selectAll(page);
            userIds = getService().getRelatedIds(list, "userId");
            userList = userService.selectAll(userIds);
            count = getService().getCount();
        } else {
            userList = userService.selectAll(type, value);
            userIds = userService.getIds(userList);
            list = getService().selectAll("userId", userIds, page);
            count = getService().getCount("userId", userIds);
        }
        return ResponseEntity
                .ok(new OrderController.NestedPaginatedResult()
                        .setUserList(userList)
                        .setData(list)
                        .setCurrentPage(page)
                        .setCount(count));
    }

    @Accessors(chain = true)
    @NoArgsConstructor
    @Data
    @ToString
    public class NestedPaginatedResult extends PaginatedResult {
        private Object userList;
    }
}