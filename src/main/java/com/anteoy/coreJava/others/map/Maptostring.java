package com.anteoy.coreJava.others.map;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by zhoudazhuang
 * Date: 17-1-17
 * Time: 上午11:27
 * Description :
 */
public class Maptostring {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("a","1");
        map.put("b","2");
        String mapstr = map.toString();
        System.out.println(mapstr);

    }
}
