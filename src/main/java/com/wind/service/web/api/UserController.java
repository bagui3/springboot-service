package com.wind.service.web.api;

import com.wind.service.common.Constant;
import com.wind.service.common.PaginatedResult;
import com.wind.service.exception.ResourceNotFoundException;
import com.wind.service.mybatis.pojo.User;
import com.wind.service.web.service.UserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @ApiOperation(value = "获取乘客详情")
    @GetMapping("/{id}")
    public ResponseEntity<?> getUserById(@PathVariable Long id) {
        return userService
                .getUserByID(id)
                .map(ResponseEntity::ok)
                .orElseThrow(() -> new ResourceNotFoundException()
                        .setResourceName(Constant.RESOURCE_USER)
                        .setId(id));
    }

    @ApiOperation(value = "获取乘客列表")
    @GetMapping("/all/{page}")
    public ResponseEntity<?> search(
            @RequestParam(value = "type", required = false, defaultValue = "") String type,
            @RequestParam(value = "value", required = false, defaultValue = "") String value,
            @PathVariable int page) {
        if ("".equals(type)) {
            return ResponseEntity
                    .ok(new PaginatedResult()
                            .setData(userService.getAll(page))
                            .setCurrentPage(page)
                            .setCount(userService.getCount()));
        } else {
            assert ("name".equals(type) || "phone".equals(type) || "recommendPhone".equals(type));
            return ResponseEntity
                    .ok(new PaginatedResult()
                            .setData(userService.getAll(type, value, page))
                            .setCurrentPage(page)
                            .setCount(userService.getCount(type, value)));
        }
    }

    @ApiOperation(value = "新增乘客")
    @PostMapping
    public ResponseEntity<?> postUser(@RequestBody User instance) {
        Optional<User> result = userService.getUserByName(instance.getName());

        if (!result.isPresent()) {
            userService.addUser(instance);
            URI location = ServletUriComponentsBuilder
                    .fromCurrentRequest()
                    .path("/{id}")
                    .buildAndExpand(instance.getId())
                    .toUri();
            return ResponseEntity.created(location).body(instance);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).build();
        }
    }

    @ApiOperation(value = "修改乘客")
    @PutMapping
    public ResponseEntity<?> putUser(@RequestBody User User) {
        assertUserExist(User.getId());

        userService.modifyUserById(User);

        return ResponseEntity.status(HttpStatus.ACCEPTED).body(User);
    }

    @ApiOperation(value = "删除乘客")
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteUser(@PathVariable Long id) {
        assertUserExist(id);

        boolean result = userService.deleteUserById(id);

        if (result)
            return ResponseEntity.accepted().build();
        else
            return ResponseEntity.notFound().build();

    }

    private void assertUserExist(Long id) {
        userService
                .getUserByID(id)
                .orElseThrow(() -> new ResourceNotFoundException()
                        .setResourceName(Constant.RESOURCE_LINE)
                        .setId(id));
    }
}