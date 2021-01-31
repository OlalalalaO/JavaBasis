package _20210129_日期;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
格式化和解析日期
 */
public class simpleDateFormat {
    public static void main(String[] args) throws ParseException {
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat();
        String s = sdf.format(d);
        System.out.println(s);
        SimpleDateFormat sd = new SimpleDateFormat("yyyy年MM月dd日HH:mm:ss");
        String s2 = sd.format(d);
        System.out.println(s2);
        System.out.println("---------解析--------");
        String ss = "2048-08-09 11:11:11";
        SimpleDateFormat sd2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); //模式字符串
        Date dd = sd2.parse(ss);
        System.out.println(dd);
    }
}
