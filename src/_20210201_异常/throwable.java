package _20210201_异常;

import javax.sound.midi.Soundbank;

public class throwable {
    public static void main(String[] args) {

        System.out.println("开始");
        method();
        System.out.println("结束");

    }
    public static void method(){
        try {
            int[] arr = {1,2,3};
            System.out.println(arr[3]); //new ArrayIndexOutOfBoundsException()
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();//将错误输出在控制台，最全的
            System.out.println(e.getMessage()); //输出异常原因
            System.out.println(e.toString()); //将e.printStackTrace();转化为字符串输出
        }
    }
}
