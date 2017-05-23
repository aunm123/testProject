package com.tim.BaseClass;

import com.tim.page.Page;

import java.io.Serializable;
import java.util.List;

/**
 * Created by timhuo on 2017/5/18.
 */
public interface BaseServer<T> {
    public Boolean save(T obj);
    public Boolean del(Serializable id);
    public Boolean upd(T obj);
    public T find(Serializable id);
    public List getByIds(Long[] ids);
    public List<T> findAll();
    int getTotalCount();
    public List<T> findPage(Page page);
}
