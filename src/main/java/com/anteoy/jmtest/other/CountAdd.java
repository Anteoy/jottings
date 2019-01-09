//无包可直接使用javac java ,当我们的java源文件有包结构的时候，再使用javac命令编译，就需要一些参数。
//当类有了包名后，类的名字就是包名+类名了，这才是它的真实名称。 添加-d 自动生成带包的编译后目录结构
// javac -d . CountAdd.java
// java com.anteoy.jmtest.other.CountAdd
//-classpath参数，这个参数是告诉java虚拟机，到classpath指定目录下面找class字节码文件，也可以指定多个目录，用“；”分号隔开即可。
// -classpath 官方说明为 The default value of the class path is "." meaning that only the current directory is searched
//$ echo $CLASSPATH
//.:/usr/java/jdk/jdk1.8.0_101/lib:/usr/java/jdk/jdk1.8.0_101/jre/lib:

// javac -d /home/zhoudazhuang CountAdd.java
// java -classpath "/home/zhoudazhuang" com.anteoy.jmtest.other.CountAdd
//javap -v CountAdd 查看反编译后的二进制字节码 idea反编译过来供查看的看起来更简洁一些 但是不够详细
package com.anteoy.jmtest.other;

/**
 * @auther zhoudazhuang
 * @date 19-1-9 10:36
 * @description
 */
public class CountAdd {

  public static void main(String[] args) {
        t1();
        t2();
        t3();
  }

  static void t1(){
      int count=0;
      for(int i=0;i<=100;i++){
          count=count++;
      }
      System.out.println(count+"<--");
  }

    static void t4(){
        int count=0;
        for(int i=0;i<=100;i++){
            count=++count;
        }
        System.out.println(count+"<--");
    }

  static void t2(){
      int count=0;
      for(int i=0;i<=100;i++){
          count++;
      }
      System.out.println(count+"<--");
  }

    static void t3(){
        int count=0;
        for(int i=0;i<=100;i++){
            ++count;
        }
        System.out.println(count+"<--");
    }
}
