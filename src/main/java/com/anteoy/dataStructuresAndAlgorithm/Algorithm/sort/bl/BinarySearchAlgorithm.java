package com.anteoy.dataStructuresAndAlgorithm.Algorithm.sort.bl;

/**
 * Created by zhoudazhuang
 * Date: 17-3-29
 * Time: 下午2:43
 * Description : 折半查找算法
 */
public class BinarySearchAlgorithm {

    /**
     * 求x在数组T[]中的坐标，如果不存在x，则返回-1
     * 此方法使用折半查找 时间复杂度为O（logn）
     *
     * @param a
     * @param x
     * @param <T>
     * @return
     */
    public static <T extends Comparable<? super T>> int binarySearch2(T[] a, T x) {

        int low = 0, high = a.length - 1;
        while (low <= high) {

            //折半
            int mid = (low + high) / 2;
            //a[mid]更小 查右半部分
            if (a[mid].compareTo(x) < 0) {
                low = mid + 1;
            } else
                //a[mid]更大 查左边部分
                if (a[mid].compareTo(x) > 0) {
                    high = mid - 1;
                } else {//a[mid] == x
                    return mid;
                }
        }
        return -1;
    }

    public static <T extends Comparable<? super T>> int binarySearch1(T[] a, T x) {

        for (int i = 0; i < a.length; i++) {
            if (a[i].compareTo(x) == 0) {//如果相等则直接返回
                return i;
            }
        }
        for (T ason : a) {

        }
        return -1;
    }

    public static void main(String[] args) {
        Integer[] array = {1, 6, 7, 8, 9, 12};
        Integer x = 7;
        System.out.println(binarySearch1(array, x));
        System.out.println(binarySearch2(array, x));
        System.out.println(gcd(100, 35));
    }

    //欧几里得求最大公约数
    public static long gcd(long m, long n) {
        while (n != 0) {
            long rem = m % n;
            //m用n的值代替
            m = n;
            //n的值为每次的余数
            n = rem;
        }
        return m;
    }
}