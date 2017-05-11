package com.BaseDao;

import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by timhuo on 2017/4/20.
 */
public interface BaseMapper<T> {

    long countByExample(Object example);

    int deleteByExample(Object example);

    int deleteByPrimaryKey(Object pk);

    int insert(T record);

    int insertSelective(T record);

    List<T> selectByExample(Object example);

    T selectByPrimaryKey(Object pk);

    int updateByExampleSelective(@Param("record") T record, @Param("example") Object example);

    int updateByExample(@Param("record") T record, @Param("example") Object example);

    int updateByPrimaryKeySelective(T record);

    int updateByPrimaryKey(T record);
}
