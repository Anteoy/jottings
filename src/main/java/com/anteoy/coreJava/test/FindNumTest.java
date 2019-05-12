package com.anteoy.coreJava.test;

/**
 * Created by zhoudazhuang on 19-4-10.
 * 无穷大时间复杂度为arr.length，因为其他for循环为固定32次为常数时间，额外空间复杂度也为常数32个int=32*4=128byte
 * 如果arr这个数组非常庞大，单台机器的内存已经放不下
 * 可以考虑使用bitmap来进行存放 1个byte=8bit可以表示最大2^8=256 1M=1024*1024*8个bit 可以表示最大数为2^(1024*1024*8)
 * 用bitmap可以节省大量的存储空间 具体大小需要看实际数最大值是多少
 */
public class FindNumTest {

    public static int findNumber(int[] arr) {
        //定义一个32位数组
        int bits[] = new int[32];
        //初始化  数组中所有值为0
        for (int i = 0; i < bits.length; i++) {
            bits[i]=0;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < bits.length; j++) {
                //记录这个位上是否为1，为1的话 bits数组就加1
                bits[j] += ((arr[i] >> j) & 1);
            }
        }
        int result = 0;
        for (int j = 0; j < 32; j++)
            //对3取余，出现3次的数相加除以3肯定为0
            if (bits[j] % 3 != 0){
                //把记录的二进制转化为十进制数
                result += (1 << j);
            }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {8,2,2,2,5,5,5,9,9,9,4,4,4};
        System.out.println("数组中只出现1次的数为:"+findNumber(arr));
    }
}
