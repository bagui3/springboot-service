package com.wind.service.web.api;

import com.wind.service.common.Constant;
import com.wind.service.common.PaginatedResult;
import com.wind.service.exception.ResourceNotFoundException;
import com.wind.service.mybatis.pojo.PointRecord;
import com.wind.service.mybatis.pojo.User;
import com.wind.service.web.service.PointRecordService;
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
@RequestMapping("/point_record")
public class PointRecordController {

    @Autowired
    private PointRecordService pointRecordService;

    @Autowired
    private UserService userService;


    @ApiOperation(value = "获取积分记录详情")
    @GetMapping("/{id}")
    public ResponseEntity<?> getPointRecordsById(@PathVariable Long id) {
        return pointRecordService
                .getPointRecordByID(id)
                .map(ResponseEntity::ok)
                .orElseThrow(() -> new ResourceNotFoundException()
                        .setResourceName(Constant.RESOURCE_POINT_RECORD)
                        .setId(id));
    }

    @ApiOperation(value = "获取积分记录列表")
    @GetMapping("/all/{page}")
    public ResponseEntity<?> search(
            @RequestParam(value = "type", required = false, defaultValue = "") String type,
            @RequestParam(value = "value", required = false, defaultValue = "") String value,
            @PathVariable int page) {
        if ("".equals(type)) {
            List<PointRecord> list = pointRecordService.getAll(page);
            List<User> dic = getDic(list);
            return ResponseEntity
                    .ok(new PointRecordController.PaginatedUserPointRecordResult()
                            .setUserList(dic)
                            .setData(list)
                            .setCurrentPage(page)
                            .setCount(pointRecordService.getCount()));
        } else if ("phone".equals(type) || "name".equals(type)) {
            List<Long> ids = new ArrayList<>();
            List<PointRecord> list = new ArrayList<>();
            int count = 0;
            switch (type) {
                case "name":
                    ids = userService.searchIds("name", value);
                    list = pointRecordService.getAll("userid", ids, page);
                    count = pointRecordService.getCount("userid", ids);
                    break;
                case "phone":
                    ids = userService.searchIds("phone", value);
                    list = pointRecordService.getAll("userid", ids, page);
                    count = pointRecordService.getCount("userid", ids);
                    break;
            }
            List<User> dic = getDic(list);
            return ResponseEntity
                    .ok(new PointRecordController.PaginatedUserPointRecordResult()
                            .setUserList(dic)
                            .setData(list)
                            .setCurrentPage(page)
                            .setCount(count));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @ApiOperation(value = "新增积分记录")
    @PostMapping
    public ResponseEntity<?> postPointRecords(@RequestBody PointRecord instance) {
        pointRecordService.addPointRecord(instance);
        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(instance.getId())
                .toUri();
        return ResponseEntity.created(location).body(instance);
    }

    @ApiOperation(value = "修改积分记录")
    @PutMapping
    public ResponseEntity<?> putPointRecords(@RequestBody PointRecord PointRecords) {
        assertPointRecordsExist(PointRecords.getId());

        pointRecordService.modifyPointRecordById(PointRecords);

        return ResponseEntity.status(HttpStatus.ACCEPTED).body(PointRecords);
    }

    @ApiOperation(value = "删除积分记录")
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletePointRecords(@PathVariable Long id) {
        assertPointRecordsExist(id);

        boolean result = pointRecordService.deletePointRecordById(id);

        if (result)
            return ResponseEntity.accepted().build();
        else
            return ResponseEntity.notFound().build();

    }

    private void assertPointRecordsExist(Long id) {
        pointRecordService
                .getPointRecordByID(id)
                .orElseThrow(() -> new ResourceNotFoundException()
                        .setResourceName(Constant.RESOURCE_POINT_RECORD)
                        .setId(id));
    }

    private List<User> getDic(List<PointRecord> list) {
        List<User> userList = new ArrayList<>();
        if (list.size() > 0) {
            userList = userService.getAll(pointRecordService.getUserIds(list));
        }
        return userList;
    }

    @Accessors(chain = true)
    @NoArgsConstructor
    @Data
    @ToString
    public class PaginatedUserPointRecordResult extends PaginatedResult {
        private Object userList;
    }
}