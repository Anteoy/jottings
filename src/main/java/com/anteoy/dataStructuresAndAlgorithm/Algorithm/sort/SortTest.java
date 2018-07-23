package com.anteoy.dataStructuresAndAlgorithm.Algorithm.sort;

/**
 * 排序原理实现及测试
 *
 * @author Anteoy
 */
public class SortTest {
    static int[] arr = {3, 7, 8, 2, 1, 9, 5};

    static SimpleInsertSort sis = new SimpleInsertSort();
    static NumberSort ns = new NumberSort();

    public static void main(String[] args) {
        //sis.insertSort(arr);//static静态方法，为何不能使用方法名进行调用？TODO
        //	sis.simpleInsertSort(arr);
        //	ns.insertSort(arr);
        //	ns.bubbleSort(arr);
        //	BubbleSort.bubbleSort(arr);
        //	NumberSort.bubbleSort(arr);
        NumberSort.quickSort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
