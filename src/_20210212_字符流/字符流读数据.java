package _20210212_字符流;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class 字符流读数据 {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("res\\read.txt"));
/*        int ch;
        while ((ch = isr.read())!=-1){//一次读一个
            System.out.print((char)ch);
        }*/
        char[] chs = new char[1024];//一次读一个字符数组
        int len;
        while ((len = isr.read(chs))!=-1){
            System.out.println(new String(chs,0,len));
        }
        isr.close();
    }
}
