package com.anteoy.sample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;

import java.lang.reflect.Constructor;

/**
 * Created by zhoudazhuang
 * Date: 16-11-7
 * Time: 下午5:53
 * Description :bean1中的属性值被复工制到了bean2
 * spring中的BeanUtils类为Java中的JavaBean类提供了一此常用的静态方法.通过这些方法可以方便地使用在Web应用程序中.如在对象与对象之间属性的复制工作
 */
public class BeanUtilsDemo {
    private String firstName;
    private String lastName;
    protected static Logger log = LoggerFactory.getLogger(BeanUtilsDemo.class);

    public BeanUtilsDemo() {
    }

    public BeanUtilsDemo(String firstName, String lastName) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public static void main(String args[]) {
        BeanUtilsDemo bean1 = new BeanUtilsDemo("谷", "键");
        BeanUtilsDemo bean2 = new BeanUtilsDemo("陈", "澣");
        log.info(bean1.toString());
        log.info(bean2.toString());
        BeanUtils.copyProperties(bean1, bean2);
        log.info(bean1.toString());
        log.info(bean2.toString());

        //下面几行为通过instantiateClass方法的构造器来创建对象
        Constructor cons;

        Class className = null;
        try {
            className = Class.forName("com.anteoy.sample.BeanUtilsDemo");
            cons = className.getConstructor(String.class, String.class);
            BeanUtilsDemo bean3 = (BeanUtilsDemo) BeanUtils.instantiateClass(cons, new Object[]{"张", "黄莺"});
            log.info(String.valueOf(bean3));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String toString() {
        return "[" + getFirstName() + "," + getLastName() + "]";
    }
}
