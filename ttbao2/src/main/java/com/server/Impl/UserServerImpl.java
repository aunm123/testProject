package com.server.Impl;

import com.domain.IconImg;
import com.domain.User;
import com.server.UserServer;
import com.tim.BaseClass.BaseClassImpl.BaseServerImpl;
import org.springframework.stereotype.Service;

/**
 * Created by timhuo on 2017/5/18.
 */
@Service("userServer")
public class UserServerImpl extends BaseServerImpl<User> implements UserServer {

    public boolean saveUserWithIcon(User user, IconImg iconImg){

        if (iconImg!=null){
            user.setIcon(iconImg);
        }

        Boolean aBoolean = false;
        if (0 != user.getUserid()) {
            aBoolean = baseDao.update(user);
        } else {
            user.setUserid(null);
            aBoolean = baseDao.insert(user);
        }

        return aBoolean;
    }
}
