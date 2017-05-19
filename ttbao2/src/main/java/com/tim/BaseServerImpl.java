package com.tim;

import com.tim.page.Page;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;
import java.util.List;

/**
 * Created by timhuo on 2017/5/18.
 */
public class BaseServerImpl<T> implements BaseServer<T> {

    @Autowired
    private BaseDao<T> baseDao;

    public Boolean add(T obj) {
        return baseDao.insert(obj);
    }

    public Boolean del(T obj) {
        return baseDao.delete(obj);
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
