package com.dao;

import com.domain.User;
import com.tim.BaseDaoImpl;
import org.springframework.stereotype.Component;

/**
 * Created by Tim on 2017/5/18.
 */
@Component("userDao")
public class UserDao extends BaseDaoImpl<User> {

}
