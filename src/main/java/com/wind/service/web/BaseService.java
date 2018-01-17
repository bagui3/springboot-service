package com.wind.service.web;

import com.github.pagehelper.PageHelper;
import com.wind.service.common.Constant;
import com.wind.service.mybatis.CustomMapper;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public abstract class BaseService<T> {
    /**
     * DAO Mapper
     */
    CustomMapper<T> mapper;

    protected void setMapper(CustomMapper<T> mapper) {
        this.mapper = mapper;
    }

    protected CustomMapper<T> getMapper() {
        return mapper;
    }

    /**
     * 获取真实反射类型
     *
     * @return 反射类型
     */
    Class getActualClass() {
        Type type = getClass().getGenericSuperclass();

        // 判断是否泛型
        if (type instanceof ParameterizedType) {
            // 返回表示此类型实际类型参数的Type对象的数组
            Type[] types = ((ParameterizedType) type).getActualTypeArguments();
            return (Class) types[0];  //将第一个泛型T对应的类返回
        } else {
            return Object.class;//若没有给定泛型，则返回Object类
        }
    }

    public Optional<T> selectByID(Long id) {
        return Optional.ofNullable(mapper.selectByPrimaryKey(id));
    }

    /**
     * 根据ID列表获取实例列表
     *
     * @param idList ID列表
     * @return 实例列表
     */
    public List<T> selectAll(List<Long> idList) {
        String ids = "";
        for (int index = 0; index < idList.size(); index++) {
            ids += Long.toString(idList.get(index));
            if (index != idList.size() - 1) {
                ids += ",";
            }
        }
        if ("".equals(ids)) {
            return new ArrayList<>();
        } else {
            return mapper.selectByIds(ids);
        }
    }

    /**
     * 根据页数获取实例列表
     *
     * @param page 页数
     * @return 实例列表
     */
    public List<T> selectAll(int page) {
        Example example = new Example(getActualClass());
        example.setOrderByClause("id desc");
        PageHelper.startPage(page, Constant.PAGE_SIZE);
        return mapper.selectByExample(example);
    }

    /**
     * 根据字段(字符型)和页数获取实例列表
     *
     * @param type  字段
     * @param value 查询参数(字符型)
     * @param page  页数
     * @return 实例列表
     */
    public List<T> selectAll(String type, String value, int page) {
        Example example = new Example(getActualClass());
        example.setOrderByClause("id desc");
        Example.Criteria criteria = example.createCriteria();
        if (type.toLowerCase().endsWith("id")) {
            criteria.andEqualTo(Long.valueOf(value));
        } else {
            criteria.andLike(type, "%" + value + "%");
        }
        PageHelper.startPage(page, Constant.PAGE_SIZE);
        return mapper.selectByExample(example);
    }

    /**
     * 根据字段(字符型)获取实例列表
     *
     * @param type 字段
     * @param value 查询参数(字符型)
     * @return 实例列表
     */
    public List<T> selectAll(String type, String value) {
        Example example = new Example(getActualClass());
        example.setOrderByClause("id desc");
        Example.Criteria criteria = example.createCriteria();
        if (type.toLowerCase().endsWith("id")) {
            criteria.andEqualTo(Long.valueOf(value));
        } else {
            criteria.andLike(type, "%" + value + "%");
        }
        return mapper.selectByExample(example);
    }

    /**
     * 根据字段(ID列表)和页数获取实例列表
     *
     * @param type 字段
     * @param ids  ID列表
     * @param page 页数
     * @return 实例列表
     */
    public List<T> selectAll(String type, List<Long> ids, int page) {
        if (ids.isEmpty()) {
            return new ArrayList<>();
        } else {
            Example example = new Example(getActualClass());
            example.setOrderByClause("id desc");
            Example.Criteria criteria = example.createCriteria();
            criteria.andIn(type, ids);
            PageHelper.startPage(page, Constant.PAGE_SIZE);
            return mapper.selectByExample(example);
        }
    }

    /**
     * 根据字段(ID列表)获取实例列表
     *
     * @param type 字段
     * @param ids  ID列表
     * @return 实例列表
     */
    public List<T> selectAll(String type, List<Long> ids) {
        if (ids.isEmpty()) {
            return new ArrayList<>();
        } else {
            Example example = new Example(getActualClass());
            example.setOrderByClause("id desc");
            Example.Criteria criteria = example.createCriteria();
            criteria.andIn(type, ids);
            return mapper.selectByExample(example);
        }
    }

    /**
     * 获取实例总数
     *
     * @return 实例总数
     * @throws Exception 反射异常
     */
    public int getCount() throws Exception {
        Object object = getActualClass().newInstance();
        int count = mapper.selectCount((T) object);
        return count;
    }

    /**
     * 根据字段(字符型)获取实例总数
     *
     * @param type  字段
     * @param value 查询参数(字符型)
     * @return 实例总数
     */
    public int getCount(String type, String value) {
        Example example = new Example(getActualClass());
        Example.Criteria criteria = example.createCriteria();
        if (type.toLowerCase().endsWith("id")) {
            criteria.andEqualTo(Long.valueOf(value));
        } else {
            criteria.andLike(type, "%" + value + "%");
        }
        int count = mapper.selectCountByExample(example);
        return count;
    }

    /**
     * 根据字段(ID列表)获取实例总数
     *
     * @param type  字段
     * @param ids ID列表
     * @return 实例总数
     */
    public int getCount(String type, List<Long> ids) {
        if (ids.isEmpty()) {
            return 0;
        } else {
            Example example = new Example(getActualClass());
            Example.Criteria criteria = example.createCriteria();
            criteria.andIn(type, ids);
            int count = mapper.selectCountByExample(example);
            return count;
        }
    }

    /**
     * 从实例列表中提取ID列表
     *
     * @param list 实例列表
     * @return ID列表
     */
    public List<Long> getIds(List<T> list) throws Exception {
        return getRelatedIds(list, "id");
    }

    /**
     * 提取对象列表中所有特定ID字段列表
     *
     * @param list  对象列表
     * @param filed 私有字段名
     * @return 所有特定ID字段列表
     * @throws Exception 反射异常
     */
    public List<Long> getRelatedIds(List<T> list, String filed) throws Exception {
        Class type = getActualClass();
        Field field = type.getDeclaredField(filed);
        field.setAccessible(true);
        ArrayList<Long> result = new ArrayList<>();
        for (T instance : list) {
            Long e = Long.parseLong(field.get(instance).toString());
            if (!result.contains(e)) {
                result.add(e);
            }
        }
        return result;
    }

    @Transactional
    public boolean add(T T) {
        return mapper.insertUseGeneratedKeys(T) > 0;
    }

    @Transactional
    public boolean modifyById(T T) {
        return mapper.updateByPrimaryKey(T) > 0;
    }

    @Transactional
    public boolean deleteById(Long id) {
        return mapper.deleteByPrimaryKey(id) > 0;
    }
}
