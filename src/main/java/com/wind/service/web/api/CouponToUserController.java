package com.wind.service.web.api;

import com.wind.service.common.Constant;
import com.wind.service.common.PaginatedResult;
import com.wind.service.exception.ResourceNotFoundException;
import com.wind.service.mybatis.pojo.CouponToUser;
import com.wind.service.mybatis.pojo.User;
import com.wind.service.web.service.CouponToUserService;
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
@RequestMapping("/user_coupon")
public class CouponToUserController {

    @Autowired
    private CouponToUserService couponToUserService;

    @Autowired
    private UserService userService;


    @ApiOperation(value = "获取优惠券记录详情")
    @GetMapping("/{id}")
    public ResponseEntity<?> getCouponToUsersById(@PathVariable Long id) {
        return couponToUserService
                .getCouponToUserByID(id)
                .map(ResponseEntity::ok)
                .orElseThrow(() -> new ResourceNotFoundException()
                        .setResourceName(Constant.RESOURCE_POINT_RECORD)
                        .setId(id));
    }

    @ApiOperation(value = "获取优惠券记录列表")
    @GetMapping("/all/{page}")
    public ResponseEntity<?> search(
            @RequestParam(value = "type", required = false, defaultValue = "") String type,
            @RequestParam(value = "value", required = false, defaultValue = "") String value,
            @PathVariable int page) {
        if ("".equals(type)) {
            List<CouponToUser> list = couponToUserService.getAll(page);
            List<User> dic = getDic(list);
            return ResponseEntity
                    .ok(new CouponToUserController.PaginatedUserCouponToUserResult()
                            .setUserList(dic)
                            .setData(list)
                            .setCurrentPage(page)
                            .setCount(couponToUserService.getCount()));
        } else if ("phone".equals(type) || "name".equals(type)) {
            List<Long> ids = new ArrayList<>();
            List<CouponToUser> list = new ArrayList<>();
            int count = 0;
            switch (type) {
                case "name":
                    ids = userService.searchIds("name", value);
                    list = couponToUserService.getAll("userId", ids, page);
                    count = couponToUserService.getCount("userId", ids);
                    break;
                case "phone":
                    ids = userService.searchIds("phone", value);
                    list = couponToUserService.getAll("userId", ids, page);
                    count = couponToUserService.getCount("userId", ids);
                    break;
            }
            List<User> dic = getDic(list);
            return ResponseEntity
                    .ok(new CouponToUserController.PaginatedUserCouponToUserResult()
                            .setUserList(dic)
                            .setData(list)
                            .setCurrentPage(page)
                            .setCount(count));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @ApiOperation(value = "新增优惠券记录")
    @PostMapping
    public ResponseEntity<?> postCouponToUsers(@RequestBody CouponToUser instance) {
        couponToUserService.addCouponToUser(instance);
        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(instance.getId())
                .toUri();
        return ResponseEntity.created(location).body(instance);
    }

    @ApiOperation(value = "修改优惠券记录")
    @PutMapping
    public ResponseEntity<?> putCouponToUsers(@RequestBody CouponToUser CouponToUsers) {
        assertCouponToUsersExist(CouponToUsers.getId());

        couponToUserService.modifyCouponToUserById(CouponToUsers);

        return ResponseEntity.status(HttpStatus.ACCEPTED).body(CouponToUsers);
    }

    @ApiOperation(value = "删除优惠券记录")
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteCouponToUsers(@PathVariable Long id) {
        assertCouponToUsersExist(id);

        boolean result = couponToUserService.deleteCouponToUserById(id);

        if (result)
            return ResponseEntity.accepted().build();
        else
            return ResponseEntity.notFound().build();

    }

    private void assertCouponToUsersExist(Long id) {
        couponToUserService
                .getCouponToUserByID(id)
                .orElseThrow(() -> new ResourceNotFoundException()
                        .setResourceName(Constant.RESOURCE_POINT_RECORD)
                        .setId(id));
    }

    private List<User> getDic(List<CouponToUser> list) {
        List<User> userList = new ArrayList<>();
        if (list.size() > 0) {
            userList = userService.getAll(couponToUserService.getUserIds(list));
        }
        return userList;
    }

    @Accessors(chain = true)
    @NoArgsConstructor
    @Data
    @ToString
    public class PaginatedUserCouponToUserResult extends PaginatedResult {
        private Object userList;
    }
}