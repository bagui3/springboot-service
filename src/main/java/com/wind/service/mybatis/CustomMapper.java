package com.wind.service.mybatis;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;
import tk.mybatis.mapper.common.ids.SelectByIdsMapper;

public interface CustomMapper<T> extends Mapper<T>, MySqlMapper<T>, SelectByIdsMapper<T> {
}
