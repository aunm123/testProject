package com.dao;

import com.domain.Item;
import com.tim.BaseClass.BaseClassImpl.BaseDaoImpl;
import org.springframework.stereotype.Component;

/**
 * Created by timhuo on 2017/5/23.
 */
@Component("itemDao")
public class ItemDao extends BaseDaoImpl<Item> {
}
