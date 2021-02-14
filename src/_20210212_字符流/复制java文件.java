package _20210212_字符流;

import java.io.*;

public class 复制java文件 {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("src\\class_1_array.java"));
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("res\\1.java"));

/*        //一次读写一个字符
        int ch;
        while ((ch = isr.read())!=-1){
            osw.write(ch);
        }
        isr.close();
        osw.close();*/
        char[] chs = new char[1024];
        int len;
        while ((len = isr.read(chs))!=-1){
            osw.write(chs,0,len);
        }
        isr.close();
        osw.close();
    }
}
