package com.anteoy.dataStructuresAndAlgorithm.javav2.my;

/**
 * Created by zhoudazhuang on 17-3-1.
 * Description:
 */
public class GoArrayListTest {
    public static void main(String[] args) {
        GoArrayList<Integer> goArrayList = new GoArrayList<>();
        goArrayList.add(1);
        goArrayList.add(2);
        goArrayList.add(3);
        //把数4的位置放在数3的位置上
        goArrayList.add(2,4);
        for (Integer goArrayList1:goArrayList){
            System.out.println(goArrayList1);
        }
    }
}
