package com.anteoy.coreJava.scrawl;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @auther zhoudazhuang
 * @date 19-3-6 10:45
 * @description
 */
public class BridgeTest {
  BridgeTest(){
    System.out.println("constructor BridgeTest");
  }
  Map map =
      new HashMap() {
        {
//          System.out.println(map);
//          map.put("a", 1);
//          map.put("b", 2);
          System.out.println("constructor BridgeTest$1");
          //编译后生成的匿名内部类 com.anteoy.coreJava.scrawl.BridgeTest$1
          System.out.println(this.getClass());
          //this继承了hashMap
          this.put("a", 1);
          this.put("b", 2);
        }
      };
      //guava
  Map<String, Map<String, String>> map1 = Maps.newHashMap();

  void test(){
    Map<String, String> map = ImmutableMap.of("ON","TRUE","OFF","FALSE");
    //K的数据类型必须与你想要创建的Set中元素的数据类型一致；而V必须是Boolean类型的，这是因为value字段用于标记该元素是否存在。
    Set<String> names = Collections.newSetFromMap(
            new ConcurrentHashMap<String, Boolean>()
    );
    names.add("ABC");
    names.add("A");
    names.add("B");
    names.add("ABC");
    System.out.println("names = " + names);
    Set<String> set = Collections.synchronizedSet(new HashSet<String>());
  }

  public static void main(String[] args) {
    new BridgeTest().test();
  }
}
