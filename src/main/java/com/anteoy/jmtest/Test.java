package com.anteoy.jmtest;

import com.alibaba.fastjson.JSONArray;

import java.util.ArrayList;
import java.util.List;

/**
 * @auther zhoudazhuang
 * @date 18-10-19 14:59
 * @description
 */
public class Test {

    static class A {
        int a;
        int b;
        A(int a,int b){
            this.a = a;
            this.b = b;
        }

        @Override
        public String toString() {
            return super.toString();
        }
    }

    public static void main(String[] args) {
//        List<Map<String, Object>> test1 = new ArrayList();
//        test1.add(new HashedMap(){{
//            put("1",2);
//        }});
//        test1.add(new HashedMap(){{
//            put("3",4);
//        }});
        List test1 = new ArrayList();
        test1.add(new A(3,4));
        test1.add(new A(5,6));
        test1.add(new A(7,8));
//        JSONArray test = (JSONArray) JSONArray.toJSON(test1);
        System.out.println(test1.get(0).getClass());
        JSONArray sa = (JSONArray) JSONArray.toJSON(test1.subList(0,2));
        System.out.println(sa.get(0).getClass());
//        System.out.println(sa.size());
//        System.out.println(sa);
        change(sa);
//        System.out.println(test);



        //========= bad way
        int a = 28;
        int max = 30;
        int time = a/max;
        int remainder = a%max;
        System.out.println(time);
        System.out.println(remainder);
        for (int i = 0;i < time ; i++){
            int c_start = max*i;
            int c_end = max*(i+1) ;
            if (i == (time-1)) {
                c_end += 1;
            }
            System.out.println("第" + i + "次" + "start :" + c_start + "  end :  "+ c_end);
        }
        if (remainder != 0) {
            int c_start = max*time;
            int c_end = a + 1;
            System.out.println("the end remainder start :" + c_start + " end " + c_end);
        }
    }

    static void change (final JSONArray jsonArray){
        // com.alibaba.fastjson.JSONObject cannot be cast to com.jumei.search.service.sync.impl.Test$A 如果打开会报错 注释了就不会报错
        //看上面的类型打印结果 类型已经不一致
//        class com.jumei.search.service.sync.impl.Test$A
//        class com.alibaba.fastjson.JSONObject
        ((A)jsonArray.get(0)).a = 123;
        ((A)jsonArray.get(0)).b = 456;
        //下面是可以正常执行的 因为JSONOBject 实现了map => implements Map<String, Object>
//        ((Map<String,Object>)jsonArray.get(0)).put("1",100);
//        ((Map<String,Object>)jsonArray.get(0)).put("2",2932);
    }
}
