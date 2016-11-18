package com.anteoy.sample.ComparableComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

/**
 * Created by zhoudazhuang
 * Date: 16-11-18
 * Time: 上午10:10
 * Description :
 */
public class ComparatorTest {
    public static void main(String[] args) {

        ConsumInfoComparatorPOJO consumInfo1 = new ConsumInfoComparatorPOJO(100, "consumInfo1", 400.0,new Date());
        ConsumInfoComparatorPOJO consumInfo2 = new ConsumInfoComparatorPOJO(200, "consumInfo1", 200.0,new Date());
        ConsumInfoComparatorPOJO consumInfo3 = new ConsumInfoComparatorPOJO(300, "consumInfo1", 100.0,new Date());
        ConsumInfoComparatorPOJO consumInfo4 = new ConsumInfoComparatorPOJO(400, "consumInfo1", 700.0,new Date());
        ConsumInfoComparatorPOJO consumInfo5 = new ConsumInfoComparatorPOJO(500, "consumInfo1", 800.0,new Date());
        ConsumInfoComparatorPOJO consumInfo6 = new ConsumInfoComparatorPOJO(600, "consumInfo1", 300.0,new Date());
        ConsumInfoComparatorPOJO consumInfo7 = new ConsumInfoComparatorPOJO(700, "consumInfo1", 900.0,new Date());
        ConsumInfoComparatorPOJO consumInfo8 = new ConsumInfoComparatorPOJO(800, "consumInfo1", 400.0,new Date());

        List<ConsumInfoComparatorPOJO> list = new ArrayList<ConsumInfoComparatorPOJO>();
        list.add(consumInfo1);
        list.add(consumInfo2);
        list.add(consumInfo3);
        list.add(consumInfo4);
        list.add(consumInfo5);
        list.add(consumInfo6);
        list.add(consumInfo7);
        list.add(consumInfo8);

        System.out.println("排序前：");
        //排序前
        for(ConsumInfoComparatorPOJO consumInfo : list ){
            System.out.println(consumInfo);
        }
        ComparatorConsunInfo comparatorConsunInfo = new ComparatorConsunInfo();//比较器
        Collections.sort(list,comparatorConsunInfo);//排序
        System.out.println("排序后：");
        //排序后
        for(ConsumInfoComparatorPOJO consumInfo :list){
            System.out.println(consumInfo);
        }
    }
}
