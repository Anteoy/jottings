package com.anteoy.scrawl;

/**
 * Created by zhoudazhuang on 19-2-17.
 */
class Base{

    Base(){
        g();
    }

    //IM 是否使用private
    public void g(){
        System.out.println(" BASE g()");
    }
}

public class MultiStatus extends Base{
   MultiStatus(){
       g();
   }

   public void g(){
       System.out.println("MultiStatus g()");
   }

    public static void main(String[] args) {
        Base b = new MultiStatus();
    }

}
