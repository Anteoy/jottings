package com.anteoy.plugins;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by zhoudazhuang
 * Date: 16-11-9
 * Time: 下午6:29
 * Description :
 */
@ControllerAdvice
public class ControllerAdviceHandler {
    private static final Logger log = LoggerFactory.getLogger(ControllerAdviceHandler.class);

    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Object exceptionHandler(HttpServletRequest request, HttpServletResponse response, Exception e) {
        Map<String, Object> hello = new HashMap<>(2);
        hello.put("hello", "helllo msg");
        hello.put("msg", e.getMessage());
        String a = "日本人";
        org.slf4j.Marker marker;
        log.error("error in url:{}, reason: {}", request.getRequestURI().toString(), e);
        return hello;
    }

    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(value = RuntimeException.class)
    @ResponseBody
    public Object runtimeExceptionHandler(HttpServletRequest request, HttpServletResponse response, Exception e) {
        Map<String, Object> hello = new HashMap<>(2);
        hello.put("errMsg", "runtimeexception");
        hello.put("msg", e.getMessage());
        log.error("error in url:{}, reason: {}", request.getRequestURI().toString(), e);
        return hello;
    }
}
