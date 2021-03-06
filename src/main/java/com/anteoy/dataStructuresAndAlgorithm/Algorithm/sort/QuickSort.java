package com.anteoy.dataStructuresAndAlgorithm.Algorithm.sort;

/**
 * 快速排序的实现
 *
 * @author zhoudazhuang
 */
public class QuickSort {

    public void quickSort(int[] a, int low, int high) {
        int i = low;
        int j = high;
        int key = a[low];

        //分治递归结束判断
        if (i == j) {
            return;
        }

        while (true) {
            while (i < j) {
                if (a[j] < key) {
                    int temp = a[j];
                    a[j] = a[i];//注意不是和key互换，而是和a[i]a[j]比较互换
                    a[i] = temp;
                    break;//重要，当交换完为止后结束本次while循环
                } else {
                    j--;
                }
            }

            while (i < j) {
                if (a[i] > key) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                    break;//重要，当交换完为止结束本次while循环
                } else {
                    i++;
                }
            }
            if (i == j) {
                break;//此时跳出while（true）循环
            }
        }
        //递归分治
        quickSort(a, low, i - 1);
        quickSort(a, i + 1, high);
    }

    public static void main(String[] args) {
        int a[] = {49, 38, 65, 97, 76, 13, 27};
        QuickSort qs = new QuickSort();
        qs.quickSort(a, 0, a.length - 1);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
