package com.anteoy.dataStructuresAndAlgorithm.other;

/**
 * @auther zhoudazhuang
 * @date 19-3-5 18:14
 * @description Dynamic programming
 */
public class DP {

    static int maxsequence3(int a[], int len)
    {
        int maxsum, maxhere;
        maxsum = maxhere = a[0];   //初始化最大和为a【0】
        for (int i=1; i<len; i++) {
            if (maxhere <= 0)
                maxhere = a[i];  //如果前面位置最大连续子序列和小于等于0，则以当前位置i结尾的最大连续子序列和为a[i]
            else
                maxhere += a[i]; //如果前面位置最大连续子序列和大于0，则以当前位置i结尾的最大连续子序列和为它们两者之和
            if (maxhere > maxsum) {
                maxsum = maxhere;  //更新最大连续子序列和
            }
        }
        return maxsum;
    }
  public static void main(String[] args) {
      int[] a = { -2, 11, -4, 13 };
      int b = maxsequence3(a,a.length);
    System.out.println(b);
  }
}
