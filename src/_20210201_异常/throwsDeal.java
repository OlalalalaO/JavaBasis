package _20210201_异常;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
throws处理异常
 */
public class throwsDeal {
    public static void main(String[] args) {
        System.out.println("开始");
        try {
            method2();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println("结束");
    }

    /**
     * 运行时异常
     */
    public static void method()throws ArrayIndexOutOfBoundsException{  //只是抛出，程序终止，延迟处理
            int[] arr = {1,2,3};
            System.out.println(arr[3]);//非受检异常

    } /**
     * 编译时异常
     */
    public static void method2() throws ParseException {
            String s = "2048-08-09";
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date d = sdf.parse(s);
            System.out.println(d);


    }


}
