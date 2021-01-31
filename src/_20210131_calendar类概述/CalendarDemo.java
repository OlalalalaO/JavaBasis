package _20210131_calendar类概述;

import java.util.Calendar;

public class CalendarDemo {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();

        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH)+1;
        int data = c.get(Calendar.DATE);
        System.out.println(year+"年"+month+"月"+data+"日");

        //add方法
        c.add(Calendar.YEAR,-3); //3年前的今天
        int year1 = c.get(Calendar.YEAR);
        int month2 = c.get(Calendar.MONTH)+1;
        int data3 = c.get(Calendar.DATE);
        System.out.println(year1+"年"+month2+"月"+data3+"日");

        //十年后的五天前
        c.add(Calendar.YEAR,+10);
        c.add(Calendar.DATE,-5);
        int year3 = c.get(Calendar.YEAR);
        int month3 = c.get(Calendar.MONTH)+1;
        int data31 = c.get(Calendar.DATE);
        System.out.println(year3+"年"+month3+"月"+data31+"日");


        //set方法
        c.set(2048,10,22);
        int year4 = c.get(Calendar.YEAR);
        int month4 = c.get(Calendar.MONTH)+1;
        int data4 = c.get(Calendar.DATE);
        System.out.println(year4+"年"+month4+"月"+data4+"日");

    }
}
