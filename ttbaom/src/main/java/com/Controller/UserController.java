package com.Controller;

import com.Entity.User;
import com.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by timhuo on 2017/4/20.
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/user")
    public String userList(){
        System.out.println("asdasdasdasdas");
        return "success";
    }

    @RequestMapping(value = "/userjson",method = RequestMethod.GET)
    public @ResponseBody List<User> userListJson(){
        return userService.findAll();
    }

    @RequestMapping(value = "/hello", produces = "text/plain;charset=UTF-8")
    public @ResponseBody String hello() {
        return "你好！hello";
    }
}
