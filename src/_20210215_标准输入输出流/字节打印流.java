package _20210215_标准输入输出流;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class 字节打印流 {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream ps = new PrintStream("res\\ps.txt");
        ps.write(97); //字节输出流，存的是a转码
        ps.println(98);
        ps.print(97); //写的就是97，不转码



        ps.close(); //释放资源
    }
}
