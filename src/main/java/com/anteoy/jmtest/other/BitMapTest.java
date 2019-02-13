package com.anteoy.jmtest.other;

import java.util.BitSet;

/**
 * @auther zhoudazhuang
 * @date 19-2-13 16:28
 * @description 一个序列里除了一个元素，其他元素都会重复2次或者3次，设计一个时间复杂度与空间复杂度最低的算法，找出不重复的元素。
 * 注意我们这里的解决方案用2个bit来表示这个数和其出现的次数 只有00 10 01 11这四种情况 故只能统计出现了0次，1次，2次，3次的情况
 */
public class BitMapTest {
    public static void main(String[] args) {
        int[] list = {1,2,2,4,4,4,4};
        int len = list.length * 2;
        BitSet bs = new BitSet(len);

        for (int i = 0; i < list.length; i++) {
            // 把原始数据扩大两倍进行处理 后面再缩放回来 目地是用2个bit来表达这个数的出现次数和这个数本身
            // 如果不乘以2 则若是这种1,2这种数字进来 就会把第二个位置被2占了 不能用2个bit表达来实现了，乘2之后就是2,4 留出了n+1的位置
            int n = 2 * list[i];
            boolean b1 = bs.get(n);
            boolean b2 = bs.get(n + 1);
            if (!b1 && !b2) { //还不存在的时候进行设值
                bs.set(n, true);
                bs.set(n + 1, false);
            }
            else if (b1 && !b2) { //已经存在了一个了 把位置n设为0即false 下一个位置n+1设置为true
                bs.set(n + 1, true);
                bs.set(n, false);
            }
            else if (!b1 && b2) { //检测到第一个位置为false 但第二个位置为true 说明是上面改变的重复2次的处理方式 这里把n和n+1的位置都置为true 也就是11 表示检测到第三个重复的数了
                bs.set(n, n + 1, true);
            }else if (b1 && b2){
                //已经存在3个重复数的情况会进入此逻辑 但这里已经是 00表示没有这个数 10表示这个数的次数为1 01表示这个数的次数为2次 11表示这个数的次数为3次
                //所以这种2个bit的表达方式不能判断3次以及以上的了
            }
        }
        for (int i = 0; i < bs.length(); i += 2) {
            //2个bit表达的是一个数的出现情况 这个数是*2的结果 需要除以2进行还原
            boolean b1 = bs.get(i);
            boolean b2 = bs.get(i + 1);
            if (!b1 && !b2) { // 存储都是00 两个false
                // 0次
            }
            else if (b1 && !b2) { // 存储为10 位置i能获取到为true 相邻第二个位置为false
                System.out.println(i / 2 + "一次");
            }
            else if (!b1 && b2) { // 存储为01 位置i不能获取到为false 相邻i+1能获取到为true
                System.out.println(i / 2 + "两次");
            }
            else if (b1 && b2) { // 存储为11 两个位置都是true 注意四次以上是无法进行统计的
                System.out.println(i / 2 + "三次");
            }
        }
    }
}
