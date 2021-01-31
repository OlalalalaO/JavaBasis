package _20210129_日期工具;

import java.text.ParseException;
import java.util.Date;

/*
把日期转换为指定字符串，和反之
 */
public class Demo {
    public static void main(String[] args) throws ParseException {
        //
        Date d = new Date();
        String s1 = DateUtils.dateToString(d, "yyyy年MM月dd日 HH:mm:ss");
        System.out.println(s1);
        String s2 = DateUtils.dateToString(d,"yyyy年MM月dd日");
        System.out.println(s2);

        String s = "2048-08-09 12:12:12";
        Date dd = DateUtils.stringToDate(s, "yyyy-MM-dd HH:mm:ss");
        System.out.println(dd);

    }
}
