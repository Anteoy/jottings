package com.anteoy.jmtest.time;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @auther zhoudazhuang
 * @date 18-8-6 15:33
 * @description
 */
public class Test {
    public static int hourOfData(long timestamp) {
        Calendar c = Calendar.getInstance();
        c.setTime(new Date(timestamp));
        return c.get(Calendar.HOUR_OF_DAY);
    }

    public static int trans2weekDay(long timestamp) {
        Calendar   calendar   =   new GregorianCalendar();
        calendar.setTime(new Date(timestamp));
        int w = calendar.get(Calendar.DAY_OF_WEEK);
        if (w == 1) {
            w = 6;
        }else {
            w -= 2;
        }
        return w;
    }

  public static void main(String[] args) {
    System.out.println(new Date().getTime());
    System.out.println(hourOfData(new Date().getTime()));
    System.out.println(trans2weekDay(new Date().getTime()));
    System.out.println(1529745453*1000);
      long timestamp = 1529745453l * 1000;
    System.out.println(timestamp);
      System.out.println(hourOfData(1529745453l*1000));
      System.out.println(trans2weekDay(1529745453l*1000));
  }
}
