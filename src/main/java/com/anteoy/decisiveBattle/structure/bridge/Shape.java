package com.anteoy.decisiveBattle.structure.bridge;

/**
 * Created by zhoudazhuang on 17-12-10.
 * 原本使用抽象类，尝试使用接口实现 ,drawApi 这里是public static final 变量 ，但后续需要赋值，所以使用接口不能
 * 补充：推荐做法 1. 把main中的赋值 改到这里用构造函数传入
 * 2. 这里的draw可以留到子类去实现，桥接模式的作用就是把这个类的抽象和实现进行分离了，抽象就是shape的形状，实现就是具体的draw,抽象shape依赖于实现draw
 */
public abstract class Shape {
     public DrawAPI drawApi = null;
     abstract void Shape();
     String draw(){
         drawApi.drawCircle();
         return "getted draw";
     };
}
