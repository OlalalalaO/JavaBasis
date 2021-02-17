package _20210215_标准输入输出流;

import java.io.PrintStream;

public class 标准输出流 {
    public static void main(String[] args) {
        PrintStream ps = System.out;
        ps.print("hello");  //输出
        //print必须有参数，println可以有参数
        //System.out.println(); 标准输出流
    }
}
