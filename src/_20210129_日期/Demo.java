package _20210129_日期;

import java.util.Date;

public class Demo {
    public static void main(String[] args) {
        Date d1 = new Date();
        System.out.println(d1); //输出了日期，重写了toString方法

        long date = 100*60*60;
        Date d2 = new Date(date);//data表示将基准时间设置为基准时间+data毫秒数
        System.out.println(d2);
    }
}
