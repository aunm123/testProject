package com.controller;

import com.domain.IconImg;
import com.domain.Item;
import com.server.ItemServer;
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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by timhuo on 2017/5/23.
 */
@Controller
public class ItemController extends BaseControllerImpl<Item> {

    @Autowired
    private ItemServer itemServer;
    @Autowired
    private ImageUtil imageUtil;


    @RequestMapping(value = "/item", method = RequestMethod.GET)   //查
    public
    @ResponseBody
    String itemGet(@RequestParam(name = "itemid") Integer itemid) {
        return " get ";
    }

    @RequestMapping(value = "/itemlist", method = RequestMethod.GET)   //查
    public
    @ResponseBody
    Map itemListGet(
            @RequestParam(name = "page", required = false, defaultValue = "1") int page,
            @RequestParam(name = "rows", required = false, defaultValue = "20") int rows
    ) {
        int toCount = itemServer.getTotalCount();
        List<Item> items = itemServer.findPage(new Page(rows, page, toCount));

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("rows", items);
        map.put("total", toCount);
        return map;
    }

    @RequestMapping(value = "/item", method = RequestMethod.POST)  //增 //改
    public ResponseEntity<Void> itemPost(Item item,
                                         @RequestParam(value = "iconimg", required = false) MultipartFile iconimg,
                                         @RequestParam(value = "iconid", required = false) int iconid,
                                         HttpServletRequest request) throws Exception {
        IconImg icon = null;
        if (!iconimg.isEmpty()){
            icon = imageUtil.saveIcon(iconimg, iconid, request);
        }

        Boolean aBoolean = itemServer.save(item);

        if (!aBoolean) {
            throw new BaseException("插入失败");
        }
        return ResponseEntity.ok().body(null);
    }


    @RequestMapping(value = "/item", method = RequestMethod.DELETE) //删
    public ResponseEntity<Void> itemDelete(@RequestParam(name = "itemid", required = true) Integer itemid) {

        Boolean aBoolean = itemServer.del(itemid);

        if (!aBoolean) {
            throw new BaseException("删除失败");
        }
        return ResponseEntity.ok().body(null);
    }

}
