package _20210214_字符缓冲流;

import java.io.*;

public class 字符缓冲流读写数据 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("res\\bw.txt"); //写数据
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("hello");
        bw.newLine(); //换行
        bw.write("java");
        bw.close();
        BufferedReader br = new BufferedReader(new FileReader("res\\bw.txt"));
        int ch;
        while ((ch = br.read())!=-1){
            System.out.print((char) ch);
        }
        int len;
        char[] chs = new char[1024];
        while ((len = br.read(chs))!=-1){
            System.out.print(new String(chs,0,len));
        }
        //fw.close();

        br.close();
    }
}
