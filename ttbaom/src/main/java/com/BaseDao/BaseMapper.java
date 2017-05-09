package com.BaseDao;

import java.io.Serializable;

/**
 * Created by timhuo on 2017/4/20.
 */
public interface BaseMapper<T,PK extends Serializable> {

    int deleteByPrimaryKey(PK keyid);

    int insert(T record);

    int insertSelective(T record);

    T selectByPrimaryKey(PK keyid);

    int updateByPrimaryKeySelective(T record);

    int updateByPrimaryKey(T record);
}
