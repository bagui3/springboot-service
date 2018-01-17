package com.wind.service.web;

import com.wind.service.mybatis.pojo.Line;
import com.wind.service.mybatis.pojo.User;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class ExtendController<T> extends BaseController<T> {

    @Autowired
    public BaseService<User> userService;

    @Autowired
    public BaseService<Line> lineService;

    public QueryResult unionQueryUser(String type, String value, int page, String column) throws Exception {
        QueryResult result = new QueryResult();
        if ("".equals(type)) {
            result = query(page, column);
            result.setUserList(userService.selectAll(result.getIds()));
        } else {
            result.setUserList(userService.selectAll(type, value));
            List<Long> ids = userService.getIds(result.getUserList());
            result.setList(service.selectAll(column, ids, page));
            result.setCount(service.getCount(column, ids));
        }
        return result;
    }

    public QueryResult unionQueryLine(String type, String value, int page, String column) throws Exception {
        QueryResult result = new QueryResult();
        if ("".equals(type)) {
            result = query(page, column);
            result.setLineList(lineService.selectAll(result.getIds()));
        } else {
            result.setLineList(lineService.selectAll(type, value));
            List<Long> ids = lineService.getIds(result.getLineList());
            result.setList(service.selectAll(column, ids, page));
            result.setCount(service.getCount(column, ids));
        }
        return result;
    }

    public QueryResult unionQueryUserAndLine(String type, String value, int page, String columnUser, String columnLine) throws Exception {
        QueryResult result = new QueryResult();
        if ("".equals(type)) {
            result = query(page, columnUser);
            result.setUserList(userService.selectAll(result.getIds()));
            List<Long> ids = service.getRelatedIds(result.getList(), columnLine);
            result.setLineList(lineService.selectAll(ids));
        } else {
            if (type.equals("phone") || type.equals("name")) {
                result.setUserList(userService.selectAll(type, value));
                List<Long> ids = userService.getIds(result.getUserList());
                result.setList(service.selectAll(columnUser, ids, page));
                result.setCount(service.getCount(columnUser, ids));
                ids = service.getRelatedIds(result.getList(), columnLine);
                result.setLineList(lineService.selectAll(ids));
            } else if (type.equals("start") || type.equals("end")) {
                result.setLineList(lineService.selectAll(type, value));
                List<Long> ids = lineService.getIds(result.getLineList());
                result.setList(service.selectAll(columnLine, ids, page));
                result.setCount(service.getCount(columnLine, ids));
                ids = service.getRelatedIds(result.getList(), columnUser);
                result.setUserList(userService.selectAll(ids));
            } else {
                result = query(type, value, page, columnUser);
                result.setUserList(userService.selectAll(result.getIds()));
                List<Long> ids = service.getRelatedIds(result.getList(), columnLine);
                result.setLineList(lineService.selectAll(ids));
            }
        }
        return result;
    }

    private QueryResult query(String type, String value, int page, String column) throws Exception {
        QueryResult result = new QueryResult();
        result.setList(service.selectAll(type, value, page));
        result.setCount(service.getCount(type, value));
        result.setIds(service.getRelatedIds(result.getList(), column));
        return result;
    }

    private QueryResult query(int page, String column) throws Exception {
        QueryResult result = new QueryResult();
        result.setList(service.selectAll(page));
        result.setCount(service.getCount());
        result.setIds(service.getRelatedIds(result.getList(), column));
        return result;
    }

    @Data
    @NoArgsConstructor
    public class QueryResult {
        private List<User> userList = new ArrayList<>();
        private List<Line> lineList = new ArrayList<>();
        private List<Long> ids = new ArrayList<>();
        private int count = 0;
        private List<T> list = new ArrayList<>();
    }
}
