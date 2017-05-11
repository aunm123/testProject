package com.Service.impl;

import com.Entity.Order;
import com.Entity.OrderItem;
import com.Entity.OrderItemExample;
import com.Entity.dao.OrderItemMapper;
import com.Service.OrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import static com.sun.tools.doclint.Entity.nu;

/**
 * Created by timhuo on 2017/5/9.
 */
@Service("orderService")
public class OrderServiceImpl extends BaseServiceImpl<Order> implements OrderService {

    @Resource
    private OrderItemMapper orderItemDao;

    public Object getOrderDetailByPrimaryKey(Integer key) {
        Order order = this.baseDao.selectByPrimaryKey(key);

        OrderItemExample orderItemExample = new OrderItemExample();
        OrderItemExample.Criteria criteria = orderItemExample.createCriteria();

        criteria.andOrderidEqualTo(order.getOrderid());

        List<OrderItem> orderItems = orderItemDao.selectByExample(orderItemExample);

        return orderItems;
    }
}
