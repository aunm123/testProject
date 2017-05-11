package com.Service;

import java.util.List;

/**
 * Created by timhuo on 2017/4/20.
 */
public interface BaseService<T> {
    public void add(T obj);
    public void delete(Object id);
    public void update(T obj);
    public T findbyId(Object id);
    public List<T> findAll();
}
