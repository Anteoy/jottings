package com.anteoy.utils;

import com.alibaba.fastjson.JSONObject;

/**
 * Created by zhoudazhuang
 * Date: 16-11-9
 * Time: 上午9:38
 * Description :由于JSONObject实现了Map，
 * 所以Spring MVC3的默认处理器MapMethodProcessor会先起作用，这样就不能正常的映射成JSONObject对象了。
 * 做一个简单的JSONObject包装类，以使MapMethodProcessor不能对其进行处理。
 * 自定的HandlerMethodArgumentResolver会晚于Spring自己的被执行，JSONObject会被MapMethodProcessor先处理。
 */
public class JSONObjectWrapper {
    private JSONObject jsonObject;

    public JSONObjectWrapper(JSONObject jsonObject) {
        this.jsonObject = jsonObject;
    }

    public JSONObject getJSONObject() {
        return jsonObject;
    }
}
