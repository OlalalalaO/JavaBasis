package _20210131_calendar类概述;

import java.util.Calendar;
import java.util.Scanner;

//获取任意一年的二月有多少天
public class 二月天 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入年份");
        int year = sc.nextInt();

        Calendar c = Calendar.getInstance();
        c.set(year, 2, 1);

        c.add(Calendar.DATE, -1);

        int date = c.get(Calendar.DATE);
        System.out.println("这年二月份有" + date);
    }
}
