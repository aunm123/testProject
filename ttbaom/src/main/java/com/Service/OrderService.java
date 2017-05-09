package com.Service;

import com.Entity.Order;

/**
 * Created by timhuo on 2017/5/9.
 */
public interface OrderService extends BaseService<Order,Integer> {

    public Object getOrderDetailByPrimaryKey(Integer key);

}
