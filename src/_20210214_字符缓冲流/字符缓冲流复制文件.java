package _20210214_字符缓冲流;

import java.io.*;

public class 字符缓冲流复制文件 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("src\\text.java"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("res\\text.java"));
/*        //一次读写一个字符
        int ch;
        while ((ch = br.read())!=-1){
            bw.write(ch);
        }
        */
        //一次读写一个字符数组
        char[] chs = new char[1024];
        int len;
        while ((len = br.read(chs))!=-1){
            bw.write(chs,0,len);
        }
        bw.close();
        br.close();
    }
}
