package _20210201_异常;
/*
异常，祖宗是throwable

error 严重的问题，硬件，内存等问题，一般不处理


exception 异常，要捕获 分为runtimeException和非runtimeException
        runtimeException 编译时不处理，程序出错后修改代码
        非runtimeException编译时要处理，否则无法运行
 */


import javax.sound.midi.Soundbank;

/*
jvm的异常处理方案：
打印异常，终止程序
 */
public class exceptionDemo {
    public static void main(String[] args) {
        //try  catch
        System.out.println("开始");
        method();
        System.out.println("结束");
    }
    public static void method(){
        try {
            int[] arr = {1,2,3};
            System.out.println(arr[3]); //等价于 new ArrayIndexOutOfBoundsException
        }catch (ArrayIndexOutOfBoundsException e){  //捕捉异常
//            System.out.println("你访问的数组索引不存在"); //执行
            e.printStackTrace();
        }

    }
}
