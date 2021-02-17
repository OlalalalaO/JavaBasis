package _20210215_标准输入输出流;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class 字符打印流 {
    public static void main(String[] args) throws IOException {
        //PrintWriter pw = new PrintWriter("res\\tw.txt");

/*        pw.write("hello");
        pw.write("\r\n");
        pw.write("world");*/
/*        pw.println("hello");
        pw.println("world");
        pw.close();*/
        PrintWriter pw1 = new PrintWriter(new FileWriter("res\\txt.txt"),true); //调用println是自动刷新
        pw1.println("66");
        pw1.println("world");
    }
}
