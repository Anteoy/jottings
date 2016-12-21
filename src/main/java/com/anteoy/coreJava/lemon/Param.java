package com.anteoy.coreJava.lemon;

/**
 * Created by zhoudazhuang
 * Date: 16-12-21
 * Time: 下午6:07
 * Description :
 */
public class Param {

    public static void printParams(String... str){
        if(str.length == 0){
            System.out.println("aa");
        }
        else{
            for (String string : str) {
                System.out.println("bb("+string+")bb");
            }
        }
    }

    public static void main(String[] args) {
        printParams();
        printParams("a","b","c");
        printParams("a","b","c","d");
        printParams(new String[]{"A","B","C"});
    }
}
