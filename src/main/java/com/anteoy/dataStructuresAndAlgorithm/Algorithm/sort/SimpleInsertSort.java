package com.anteoy.dataStructuresAndAlgorithm.Algorithm.sort;

/**
 * @author 周巖
 * @date 2016/4/6.
 * 简单插入排序
 */
public class SimpleInsertSort {

    /*
    Code highlighting produced by Actipro CodeHighlighter (freeware)http://www.CodeHighlighter.com/-->/**
     * 插入排序<br/>
     * <ul>
     * <li>从第一个元素开始，该元素可以认为已经被排序</li>
     * <li>取出下一个元素，在已经排序的元素序列中从后向前扫描</li>
     * <li>如果该元素（已排序）大于新元素，将该元素移到下一位置</li>
     * <li>重复步骤3，直到找到已排序的元素小于或者等于新元素的位置</li>
     * <li>将新元素插入到该位置中</li>
     * <li>重复步骤2</li>
     * </ul>
     *
     * @param numbers
     */
    public static void insertSort(int[] numbers) {
        int size = numbers.length, temp, j;
        for (int i = 1; i < size; i++) {
            temp = numbers[i];
            for (j = i; j > 0 && temp < numbers[j - 1]; j--)
                numbers[j] = numbers[j - 1];
            numbers[j] = temp;
            for (int k = 0; k < numbers.length; k++) {
                System.out.print(numbers[k] + " ");
            }
            System.out.print("\n");
        }
    }

    public static void insertionSort(int[] a) {
        int j;
        for (int p = 0; p < a.length; p++) {
            Integer temp = a[p];//记录下P上的值存为临时变量
            for (j = p; j > 0 && temp.compareTo(a[j - 1]) < 0 && j < 5; j++) {//和p前面一个作对比，如如果p更小，则交换位置
                a[j] = a[j - 1];//交换位置
            }
            a[j] = temp;//交换位置
            for (int i = 0; i < a.length; i++) {
                System.out.print(a[i] + " ");
            }
            System.out.println("\n");
        }
    }

    public static <aa extends Comparable<? super aa>> void insertionSort(aa[] a) {
        int j;
        for (int p = 0; p < a.length; p++) {
            aa temp = a[p];//记录下P上的值存为临时变量
            for (j = p; j > 0 && temp.compareTo(a[j - 1]) < 0; j++) {//和p前面一个作对比，如如果p更小，则交换位置
                a[j] = a[j - 1];//交换位置
            }
            a[j] = temp;//交换位置
        }
    }

    void shellsort2(int a[], int n)//shell 希尔排序
    {
        int j, gap;

        for (gap = n / 2; gap > 0; gap /= 2)//每次grap 对半分 各自进行排序
            for (j = gap; j < n; j++)//从数组第gap个元素开始
                if (a[j] < a[j - gap])//每个元素与自己组内的数据进行直接插入排序
                {
                    int temp = a[j];//记录下j上的值存为临时变量
                    int k = j - gap;
                    while (k >= 0 && a[k] > temp) {
                        a[k + gap] = a[k];
                        k -= gap;
                    }
                    a[k + gap] = temp;
                }
    }

    public void shellSort(int[] list) {
        int gap = list.length / 2;

        while (1 <= gap) {
            // 把距离为 gap 的元素编为一个组，扫描所有组
            for (int i = gap; i < list.length; i++) {
                int j = 0;
                int temp = list[i];

                // 对距离为 gap 的元素组进行排序
                for (j = i - gap; j >= 0 && temp < list[j]; j = j - gap) {
                    list[j + gap] = list[j];
                }
                list[j + gap] = temp;
            }

            gap = gap / 2; // 减小增量
        }
    }

    /*
     * 简单插入排序
     */
    protected static void simpleInsertSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            for (int j = i; j > 0; j--) {
                if (temp < arr[j - 1]) {
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);

        }
    }
}
