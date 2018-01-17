package com.wind.service.web.api;

import com.wind.service.common.PaginatedResult;
import com.wind.service.mybatis.pojo.Orders;
import com.wind.service.web.ExtendController;
import io.swagger.annotations.ApiOperation;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user_order")
public class OrderController extends ExtendController<Orders> {

    @ApiOperation(value = "分页查询订单记录")
    @GetMapping("/all/{page}")
    public ResponseEntity<?> search(
            @RequestParam(value = "type", required = false, defaultValue = "") String type,
            @RequestParam(value = "value", required = false, defaultValue = "") String value,
            @PathVariable int page) throws Exception{
        QueryResult result = unionQueryUser(type, value, page, "userId");
        return ResponseEntity
                .ok(new NestedPaginatedResult()
                        .setUserList(result.getUserList())
                        .setData(result.getList())
                        .setCurrentPage(page)
                        .setCount(result.getCount()));
    }

    @Accessors(chain = true)
    @NoArgsConstructor
    @Data
    @ToString
    @EqualsAndHashCode(callSuper = false)
    public class NestedPaginatedResult extends PaginatedResult {
        private Object userList;
    }
}