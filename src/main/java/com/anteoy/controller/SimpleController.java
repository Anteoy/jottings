package com.anteoy.controller;

import com.anteoy.annotation.FormModel;
import com.anteoy.entity.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by zhoudazhuang
 * Date: 16-11-7
 * Time: 上午10:21
 * Description :
 */
@Controller
public class SimpleController {
    @RequestMapping("simple")
    public ModelAndView simple(@FormModel("p")Person p ){
        ModelAndView tmpMAV = new ModelAndView("index");
        String oo = "";
        System.out.println(p);
        tmpMAV.addObject("p.name",p.getName());
        return tmpMAV;
    }
}
