package com.Service.impl;

import com.Entity.User;
import com.Entity.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by timhuo on 2017/4/20.≤
 */
@Service("userServer2")
public class UserServer2 {
    @Autowired
    private UserMapper userMapper;

    public void saveUser(User user){
        userMapper.insert(user);
    }
}
