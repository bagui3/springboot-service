package com.wind.service.web.api;

import com.wind.service.common.Constant;
import com.wind.service.common.PaginatedResult;
import com.wind.service.exception.ResourceNotFoundException;
import com.wind.service.mybatis.pojo.Line;
import com.wind.service.web.service.LineService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.Optional;

@RestController
@RequestMapping("/line")
public class LineController {

    @Autowired
    private LineService lineService;

    @ApiOperation(value = "获取线路详情")
    @GetMapping("/{id}")
    public ResponseEntity<?> getLineById(@PathVariable Long id) {
        return lineService
                .getLineByID(id)
                .map(ResponseEntity::ok)
                .orElseThrow(() -> new ResourceNotFoundException()
                        .setResourceName(Constant.RESOURCE_LINE)
                        .setId(id));
    }

    @ApiOperation(value = "获取线路列表")
    @GetMapping("/all/{page}")
    public ResponseEntity<?> search(
            @RequestParam(value = "type", required = false, defaultValue = "") String type,
            @RequestParam(value = "value", required = false, defaultValue = "") String value,
            @PathVariable int page) {
        if ("".equals(type)) {
            return ResponseEntity
                    .ok(new PaginatedResult()
                            .setData(lineService.getAll(page))
                            .setCurrentPage(page)
                            .setCount(lineService.getCount()));
        } else if ("name".equals(type) || "start".equals(type) || "end".equals(type)) {
            return ResponseEntity
                    .ok(new PaginatedResult()
                            .setData(lineService.getAll(type, value, page))
                            .setCurrentPage(page)
                            .setCount(lineService.getCount(type, value)));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @ApiOperation(value = "新增线路")
    @PostMapping
    public ResponseEntity<?> postLine(@RequestBody Line instance) {
        Optional<Line> result = lineService.getLineByName(instance.getName());

        if (!result.isPresent()) {
            lineService.addLine(instance);
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

    @ApiOperation(value = "修改线路")
    @PutMapping
    public ResponseEntity<?> putLine(@RequestBody Line Line) {
        assertLineExist(Line.getId());

        lineService.modifyLineById(Line);

        return ResponseEntity.status(HttpStatus.ACCEPTED).body(Line);
    }

    @ApiOperation(value = "删除线路")
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteLine(@PathVariable Long id) {
        assertLineExist(id);

        boolean result = lineService.deleteLineById(id);

        if (result)
            return ResponseEntity.accepted().build();
        else
            return ResponseEntity.notFound().build();

    }

    private void assertLineExist(Long id) {
        lineService
                .getLineByID(id)
                .orElseThrow(() -> new ResourceNotFoundException()
                        .setResourceName(Constant.RESOURCE_LINE)
                        .setId(id));
    }
}