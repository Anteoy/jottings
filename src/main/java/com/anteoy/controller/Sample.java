package com.anteoy.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/** Created by zhoudazhuang Date: 16-11-10 Time: 下午2:11 Description : */
@Controller
public class Sample {

  @RequestMapping("test")
  @ResponseBody
  public JSONObject test() {
    JSONObject jsonObject = new JSONObject();
    jsonObject.put("oo", "oo");
    return jsonObject;
  }
}
