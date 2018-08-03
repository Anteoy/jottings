package com.anteoy.jmtest;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @auther zhoudazhuang
 * @date 18-8-3 11:33
 * @description
 */
public class Predealprediction {
  public static void main(String[] args) {
      Calendar c = Calendar.getInstance();
      System.out.println(c.get(Calendar.HOUR_OF_DAY));
      System.out.println("==========");
      Date date=new Date();
      SimpleDateFormat dateFm = new SimpleDateFormat("EEEE");
      Calendar   calendar   =   new GregorianCalendar();
      calendar.setTime(date);
      calendar.add(calendar.DATE,2);//把日期往后增加一天.整数往后推,负数往前移动
      System.out.println(dateFm.format(date));
      dateFm.format(date);
      System.out.println(date);
      Calendar cal = Calendar.getInstance();
      cal.setTime(date);
//      int w = cal.get(Calendar.DAY_OF_WEEK);
      int w = calendar.get(Calendar.DAY_OF_WEEK);
      System.out.println(w);
  }
}
