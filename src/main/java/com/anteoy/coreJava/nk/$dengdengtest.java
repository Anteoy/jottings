package com.anteoy.coreJava.nk;

/**
 * Created by zhoudazhuang on 17-12-1.
 */
public class $dengdengtest {

    public static void main(String[] args) {
        Integer i1 = 59;
        int i2 = 59;
        //极端情况，在Java中，自动装箱情况下,会对-128到127的Integer对象进行缓存，当创建新的Integer对象时，如果符合这个这个范围，并且已有存在的相同值的对象，则返回这个对象
        Integer i3= Integer.valueOf(59);//自动装箱
        Integer i4 = new Integer(59);//不会自动装箱,不涉及缓存
        System.out.println(i1 == i2);//true
        System.out.println(i1==i3);//true
        System.out.println(i3==i4);//false
        System.out.println(i2 == i4);//true 自动拆箱 or 自动拆箱

        System.out.println("====");

        Integer j1 = 159;
        int j2 = 159;
        //极端情况，在Java中，自动装箱情况下,会对-128到127的Integer对象进行缓存，当创建新的Integer对象时，如果符合这个这个范围，并且已有存在的相同值的对象，则返回这个对象
        Integer j3= Integer.valueOf(159);//自动装箱
        Integer j4 = new Integer(159);//不会自动装箱,不涉及缓存
        System.out.println(j1 == j2);//true
        System.out.println(j1==j3);//false
        System.out.println(j3==j4);//false
        System.out.println(j2 == j4);//true
    }
}
