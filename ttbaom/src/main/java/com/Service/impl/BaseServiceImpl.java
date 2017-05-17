package com.Service.impl;

import com.BaseDao.BaseMapper;
import com.Service.BaseService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import tim.SpringUtil.SpringContextHolder;

import javax.annotation.PostConstruct;
import java.lang.reflect.ParameterizedType;
import java.util.List;

/**
 * Created by timhuo on 2017/4/20.
 */
public class BaseServiceImpl<T> implements BaseService<T> {

    protected BaseMapper<T> baseDao;

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

    public void delete(Object id) {
        baseDao.deleteByPrimaryKey(id);
    }

    public void update(T obj) {
        baseDao.updateByPrimaryKey(obj);
    }

    public T findbyId(Object id) {
        return baseDao.selectByPrimaryKey(id);
    }

    public List<T> findAll() {
        return baseDao.selectByExample(null);
    }

    public List<T> findWithPageAndRows(int page, int rows) {

        PageHelper.startPage(page, rows);
        List<T> list = baseDao.selectByExample(null);
        //用PageInfo对结果进行包装
        PageInfo<T> pageInfo = new PageInfo<T>(list);
        return pageInfo.getList();
    }
}
