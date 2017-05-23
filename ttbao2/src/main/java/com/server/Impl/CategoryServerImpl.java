package com.server.Impl;

import com.domain.Category;
import com.server.CategoryServer;
import com.tim.BaseClass.BaseClassImpl.BaseServerImpl;
import org.springframework.stereotype.Service;

/**
 * Created by timhuo on 2017/5/23.
 */
@Service("categoryServer")
public class CategoryServerImpl extends BaseServerImpl<Category> implements CategoryServer {
}
