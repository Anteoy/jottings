package com.anteoy.sample;

/**
 * Created by zhoudazhuang
 * Date: 16-11-8
 * Time: 下午4:55
 * Description :
 */
public class TestInstance {
    public static void main(String[] args) {
  /*
   * false false
   */
  /*
   * he method returns true if the specified Object argument is non-null
   * and can be cast to the reference type represented by this Class
   * object without raising a ClassCastException. It returns false
   * otherwise.
   */
            String str = null;
            System.out.println(str instanceof String);
            System.out.print(String.class.isInstance(str));
            // Error:Incompatible conditional operand types TestInstance and String
  /* System.out.println(new TestInstance() instanceof String); */
            // Compatible
            System.out.println(new Exception() instanceof RuntimeException);
            System.out.println(new RuntimeException() instanceof Exception);
            System.out.println(String.class.isInstance(new TestInstance()));
            System.out.println(RuntimeException.class.isInstance(new Exception()));
            System.out.println(Exception.class.isInstance(new RuntimeException()));
            System.out.println();

            //总结：
/*  当实例为null时，都返回false，防止进行转换；
  当instanceof，会比较彼此兼容性，且不分左右顺序；*/
        }

}
