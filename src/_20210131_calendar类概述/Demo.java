package _20210131_calendar类概述;

import java.util.Calendar;

public class Demo {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance(); //多态的形式 ，返回日历字段
        System.out.println(c); //月份从0开始的


        //获取年月日
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH)+1; //月份从0开始
        int date = c.get(Calendar.DATE);
        System.out.println("年"+year+"月"+month+"日"+date);
    }
}
