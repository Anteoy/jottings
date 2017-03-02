package com.anteoy.dataStructuresAndAlgorithm.javav2;

import java.util.ArrayList;

/**
 * Created by zhoudazhuang on 17-3-1.
 * Description:
 */
public class ListGo {

    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);

        //进栈
        arrayList.add(arrayList.size(),2);

        //出栈
        arrayList.remove(arrayList.size()-1);

        System.out.println(arrayList);
    }
}
