package com.tim.BaseClass.BaseClassImpl;

import com.tim.BaseClass.BaseDao;
import com.tim.BaseClass.BaseServer;
import com.tim.page.Page;
import com.tim.tool.SpringUtil.SpringContextHolder;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

/**
 * Created by timhuo on 2017/5/18.
 */
public class BaseServerImpl<T> implements BaseServer<T> {

    @Autowired
    protected BaseDao<T> baseDao;

//    private Class<T> classz;
//
//    @PostConstruct
//    private void per(){
//        ParameterizedType pt = (ParameterizedType)this.getClass().getGenericSuperclass();
//        classz = (Class<T>) pt.getActualTypeArguments()[0];
//    }

    public Boolean save(T obj) {
        return baseDao.insert(obj);
    }

    public Boolean del(Serializable id) {
        return baseDao.delete(baseDao.findById(id));
    }

    public Boolean upd(T obj) {
        return baseDao.update(obj);
    }

    public T find(Serializable id) {
        return baseDao.findById(id);
    }

    public List getByIds(Long[] ids){
        return baseDao.getByIds(ids);
    }

    public List<T> findAll() {
        return baseDao.findAll();
    }

    public int getTotalCount() {
        return baseDao.getTotalCount();
    }

    public List<T> findPage(Page page) {
        return baseDao.findPage(page);
    }

}
