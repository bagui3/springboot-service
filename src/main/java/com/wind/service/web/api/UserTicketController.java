package com.wind.service.web.api;

import com.wind.service.common.Constant;
import com.wind.service.common.PaginatedResult;
import com.wind.service.exception.ResourceNotFoundException;
import com.wind.service.mybatis.pojo.Line;
import com.wind.service.mybatis.pojo.User;
import com.wind.service.mybatis.pojo.UserTicket;
import com.wind.service.web.BaseController;
import com.wind.service.web.service.LineService;
import com.wind.service.web.service.UserService;
import com.wind.service.web.service.UserTicketService;
import io.swagger.annotations.ApiOperation;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;
import org.javatuples.Pair;
import org.javatuples.Triplet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.io.Serializable;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/user_ticket")
public class UserTicketController extends BaseController<UserTicket> {

    @Autowired
    public void setBaseService(UserTicketService service) {
        setService(service);
    }

    @Autowired
    private UserService userService;

    @Autowired
    private LineService lineService;

    @ApiOperation(value = "分页查询乘车记录")
    @GetMapping("/all/{page}")
    public ResponseEntity<?> search(
            @RequestParam(value = "type", required = false, defaultValue = "") String type,
            @RequestParam(value = "value", required = false, defaultValue = "") String value,
            @PathVariable int page) throws Exception {
        int count;
        List<UserTicket> list;
        List<User> userList;
        List<Long> userIds;
        List<Long> lineIds;
        List<Line> lineList;
        if ("".equals(type)) {
            list = getService().selectAll(page);
            count = getService().getCount();
            lineIds = getService().getRelatedIds(list, "lineId");
            lineList = lineService.selectAll(lineIds);
            userIds = getService().getRelatedIds(list, "userId");
            userList = userService.selectAll(userIds);
        } else {
            if (type.equals("phone") || type.equals("name")) {
                userList = userService.selectAll(type, value);
                userIds = userService.getIds(userList);
                list = getService().selectAll("userId", userIds, page);
                count = getService().getCount("userId", userIds);
                lineIds = getService().getRelatedIds(list, "lineId");
                lineList = lineService.selectAll(lineIds);
            } else if (type.equals("start") || type.equals("end")) {
                lineList = lineService.selectAll(type, value);
                lineIds = lineService.getIds(lineList);
                list = getService().selectAll("lineId", lineIds, page);
                count = getService().getCount("lineId", lineIds);
                userIds = getService().getRelatedIds(list, "userId");
                userList = userService.selectAll(userIds);
            } else {
                return ResponseEntity.badRequest().build();
            }
        }
        return ResponseEntity
                .ok(new UserTicketController.NestedPaginatedResult()
                        .setUserList(userList)
                        .setLineList(lineList)
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
        private Object lineList;
    }
}