package com.anteoy.coreJava.concurrent.lock.MySingleton;

/**
 * @auther zhoudazhuang
 * @date 19-2-28 17:19
 * @description
 */
public class Scrwal {
    public int[] array;

    static void test() throws ArithmeticException {

    }

  public static void main(String[] args) throws Exception{
int a = 12;
double b = Math.ceil(a);
double c = 12.0;
double d = Math.ceil(c);
System.out.println(b);
System.out.println(c);

    System.out.println(Integer.toBinaryString(~(-128) + 1));
    System.out.println(Integer.toBinaryString(128));
      char ct = '擦';
      String st = "但是";
    System.out.println();

      test();
//      File file = new File("/home/zhoudazhuang/IdeaProjects/jottings/src/main/java/com/anteoy/coreJava/concurrent/lock/MySingleton/Scrwal.java");
    System.out.println(System.getProperty("file.encoding"));

      /* 测试String类型默认的编码方式
*/

// 使用String的有参构造方法
      String str = new String("hhhh ty智障%shfu摸淑芬十分uif内服NSF黑");
// 1.以GBK编码方式获取str的字节数组，再用String有参构造函数构造字符串
      System.out.println(new String(str.getBytes("GBK")));
// 2.以UTF-8编码方式获取str的字节数组，再以默认编码构造字符串
      System.out.println(new String(str.getBytes("UTF-8")));
      System.out.println(new String(str.getBytes()));
      String s = "你好哦!";
      System.out.println( new String(s.getBytes(),"UTF-8"));
    System.out.println(2^1);
    System.out.println(123^123);
  }
}
