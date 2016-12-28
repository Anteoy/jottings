package com.anteoy.coreJava.others.staticStander;

/**
 * Created by zhoudazhuang
 * Date: 16-12-28
 * Time: 下午4:48
 * Description : http://blog.csdn.net/u013453970/article/details/47416825
 */
public class TestSportsMan {
    public static void main(String[] args) {
        SportsMan sp1 = new SportsMan("刘翔",18);
        SportsMan sp2 = new SportsMan("姚明",20);
        System.out.println(sp1);//SportsMan [name=刘翔, age=18, nation=null]
        System.out.println(sp2);//SportsMan [name=姚明, age=20, nation=null]

        /**
         * SportsMan类中的nation属性是static修饰的，由这个类创建的对象都共用这个属性。
         *
         * 类变量的加载早于对象，所以既可以用“sp1.nation”，也可以用“SportsMan.nation”调。
         *
         * 当其中一个对象对此类变量进行修改，会影响其他对象的类变量的一个调用。
         */
        System.out.println("SportsMan.nation="+SportsMan.nation);//SportsMan.nation=null
        sp1.nation = "China";
        System.out.println("SportsMan.nation="+SportsMan.nation);//SportsMan.nation=China
        SportsMan.nation = "PRC";
        System.out.println("SportsMan.nation="+SportsMan.nation);//SportsMan.nation=PRC

        System.out.println(sp1);//SportsMan [name=刘翔, age=18, nation=PRC]
        System.out.println(sp2);//SportsMan [name=姚明, age=20, nation=PRC]
    }
}

class SportsMan {
    String name;
    int age;
    static String nation;

    public SportsMan(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "SportsMan [name=" + name + ", age=" + age + ", nation=" + nation + "]";
    }
}
