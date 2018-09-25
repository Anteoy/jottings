package com.anteoy.jmtest.time;

import com.alibaba.fastjson.JSON;

import java.util.*;

/**
 * @auther zhoudazhuang
 * @date 18-8-6 15:33
 * @description
 */
public class Test {
    public static int hourOfData(long timestamp) {
        Calendar c = Calendar.getInstance();
    c.setTime(new Date(timestamp * 1000));
        return c.get(Calendar.HOUR_OF_DAY);
    }

    public static int trans2weekDay(long timestamp) {
        Calendar   calendar   =   new GregorianCalendar();
    System.out.println(calendar.getFirstDayOfWeek() == Calendar.SUNDAY);
    calendar.setTime(new Date(timestamp * 1000));
        int w = calendar.get(Calendar.DAY_OF_WEEK);
        if (w == 1) {
            w = 6;
        }else {
            w -= 2;
        }
        return w;
    }

  public static void main(String[] args) {
    System.out.println(new Date().getTime() / 1000);
    System.out.println(trans2weekDay(new Date().getTime() / 1000));
    System.out.println(hourOfData(1534863600));
    System.out.println(new Date().getTime());
    System.out.println(hourOfData(new Date().getTime()));
    System.out.println(trans2weekDay(new Date().getTime()));
    System.out.println(1529745453*1000);
      long timestamp = 1529745453l * 1000;
    System.out.println(timestamp);
      System.out.println(hourOfData(1529745453l*1000));
      System.out.println(trans2weekDay(1529745453l*1000));

    Map<String, String> map = new HashMap<>();
    map.put("ad", "ds");
    System.out.println(map.toString());
    System.out.println(JSON.toJSONString(map));

    System.out.println("=====================");
    String a = "192.168.1.1";
    String[] as = a.split(":");
    System.out.println(as.length);
    System.out.println(as[0]);
  }
}
