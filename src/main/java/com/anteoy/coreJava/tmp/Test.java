package com.anteoy.coreJava.tmp;

/**
 * @auther zhoudazhuang
 * @date 19-4-16 16:13
 * @description
 */
public class Test {
  public static void main(String[] args) {
    int[] arr = {1,2,2,3};
    System.out.println(findOne(arr));
      int[] arr2 = {1,3,6,10,20,11,13,16};
      //前5个数有序 以及后面也是有序的前提下对数组进行sort merge
      sort(arr2,5);
      for(int i: arr2){
      System.out.printf(i+" ");
      }
  }


  public static int findOne(int[] arr){
      int n = arr.length;
      int i;
      int result = 0;
      for(i=0;i<n;i++){
          result ^= arr[i];
      }

      for(i=1;i<n;i++){
          result ^= i;
      }
      return result;
  }

  // 第二部分 类插入排序
  public static void merge(int[] arr, int mid){
      int len = arr.length;
      int tmp;
      for (int i=mid;i<len-1;i++) {
          if (arr[i+1] < arr[i]) {
              tmp = arr[i+1];
              arr[i+1] = arr[i];
              arr[i] = tmp;
          }
      }

  }

  public static void sort(int[] arr, int mid){
      int tmp;
      for (int i = 0; i < mid;i++) {
            if (arr[mid] < arr[i]) {
                tmp = arr[mid];
                arr[mid] = arr[i];
                arr[i] = tmp;
            }
            merge(arr,mid);
      }
  }


}
