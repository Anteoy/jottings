package com.anteoy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by zhoudazhuang
 * Date: 16-11-7
 * Time: 上午10:21
 * Description :
 */
@Controller
public class SimpleController {
    @RequestMapping
    public String simple(){
        String oo = "";
        return "simple";
    }
}
