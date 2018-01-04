package com.wind.service.web.api;

import com.wind.service.common.Constant;
import com.wind.service.common.PaginatedResult;
import com.wind.service.exception.ResourceNotFoundException;
import com.wind.service.mybatis.pojo.Line;
import com.wind.service.mybatis.pojo.User;
import com.wind.service.mybatis.pojo.UserTicket;
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
public class UserTicketController {

    @Autowired
    private UserTicketService userTicketService;

    @Autowired
    private UserService userService;

    @Autowired
    private LineService lineService;

    @ApiOperation(value = "获取乘车记录详情")
    @GetMapping("/{id}")
    public ResponseEntity<?> getUserTicketById(@PathVariable Long id) {
        return userTicketService
                .getUserTicketByID(id)
                .map(ResponseEntity::ok)
                .orElseThrow(() -> new ResourceNotFoundException()
                        .setResourceName(Constant.RESOURCE_USER_TICKET)
                        .setId(id));
    }

    @ApiOperation(value = "获取乘车记录列表")
    @GetMapping("/all/{page}")
    public ResponseEntity<?> search(
            @RequestParam(value = "type", required = false, defaultValue = "") String type,
            @RequestParam(value = "value", required = false, defaultValue = "") String value,
            @PathVariable int page) {
        if ("".equals(type)) {
            List<UserTicket> list = userTicketService.getAll(page);
            Pair<List<User>, List<Line>> dic = getDic(list);
            return ResponseEntity
                    .ok(new PaginatedUserTicketResult()
                            .setUserList(dic.getValue0())
                            .setLineList(dic.getValue1())
                            .setData(list)
                            .setCurrentPage(page)
                            .setCount(userTicketService.getCount()));
        } else if ("phone".equals(type) || "name".equals(type) || "start".equals(type) || "end".equals(type)) {
            List<Long> ids = new ArrayList<>();
            List<UserTicket> list = new ArrayList<>();
            int count = 0;
            switch (type){
                case "phone":
                    ids = userService.searchIds("phone", value);
                    list = userTicketService.getAll("userId", ids, page);
                    count = userTicketService.getCount("userId", ids);
                    break;
                case "name":
                    ids = userService.searchIds("name", value);
                    list = userTicketService.getAll("userId", ids, page);
                    count = userTicketService.getCount("userId", ids);
                    break;
                case "start":
                    ids = lineService.searchIds("start", value);
                    list = userTicketService.getAll("lineId", ids, page);
                    count = userTicketService.getCount("lineId", ids);
                    break;
                case "end":
                    ids = lineService.searchIds("end", value);
                    list = userTicketService.getAll("lineId", ids, page);
                    count = userTicketService.getCount("lineId", ids);
                    break;
            }
            Pair<List<User>, List<Line>> dic = getDic(list);
            return ResponseEntity
                    .ok(new PaginatedUserTicketResult()
                            .setUserList(dic.getValue0())
                            .setLineList(dic.getValue1())
                            .setData(list)
                            .setCurrentPage(page)
                            .setCount(count));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @ApiOperation(value = "新增乘车记录")
    @PostMapping
    public ResponseEntity<?> postUserTicket(@RequestBody UserTicket instance) {
        userTicketService.addUserTicket(instance);
        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(instance.getId())
                .toUri();
        return ResponseEntity.created(location).body(instance);
    }

    @ApiOperation(value = "修改乘车记录")
    @PutMapping
    public ResponseEntity<?> putUserTicket(@RequestBody UserTicket UserTicket) {
        assertUserTicketExist(UserTicket.getId());

        userTicketService.modifyUserTicketById(UserTicket);

        return ResponseEntity.status(HttpStatus.ACCEPTED).body(UserTicket);
    }

    @ApiOperation(value = "删除乘车记录")
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteUserTicket(@PathVariable Long id) {
        assertUserTicketExist(id);

        boolean result = userTicketService.deleteUserTicketById(id);

        if (result)
            return ResponseEntity.accepted().build();
        else
            return ResponseEntity.notFound().build();

    }

    private void assertUserTicketExist(Long id) {
        userTicketService
                .getUserTicketByID(id)
                .orElseThrow(() -> new ResourceNotFoundException()
                        .setResourceName(Constant.RESOURCE_USER_TICKET)
                        .setId(id));
    }

    private Pair<List<User>, List<Line>> getDic(List<UserTicket> list){
        List<User> userList = new ArrayList<>();
        List<Line> lineList = new ArrayList<>();
        if (list.size() > 0) {
            userList = userService.getAll(userTicketService.getUserIds(list));
            lineList = lineService.getAll(userTicketService.getLineIds(list));
        }
        return new Pair<>(userList, lineList);
    }

    @Accessors(chain = true)
    @NoArgsConstructor
    @Data
    @ToString
    public class PaginatedUserTicketResult extends PaginatedResult {
        private Object userList;
        private Object lineList;
    }
}