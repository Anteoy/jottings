package com.anteoy.dataStructuresAndAlgorithm.dahaiguai.zhoudazhuang;

import java.util.Random;

/**
 * Created by zhoudazhuang
 * Date: 17-4-1
 * Time: 下午6:09
 * Description : java版 洗牌算法
 */
public class Xipai {

    public static void shuffle(int[] nums) {
        Random rnd = new Random();
        for (int i = nums.length - 1; i > 0; i--) {
            int j = rnd.nextInt(i + 1);
            //swap index i, j
            int t = nums[i];
            nums[i] = nums[j];
            nums[j] = t;
        }
    }

    public static void main(String[] args) {
        int[] ints = new int[64];
        for (int i = 0;i<64;i++){
            ints[i] = i;
        }
        shuffle(ints);
        for (int test: ints){
            System.out.println(test);
        }

        int a = 3;
        System.out.println("test: "+ a);
    }
}
