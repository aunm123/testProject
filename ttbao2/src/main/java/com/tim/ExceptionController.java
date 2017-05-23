package com.tim;

import com.tim.Execption.BaseException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by timhuo on 2017/5/22.
 */
@ControllerAdvice
public class ExceptionController {

    @ExceptionHandler(BaseException.class)
    public @ResponseBody
    ResponseEntity<Map<String,Object>> exceptionProcess(HttpServletRequest request, HttpServletResponse
            response, BaseException ex) {

//        Map<String, String[]> map1 = request.getParameterMap();
//        MultipartHttpServletRequest multiRequest=(MultipartHttpServletRequest)request;
//        Iterator<String> fileNames = multiRequest.getFileNames();

        Map<String,Object> map = new HashMap<String, Object>();
        map.put("isError",true);
        map.put("msg",ex.getMessage());
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(map);

    }

    @ExceptionHandler(Exception.class)
    public @ResponseBody
    ResponseEntity<Map<String,Object>> otexceptionProcess(HttpServletRequest request, HttpServletResponse
            response, Exception ex) {

//        Map<String, String[]> map1 = request.getParameterMap();
//        MultipartHttpServletRequest multiRequest=(MultipartHttpServletRequest)request;
//        Iterator<String> fileNames = multiRequest.getFileNames();

        Map<String,Object> map = new HashMap<String, Object>();
        map.put("isError",true);
        map.put("msg",ex.getMessage());
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(map);

    }


//    @ExceptionHandler(SpittleNotFoundException.class)
//    @ResponseStatus(HttpStatus.NOT_FOUND)
//    public  Error spittleNotFound(SpittleNotFoundException e) {
//        long spittleId = e.getSpittleId();
//        return new Error(4, "Spittle [" + spittleId + "] not found");
//    }
//
//    @ExceptionHandler(DuplicateSpittleException.class)
//    public String duplicateSpittleHandler() {
//        return "error/duplicate";
//    }

}
