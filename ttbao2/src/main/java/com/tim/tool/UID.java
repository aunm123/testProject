package com.tim.tool;

import java.util.UUID;

/**
 * Created by timhuo on 2017/5/22.
 */
public class UID {

    public static String getUUID(){
        String uuid = UUID.randomUUID().toString().trim().replaceAll("-", "");
        return uuid;
    }

}
