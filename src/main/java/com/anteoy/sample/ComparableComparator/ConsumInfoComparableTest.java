package com.anteoy.sample.ComparableComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

/**
 * Created by zhoudazhuang
 * Date: 16-11-18
 * Time: 上午10:05
 * Description :
 */
public class ConsumInfoComparableTest {
    public static void main(String[] args) {

        ConsumInfoComparablePOJO consumInfo1 = new ConsumInfoComparablePOJO(100, "consumInfo1", 400.0, new Date());
        ConsumInfoComparablePOJO consumInfo2 = new ConsumInfoComparablePOJO(200, "consumInfo1", 200.0, new Date());
        ConsumInfoComparablePOJO consumInfo3 = new ConsumInfoComparablePOJO(300, "consumInfo1", 100.0, new Date());
        ConsumInfoComparablePOJO consumInfo4 = new ConsumInfoComparablePOJO(400, "consumInfo1", 700.0, new Date());
        ConsumInfoComparablePOJO consumInfo5 = new ConsumInfoComparablePOJO(500, "consumInfo1", 800.0, new Date());
        ConsumInfoComparablePOJO consumInfo6 = new ConsumInfoComparablePOJO(600, "consumInfo1", 300.0, new Date());
        ConsumInfoComparablePOJO consumInfo7 = new ConsumInfoComparablePOJO(700, "consumInfo1", 900.0, new Date());
        ConsumInfoComparablePOJO consumInfo8 = new ConsumInfoComparablePOJO(800, "consumInfo1", 400.0, new Date());

        List<ConsumInfoComparablePOJO> list = new ArrayList<ConsumInfoComparablePOJO>();
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
        for (ConsumInfoComparablePOJO consumInfo : list) {
            System.out.println(consumInfo);
        }

        Collections.sort(list);//排序
        System.out.println("排序后：");
        //排序后
        for (ConsumInfoComparablePOJO consumInfo : list) {
            System.out.println(consumInfo);
        }
    }
}
