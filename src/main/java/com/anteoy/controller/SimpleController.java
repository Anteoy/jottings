package com.anteoy.controller;

import com.anteoy.annotation.FormModel;
import com.anteoy.entity.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by zhoudazhuang Date: 16-11-7 Time: 上午10:21 Description :
 */
@Controller
public class SimpleController {
    @RequestMapping("simple")
    public ModelAndView simple(@FormModel("p") Person p) {
        System.out.println(p.getName());
        ModelAndView tmpMAV = new ModelAndView("index");
        String oo = "";
        System.out.println(p);
        tmpMAV.addObject("p.name", p.getName());
        return tmpMAV;
    }

    @RequestMapping("/index")
    public ModelAndView index(HttpServletRequest request) {
        String oo = request.getParameter("oo");
        if (oo.equals("oo")) {
            throw new RuntimeException("error in index");
            // return new ModelAndView("redirect:/" + index);
        }
        return null;
        // return new ModelAndView(index);
    }

    @ResponseBody
    @RequestMapping(value = "/indexJson", produces = "application/json")
    public Person indexJson(HttpServletRequest request) {
        Person person = new Person();
        person.setName("dsf");
        return person;
    }
}
