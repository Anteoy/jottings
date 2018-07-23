package com.anteoy.dataStructuresAndAlgorithm.javav2.my.algorithmsort;

/**
 * Created by zhoudazhuang on 17-3-6.
 * Description:插入排序
 */
public class insertionSort {

    public static <T extends Comparable<? super T>> void insertionSort(T[] t) {
        int j;//内循环 j需要和待插入的数对比的数 从右往左比 交换位置

        //第一层循环  i需要插入的数
        for (int i = 1; i < t.length; i++) {
            T tmp = t[i];
            //这里容易忽略j>0;否则j--数组越界
            for (j = i; j > 0 && t[j].compareTo(t[j - 1]) < 0; j--) {
                t[j] = t[j - 1];
            }
            t[j] = tmp;
        }

        //测试打印
        for (T tt : t
                ) {
            System.out.println(tt);
        }
    }

    public static void main(String[] args) {
        Integer[] integers = {2, 1, 5, 3, 7};
        insertionSort(integers);
    }
}
