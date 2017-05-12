package com.Controller;

import com.Entity.User;
import com.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by timhuo on 2017/4/20.
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/user",method = RequestMethod.GET)   //查
    public @ResponseBody String userListGet(@RequestParam(name = "name",required = false,defaultValue = "defaultName")String name){
        return name+" get ";
    }
    @RequestMapping(value = "/user",method = RequestMethod.POST)  //增
    public @ResponseBody String userListPost(@RequestParam(name = "name",required = false,defaultValue = "defaultName")String name){
        return name+" post ";
    }
    @RequestMapping(value = "/user",method = RequestMethod.PUT)   //改
    public @ResponseBody String userListPut(@RequestParam(name = "name",required = false,defaultValue = "defaultName")String name){
        return name+" put ";
    }
    @RequestMapping(value = "/user",method = RequestMethod.DELETE) //删
    public @ResponseBody String userListDelete(@RequestParam(name = "name",required = false,defaultValue = "defaultName")String name){
        return name+" delete ";
    }

    @RequestMapping(value = "/userjson",method = RequestMethod.GET)
    public @ResponseBody List<User> userListJson(){
        return userService.findAll();
    }

    @RequestMapping(value = "/hello", produces = "text/plain;charset=UTF-8")
    public @ResponseBody String hello() {
        return "你好！hello";
    }

    @RequestMapping(value = "/hellojsp", method = RequestMethod.GET)
    public String hellojsp() {
        return "hello";
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String indexjsp() {
        return "index";
    }
}
