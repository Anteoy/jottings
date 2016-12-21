package com.anteoy.coreJava.lemon;

/**
 * Created by zhoudazhuang
 * Date: 16-12-20
 * Time: 下午6:34
 * Description :
 */
public class OutTryFinally {
    public static void main(String[] args) {
        int a = 0;
        if(a == 0){
            throw new RuntimeException("sdfsf");
        }
        try{
            System.out.println("aaa");
        }catch (Exception e){

        }finally {
            System.out.println("cccc");
        }
    }
}
