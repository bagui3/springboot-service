package com.wind.service.web.api;

import com.wind.service.common.Constant;
import com.wind.service.common.PaginatedResult;
import com.wind.service.exception.ResourceNotFoundException;
import com.wind.service.mybatis.pojo.UserTicket;
import com.wind.service.web.service.UserTicketService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.Optional;

@RestController
@RequestMapping("/user_ticket")
public class UserTicketController {

    @Autowired
    private UserTicketService userTicketService;

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
            return ResponseEntity
                    .ok(new PaginatedResult()
                            .setData(userTicketService.getAll(page))
                            .setCurrentPage(page)
                            .setCount(userTicketService.getCount()));
        } else {
            assert ("name".equals(type));
            return ResponseEntity
                    .ok(new PaginatedResult()
                            .setData(userTicketService.getAll(type, value, page))
                            .setCurrentPage(page)
                            .setCount(userTicketService.getCount(type, value)));
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
                        .setResourceName(Constant.RESOURCE_LINE)
                        .setId(id));
    }
}