package com.Service.impl;

import com.BaseDao.BaseMapper;
import com.Service.BaseService;
import tim.SpringUtil.SpringContextHolder;

import javax.annotation.PostConstruct;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

/**
 * Created by timhuo on 2017/4/20.
 */
public class BaseServiceImpl<T,PK extends Serializable> implements BaseService<T,PK> {

    protected BaseMapper<T,PK> baseDao;

    @PostConstruct
    public void initFunction(){
        ParameterizedType pt = (ParameterizedType)this.getClass().getGenericSuperclass();
        Class<T> classz = (Class<T>) pt.getActualTypeArguments()[0];
        String daoClassName = classz.getSimpleName().toLowerCase()+"Mapper";
        baseDao = (BaseMapper) SpringContextHolder.getBean(daoClassName);
    }

    public void add(T obj) {
        baseDao.insert(obj);
    }

    public void delete(PK id) {
        baseDao.deleteByPrimaryKey(id);
    }

    public void update(T obj) {
        baseDao.updateByPrimaryKey(obj);
    }

    public T findbyId(PK id) {
        return baseDao.selectByPrimaryKey(id);
    }

    public List<T> findAll() {
        return null;
    }
}
