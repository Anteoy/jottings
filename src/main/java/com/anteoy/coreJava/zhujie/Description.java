package com.anteoy.coreJava.zhujie;


import java.lang.annotation.*;

/**
 * Created by root on 16-7-10.
 */
@Target({ElementType.METHOD,ElementType.TYPE})//目标
//@Retention(RetentionPolicy.CLASS.RUNTIME)//生命周期
@Inherited//允许继承
@Documented//导出生成doc
public @interface Description {
    enum  value{a,b};
}
