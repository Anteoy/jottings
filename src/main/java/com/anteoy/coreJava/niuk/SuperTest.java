package com.anteoy.coreJava.niuk;

/**
 * Created by zhoudazhuang on 18-6-19.
 */
public class SuperTest{
    public static void main(String [] args){
        float f=42.0f;
        float f1[]=new float[2];
        float f2[]=new float[2];
        float f3=new Float(2);
        float f4=new Float(2);
        int i1 = new Integer(1);
        int i2 = new Integer(1);
        float[] f6=f1;
        long x=42;
        f1[0]=42.0f;
        System.out.println(f1 == f2);
        System.out.println(f3==f4);
        System.out.println(i1 == i2);
    }
}

