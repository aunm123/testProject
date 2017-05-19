package com.tim;

import org.springframework.stereotype.Component;

/**
 * Created by timhuo on 2017/5/19.
 */
@Component("aopLogging")
public class aopLogging {
    public void before(){
        System.out.println("befault");
    }
}
