package com.anteoy.coreJava.nk;

/**
 * Created by zhoudazhuang on 17-11-22.
 */
public class ByteRef {
    public static void main(String[] args) {
        ByteRef byteRef = new ByteRef();
        byteRef.start();
    }
    void start(){
        Two two = new Two();
        System.out.println(two.x +"");
        Two t2 = fix(two);
        System.out.println(two.x +" "+t2.x);
    }
    Two fix(Two tt){
        tt.x=42;
        return tt;
    }
}

class Two{
//    Byte x;
    byte x;
}


