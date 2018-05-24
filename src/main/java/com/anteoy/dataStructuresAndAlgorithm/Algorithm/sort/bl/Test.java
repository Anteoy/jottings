package com.anteoy.dataStructuresAndAlgorithm.Algorithm.sort.bl;

/**
 * Created by zhoudazhuang
 * Date: 17-3-29
 * Time: 上午10:40
 * Description : 求最大子序列和
 */
public class Test {

    //穷举遍历法 三个for循环时间复杂度为n*n*n 十分低效
    public static int maxSubSum1(int[] array) {
        int maxSubSum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                int curSum = 0;
                // 这是非常人思维的穷举 包含很多相同子序列的加法
                for (int k = i; k <= j; k++) {
                    curSum += array[k];
                    if (curSum > maxSubSum) {
                        maxSubSum = curSum;
                    }
                }
            }
        }
        return maxSubSum;
    }

    public static int maxSubSum2(int[] array) {
        int maxSubSum = 0;
        for (int i = 0; i < array.length; i++) {
            //tmp 变量在上面for循环每次必须重新初始化
            int tmpSum = 0;
            //常规思维方法 不会有重复的子序列
            for (int j = i; j < array.length; j++) {
                //maxSubSum1中k到j是前面加到后面求和，而这里是以i为指针基点，往后求和
                tmpSum += array[j];
                if (tmpSum > maxSubSum) {
                    maxSubSum = tmpSum;
                }
            }
        }
        return maxSubSum;
    }

    /**
     * 递归分治算法(nlog2n)
     * @param array
     * @return
     */
    //test      (13/2  (6/2   ( 3/2   ( 1/2  (  0  ) syso 1 ) syso 1  )  syso 0 ) ) syso 1
    //maxSubSum3  (array,0,4 (array,0,2 (array,0,1 (array,0,0[return]反过来执行后续代码，递归的递归[maxSubSum3(array,center+1,right)]这个))))
    public static int maxSubSum3(int[] array,int left,int right) {
        //此时左边界和右边界相等，该数组只有一个数，判断是否为负数，直接返回
        if (left == right){
            return array[left] > 0 ? array[left] : 0;
        }
        //二分
        //二进制右移位一次，为除法的除以2，但是效率比较高
        int center = (left+right)>>1;
        //递归左部分
        int maxSubLeftSum = maxSubSum3(array,left,center);
        //递归右部分
        int maxSubRightSum = maxSubSum3(array,center+1,right);
        //临近中间的左部分最大子序列和 curLeftBorderTmpSum 边界临时值
        int maxLeftBorderSum = 0, curLeftBorderTmpSum = 0;
        //左中部分 从center开始向左求和（必须包含array[center]） 找出最大值
        for(int i = center;i >= left; i--){
            curLeftBorderTmpSum += array[i] ;
            if(curLeftBorderTmpSum > maxLeftBorderSum)
                maxLeftBorderSum = curLeftBorderTmpSum;
        }
        //临近中间的右部分最大子序列 curRightBorderTmSum 边界临时值
        int maxRightBorderSum = 0, curRightBorderTmSum = 0;
        //右中部分 从center开始向右求和（必须包含array[center]） 找出最大值
        for(int i = center+1; i <= right;i++){
            curRightBorderTmSum += array[i];
            if(curRightBorderTmSum > maxRightBorderSum)
                maxRightBorderSum = curRightBorderTmSum;
        }
        //返回最大子序列和
        int temp = Math.max(maxSubLeftSum, maxSubRightSum);
        return Math.max(temp, maxRightBorderSum+maxLeftBorderSum);
    }

    /**
     * 最优算法，O（n）
     * @param array
     * @return
     */
    public static int maxSubSum4(int[] array){
        int maxSubSum = 0, curTmpSum = 0;
        for (int i = 0; i < array.length; i++){
            curTmpSum += array[i];
            if(curTmpSum > maxSubSum){
                maxSubSum = curTmpSum;
            //注：要求如果所有值都为负，则最大子序列和为0
            }else if(curTmpSum < 0){
                curTmpSum = 0;
            }
        }
        return maxSubSum;
    }

    public static void main(String[] args) {
        //计算耗时，需要提供一个较大的数组，否则看不出差距 或者使用 System.nanoTime()毫微秒
        int[] array = {-2,4,-1,5,6,7};
        Long time1 = System.nanoTime();
        int maxSubSum1 = maxSubSum1(array);
        System.out.println("maxSubSum1计算结果： " + maxSubSum1 + "\n" + "耗时" + (System.nanoTime() - time1));
        Long time2 = System.nanoTime();
        int maxSubSum2 = maxSubSum2(array);
        System.out.println("maxSubSum2计算结果： " + maxSubSum2 + "\n" + "耗时" + (System.nanoTime() - time2));
        Long time3 = System.nanoTime();
        int maxSubSum3 = maxSubSum3(array,0,array.length -1);
        System.out.println("maxSubSum3计算结果： " + maxSubSum3 + "\n" + "耗时" + (System.nanoTime() - time3));

    }
}
