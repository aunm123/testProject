package com.tim;

import com.tim.page.Page;

import java.io.Serializable;
import java.util.List;

/**
 * Created by timhuo on 2017/5/18.
 */
public interface BaseDao<T> {
    public Boolean insert(T obj);
    public Boolean delete(T obj);
    public Boolean update(T obj);
    public T findById(Serializable id);
    public List getByIds(Long[] ids);
    public List<T> findAll();
    int getTotalCount();
    public List<T> findPage(Page page);
}
