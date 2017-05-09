package com.Controller;

import com.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by timhuo on 2017/4/20.
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("./user")
    public String userList(@RequestParam(name = "callback") String callback){
        return "success";
    }
}
