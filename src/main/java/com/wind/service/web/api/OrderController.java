package com.wind.service.web.api;

import com.wind.service.common.Constant;
import com.wind.service.common.PaginatedResult;
import com.wind.service.exception.ResourceNotFoundException;
import com.wind.service.mybatis.pojo.User;
import com.wind.service.mybatis.pojo.Orders;
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
public class OrderController {

    @Autowired
    private OrderService orderService;

    @Autowired
    private UserService userService;


    @ApiOperation(value = "获取订单记录详情")
    @GetMapping("/{id}")
    public ResponseEntity<?> getOrdersById(@PathVariable Long id) {
        return orderService
                .getOrdersByID(id)
                .map(ResponseEntity::ok)
                .orElseThrow(() -> new ResourceNotFoundException()
                        .setResourceName(Constant.RESOURCE_ORDER)
                        .setId(id));
    }

    @ApiOperation(value = "获取订单记录列表")
    @GetMapping("/all/{page}")
    public ResponseEntity<?> search(
            @RequestParam(value = "type", required = false, defaultValue = "") String type,
            @RequestParam(value = "value", required = false, defaultValue = "") String value,
            @PathVariable int page) {
        if ("".equals(type)) {
            List<Orders> list = orderService.getAll(page);
            List<User> dic = getDic(list);
            return ResponseEntity
                    .ok(new com.wind.service.web.api.OrderController.PaginatedUserOrderResult()
                            .setUserList(dic)
                            .setData(list)
                            .setCurrentPage(page)
                            .setCount(orderService.getCount()));
        } else if ("phone".equals(type) || "name".equals(type) || "start".equals(type) || "end".equals(type)) {
            List<Long> ids = new ArrayList<>();
            List<Orders> list = new ArrayList<>();
            int count = 0;
            switch (type) {
                case "phone":
                    ids = userService.searchIds("phone", value);
                    list = orderService.getAll("userId", ids, page);
                    count = orderService.getCount("userId", ids);
                    break;
                case "name":
                    ids = userService.searchIds("name", value);
                    list = orderService.getAll("userId", ids, page);
                    count = orderService.getCount("userId", ids);
                    break;
            }
            List<User> dic = getDic(list);
            return ResponseEntity
                    .ok(new com.wind.service.web.api.OrderController.PaginatedUserOrderResult()
                            .setUserList(dic)
                            .setData(list)
                            .setCurrentPage(page)
                            .setCount(count));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @ApiOperation(value = "新增订单记录")
    @PostMapping
    public ResponseEntity<?> postOrders(@RequestBody Orders instance) {
        orderService.addOrders(instance);
        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(instance.getId())
                .toUri();
        return ResponseEntity.created(location).body(instance);
    }

    @ApiOperation(value = "修改订单记录")
    @PutMapping
    public ResponseEntity<?> putOrders(@RequestBody Orders Orders) {
        assertOrdersExist(Orders.getId());

        orderService.modifyOrdersById(Orders);

        return ResponseEntity.status(HttpStatus.ACCEPTED).body(Orders);
    }

    @ApiOperation(value = "删除订单记录")
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteOrders(@PathVariable Long id) {
        assertOrdersExist(id);

        boolean result = orderService.deleteOrdersById(id);

        if (result)
            return ResponseEntity.accepted().build();
        else
            return ResponseEntity.notFound().build();

    }

    private void assertOrdersExist(Long id) {
        orderService
                .getOrdersByID(id)
                .orElseThrow(() -> new ResourceNotFoundException()
                        .setResourceName(Constant.RESOURCE_ORDER)
                        .setId(id));
    }

    private List<User> getDic(List<Orders> list) {
        List<User> userList = new ArrayList<>();
        if (list.size() > 0) {
            userList = userService.getAll(orderService.getUserIds(list));
        }
        return userList;
    }

    @Accessors(chain = true)
    @NoArgsConstructor
    @Data
    @ToString
    public class PaginatedUserOrderResult extends PaginatedResult {
        private Object userList;
    }
}