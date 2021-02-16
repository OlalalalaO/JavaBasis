package _20210215_标准输入输出流;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class 标准输入流 {
    public static void main(String[] args) throws IOException {
        InputStream is = System.in;//in 标准输入流，来自键盘输入，字节流读数据
        int by;
        while ((by = is.read())!=-1){  //读一个字节
            System.out.print((char) by);
        }
        InputStreamReader isr = new InputStreamReader(is);//将字节流转换为字符流
        BufferedReader br = new BufferedReader(isr);//一次读一行

    }
}
