package com.anteoy.coreJava.polymorphism;

/**
 * Created by zhoudazhuang
 * Date: 17-1-9
 * Time: 下午9:07
 * Description :java识别是否为重复冲突函数，依靠的是函数名和参数(...参数顺序不同也是允许的，因为相当于类型改变了)，与返回值无关，如yy(int a)
 */
public class Polymorphism {
    //注释代码编译不通过,即使参数都为空 不允许仅仅只有返回值不同的同名函数
    /*String yy(int a){

    }
    int yy(int a){
        return 1;
    }*/
    String yy(int a,String b){
        return null;
    }
    String yy(String b,int a){
        return null;
    }
    int yy(int b,int c){
        return 1;
    }
    int yy (int a,boolean b){
        return 1;
    }
}
