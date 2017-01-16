package com.anteoy.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by root on 17-1-16.
 */
public class DateUtils {
    public static void main(String[] args) {
        Date starttime = getMonthByNow(-1);//获取上个月6号 2016-12-06 00:00:00
        Date thisdate = getMonthByNow(0); //获取当前月6号  2016-1-06 00:00:00
        Date deadline = getMonthByNow(+1);//获取下一个6号  2016-2-06 00:00:00
        Boolean b1 = isBetweenDate(starttime,thisdate);
        Boolean b2 = isBetweenDate(thisdate,deadline);
        System.out.println(b1);
        System.out.println(b2);
    }

    /**
     * 对比当前时间是否在指定区间内
     * @param starttime  starttime < now time < deadline
     * @param deadline
     * @return
     */
    public static boolean isBetweenDate(Date starttime,Date deadline){
        Date date = new Date();//需要修改这里为mongo拿出的芝麻数据存入时间
        if(date.after(starttime) && date.before(deadline)){
            return true;
        }
        return false;
    }

    /**
     * 获取任意时间的上一个月
     * 描述:<描述函数实现的功能>.
     * @param repeatDate
     * @return
     */
    public static void getLastMonth() {

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        SimpleDateFormat simpleDateFormatMM = new SimpleDateFormat("yyyy-MM");
        Calendar c = Calendar.getInstance();
        //过去一月
        c.setTime(new Date());
        c.add(Calendar.MONTH, -1);
        Date mb = c.getTime();
        String mon = simpleDateFormatMM.format(mb);
        System.out.println("过去一个月："+mon);

        c.setTime(new Date());
        c.add(Calendar.MONTH, +1);
        Date ml = c.getTime();
        String monl = simpleDateFormatMM.format(ml);

        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(mon).append("-06 0:0:0");
        System.out.println(stringBuffer.toString());
        String starttime_str = stringBuffer.toString();
        String deadline_str = stringBuffer.toString();

    }

    /**
     * 获取指定月的6号
     * @param month -1 从当前月减一月 +1 从当前月加一月
     * @return
     */
    public static Date getMonthByNow(int month){
        SimpleDateFormat simpleDateFormatMM = new SimpleDateFormat("yyyy-MM");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Calendar c = Calendar.getInstance();

        c.setTime(new Date());
        c.add(Calendar.MONTH, month);
        Date mb = c.getTime();
        String mon = simpleDateFormatMM.format(mb);

        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(mon).append("-06 0:0:0");

        System.out.println(stringBuffer.toString());
        Date date = null;
        try {
            date = simpleDateFormat.parse(stringBuffer.toString());
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }


}
