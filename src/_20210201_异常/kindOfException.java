package _20210201_异常;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
throwadble
    error:
            检查型异常
    exception:

        runtimeException "一定是你的问题" 数组越界，null指针等等---非检查型异常
        非runtimeException 内存不足，等等----检查型异常
 */
/*
    编译时异常：必须显示处理,有可能出现异常，不一定会出现
    运行时异常：无需显示处理，也可以和编译时异常一样处理
 */
public class kindOfException {
    public static void main(String[] args) {
        method2();
    }

    /**
     * 运行时异常
     */
    public static void method(){
        try {
            int[] arr = {1,2,3};
            System.out.println(arr[3]);//非受检异常
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }

    }

    /**
     * 编译时异常
     */
    public static void method2(){
        try {
            String s = "2048-08-09";
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date d = sdf.parse(s);
            System.out.println(d);
        }catch (ParseException e){
            e.printStackTrace();
        }

    }
}
