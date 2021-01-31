package _20210129_日期;

import java.util.Date;

public class dataMethod {
    public static void main(String[] args) {
        Date d = new Date();

        System.out.println(d.getTime()); //距离1970年的毫秒值
        System.out.println(d.getTime()*1.0/1000/60/60/24/365);

        System.out.println(d); //输出当前时间
        long time = 1000*60*60;
        d.setTime(time); //设置距离1970年有多少时间
        long time1 = System.currentTimeMillis();
        d.setTime(time1); //设置距离1970年有多少时间
        System.out.println(d);

    }
}
