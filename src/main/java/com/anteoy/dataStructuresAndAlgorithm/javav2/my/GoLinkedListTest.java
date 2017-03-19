package com.anteoy.dataStructuresAndAlgorithm.javav2.my;

/**
 * Created by zhoudazhuang on 17-3-1.
 * Description: GoLinkedList测试
 */
public class GoLinkedListTest {


    public static void main(String[] args) {
        GoLinkedList<Integer> goLinkedList = new GoLinkedList<>();
        goLinkedList.add(1);
        goLinkedList.add(2);
        goLinkedList.add(3);
        goLinkedList.add(2,4);
        for (Integer go:goLinkedList){
            System.out.println(go);
        }
        System.out.printf(String.valueOf(goLinkedList.get(1)));
    }
}
