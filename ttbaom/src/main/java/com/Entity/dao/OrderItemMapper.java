package com.Entity.dao;

import com.BaseDao.BaseMapper;
import com.Entity.OrderItem;
import com.Entity.OrderItemKey;

import java.util.List;

public interface OrderItemMapper extends BaseMapper<OrderItem,OrderItemKey> {

    List<OrderItem> selectAllWithOrderId(Integer orderid);
}