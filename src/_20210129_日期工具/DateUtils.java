package _20210129_日期工具;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
    private DateUtils(){

    }  //构造方法，外界无法创建对象
    public static String dateToString(Date date,String format){
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        String s = sdf.format(date);
        return s;
    }


    public static Date stringToDate(String s,String format) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        Date d = sdf.parse(s);
        return d;

    }
}


