package com.Service.impl;

import com.Entity.User;
import com.Service.UserService;
import org.springframework.stereotype.Service;

/**
 * Created by timhuo on 2017/4/20.
 */
@Service("userService")
public class UserServiceImpl extends BaseServiceImpl<User> implements UserService {
}
