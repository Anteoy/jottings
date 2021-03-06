package com.anteoy.dataStructuresAndAlgorithm.dahaiguai.zhangweiquan;

/**
 * Created by zhangweiquan
 * Generated by zhoudazhuang
 * Date: 17-4-1
 * Time: 上午10:06
 * Description : 单链表工具类
 */
public class ListUtils {

    //传入一个int数组 返回一个单链表起始root
    public static List getList(int[] arr) {
        if (arr == null || arr.length == 0) {
            return null;
        }
        List<Integer> root = new List<>(arr[0]);
        List<Integer> temp = root;
        for (int i = 1; i < arr.length; i++) {
            temp.setNext(new List<>(arr[i]));
            temp = temp.getNext();//此时temp为下一个node节点
        }
        return root;

    }
}

