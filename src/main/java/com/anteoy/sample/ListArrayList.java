package com.anteoy.sample;

import com.alibaba.fastjson.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhoudazhuang
 * Date: 16-11-8
 * Time: 上午12:06
 * Description :
 */
public class ListArrayList {
    public static void main(String[] args) {
        List list = new ArrayList();
        ArrayList arrayList = new ArrayList();

        ArrayList arrayList12 = (ArrayList) list;
        List list1 = arrayList;

        try{
            throw new RuntimeException("test!!!!");
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("continue!!!!");
        Object o = JSONObject.parse("dsfdfsd");

    }
}
