package com.anteoy.dataStructuresAndAlgorithm.Algorithm.sort;

/**
 * 希尔排序
 *
 * @author zhoudafu
 */
public class ShellSort {

    public void shellSort(int[] a) {

        int n = a.length;//数据个数
        //循环遍历得到每一次需要进行插入排序的数组
        for (int space = n / 2; space > 0; space = space / 2) {//space为缩小增量
            for (int j = 0; j < space; j++) {
                //调用核心分治进行每个数组的独立插入排序
                insertSort(a, j, space);
            }
        }

    }

    /**
     * 核心算法，每个分好组的数组进行独立的插入排序
     *
     * @param a     整个数组
     * @param index 分割出来的独立数组开始坐标
     * @param space 分割出来的独立数组间距（增量）
     */
    public void insertSort(int[] a, int index, int space) {
        for (int i = index + space; i < a.length; i += space) {//注意外层循环i=index+space 增量为i+=space
            int key = a[i];//插入排序比较标量
            for (int j = i; j >= index; j -= space) {//注意j> =index
                if (key < a[j]) {
                    a[j + space] = a[j];
                    a[j] = key;
                }
            }
        }
    }

    public static void main(String[] args) {
        int a[] = {8, 5, 6, 2, 1, 3, 9, 4, 7, 0};
        ShellSort ss = new ShellSort();
        ss.shellSort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
