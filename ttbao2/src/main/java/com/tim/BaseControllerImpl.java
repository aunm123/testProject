package com.tim;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by timhuo on 2017/5/18.
 */
public class BaseControllerImpl<T> implements BaseConterller<T> {

    @ExceptionHandler
    public @ResponseBody
    Map exceptionProcess(HttpServletRequest request, HttpServletResponse
            response, RuntimeException ex) {

        Map<String, String[]> map1 = request.getParameterMap();

        Map<String,Object> map = new HashMap<String, Object>();
        map.put("isError",true);
        map.put("msg",ex.getMessage());
        return map1;

    }

}
