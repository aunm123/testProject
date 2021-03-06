package com.controller;

import com.domain.Address;
import com.domain.IconImg;
import com.domain.User;
import com.server.UserServer;
import com.tim.BaseClass.BaseClassImpl.BaseControllerImpl;
import com.tim.Execption.BaseException;
import com.tim.page.Page;
import com.tim.tool.ImageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
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
    private UserServer userServerImpl;
    @Autowired
    private ImageUtil imageUtil;

    @RequestMapping(value = "/user", method = RequestMethod.GET)   //查
    public
    @ResponseBody
    String userGet(@RequestParam(name = "name", required = false, defaultValue = "defaultName") String name) {
        return name + " get ";
    }

    @RequestMapping(value = "/userlist", method = RequestMethod.GET)   //查
    public
    @ResponseBody
    Map userListGet(
            @RequestParam(name = "page", required = false, defaultValue = "1") int page,
            @RequestParam(name = "rows", required = false, defaultValue = "20") int rows
    ) {
        int toCount = userServerImpl.getTotalCount();
        List<User> users = userServerImpl.findPage(new Page(rows, page, toCount));

        for (User user : users) {
            user.setAddresses(Collections.<Address>emptySet());
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("rows", users);
        map.put("total", toCount);
        return map;
    }

    @RequestMapping(value = "/user", method = RequestMethod.POST)  //增 //改
    public ResponseEntity<Void> userPost(User user,
                                         @RequestParam(value = "iconimg", required = false) MultipartFile iconimg,
                                         @RequestParam(value = "iconid", required = false) int iconid,
                                         HttpServletRequest request) throws Exception {
        IconImg icon = null;
        if (!iconimg.isEmpty()){
            icon = imageUtil.saveIcon(iconimg, iconid, request);
        }

        Boolean aBoolean = userServerImpl.saveUserWithIcon(user,icon);

        if (!aBoolean) {
            throw new BaseException("插入失败");
        }
        return ResponseEntity.ok().body(null);
    }

//    @RequestMapping(value = "/user",method = RequestMethod.PUT)   //改
//    public void userPut(User user,
////                                          @RequestParam(value = "iconimg", required = false) MultipartFile iconimg,
//                                          HttpServletRequest request) throws Exception {
//        String iconFileName = UID.getUUID();
//        String filePath = "";
//        String saveFilePath = "";
//
//
//        Boolean aBoolean = false;//userServer.add(user);
//        if (!aBoolean){
//            throw new BaseException("插入失败");
//        }
//    }


    @RequestMapping(value = "/user", method = RequestMethod.DELETE) //删
    public ResponseEntity<Void> userDelete(@RequestParam(name = "userid", required = true) Integer userid) {

        Boolean aBoolean = userServerImpl.del(userid);

        if (!aBoolean) {
            throw new BaseException("删除失败");
        }
        return ResponseEntity.ok().body(null);
    }
}
