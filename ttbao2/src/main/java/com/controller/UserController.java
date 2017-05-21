package com.controller;

import com.domain.Address;
import com.domain.User;
import com.tim.BaseControllerImpl;
import com.tim.BaseServer;
import com.tim.page.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by timhuo on 2017/5/18.
 */
@Controller
public class UserController extends BaseControllerImpl<User> {

    @Autowired
    private BaseServer<User> userServer;

    @RequestMapping(value = "/user",method = RequestMethod.GET)   //查
    public @ResponseBody
    String userGet(@RequestParam(name = "name",required = false,defaultValue = "defaultName")String name){
        return name+" get ";
    }

    @RequestMapping(value = "/userlist",method = RequestMethod.GET)   //查
    public @ResponseBody
    Map userListGet(
            @RequestParam(name = "page",required = false,defaultValue = "1")int page,
            @RequestParam(name = "rows",required = false,defaultValue = "2")int rows
    ){
        int toCount = userServer.getTotalCount();
        List<User> users = userServer.findPage(new Page(rows,page,toCount));

        for (User user : users){
            user.setAddresses(Collections.<Address>emptySet());
        }

        Map<String,Object> map = new HashMap<String, Object>();
        map.put("rows",users);
        map.put("total",toCount);
        return map;
    }

    @RequestMapping(value = "/user",method = RequestMethod.POST)  //增
    public ResponseEntity<String> userPost(User user,@RequestParam("iconimg") MultipartFile iconimg){
        user.setVsername(null);

        Boolean aBoolean = userServer.add(user);
        if (aBoolean){
            return ResponseEntity.ok(null);
        }else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("服务器正忙，请稍后再试");
        }
    }

    @RequestMapping(value = "/user",method = RequestMethod.PUT)   //改
    public @ResponseBody String userPut(@RequestParam(name = "name",required = false,defaultValue = "defaultName")String name){
        return name+" put ";
    }
    @RequestMapping(value = "/user",method = RequestMethod.DELETE) //删
    public @ResponseBody String userDelete(@RequestParam(name = "name",required = false,defaultValue = "defaultName")String name){
        return name+" delete ";
    }
}
