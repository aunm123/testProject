package com.server;

import com.domain.IconImg;
import com.domain.User;
import com.tim.BaseClass.BaseServer;

/**
 * Created by timhuo on 2017/5/23.
 */
public interface UserServer extends BaseServer<User> {
    public boolean saveUserWithIcon(User user, IconImg iconImg);
}
