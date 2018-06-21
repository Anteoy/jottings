package com.anteoy.coreJava.notejava;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Created by zhoudazhuang on 18-6-21.
 */
public class NumOfEle {
    public static void main(String[] args) {
        String[] arr = new String[]{"aaa", "bbb", "ccc", "ddd", "ddd", "aaa"};

        Map<String, Integer> map = new HashMap<>();

        for (String str : arr) {
            Integer num = map.get(str);
            map.put(str, num == null ? 1 : num + 1);
        }
        Set set = map.entrySet();
        Iterator it = set.iterator();
        System.out.println("方法一 ：");

        while (it.hasNext()) {
            Map.Entry<String, Integer> entry = (Map.Entry<String, Integer>) it.next();
            System.out.println("单词 " + entry.getKey() + " 出现次数 : " + entry.getValue());
        }

        System.out.println("方法二 ：");

        Iterator it01 = map.keySet().iterator();
        while (it01.hasNext()) {
            Object key = it01.next();
            System.out.println("单词 " + key + " 出现次数 : " + map.get(key));

        }
    }
}
