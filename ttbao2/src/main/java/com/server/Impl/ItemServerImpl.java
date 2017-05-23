package com.server.Impl;

import com.domain.Item;
import com.server.ItemServer;
import com.tim.BaseClass.BaseClassImpl.BaseServerImpl;
import org.springframework.stereotype.Service;

/**
 * Created by timhuo on 2017/5/23.
 */
@Service("itemServer")
public class ItemServerImpl extends BaseServerImpl<Item> implements ItemServer {
}
