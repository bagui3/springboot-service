package com.wind.service.web.api;

import com.wind.service.common.PaginatedResult;
import com.wind.service.mybatis.pojo.UserTicket;
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
@RequestMapping("/user_ticket")
public class UserTicketController extends ExtendController<UserTicket> {

    @ApiOperation(value = "分页查询乘车记录")
    @GetMapping("/all/{page}")
    public ResponseEntity<?> search(
            @RequestParam(value = "type", required = false, defaultValue = "") String type,
            @RequestParam(value = "value", required = false, defaultValue = "") String value,
            @PathVariable int page) throws Exception {
        QueryResult result = unionQueryUserAndLine(type, value, page, "userId","lineId");
        return ResponseEntity
                .ok(new NestedPaginatedResult()
                        .setUserList(result.getUserList())
                        .setLineList(result.getLineList())
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
        private Object lineList;
    }
}