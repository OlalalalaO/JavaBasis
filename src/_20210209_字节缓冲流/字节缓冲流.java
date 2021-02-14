package _20210209_字节缓冲流;

import java.io.*;

public class 字节缓冲流 {
    public static void main(String[] args) throws IOException {
        /*BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("res\\bos.txt"));

        bos.write("hello\r\n".getBytes());
        bos.write("world\r\n".getBytes());*/

        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("res\\bos.txt"));
/*
        int by;
        while ((by = bis.read()) != -1){
            System.out.print((char)by);
        }*/
        byte[] bytes = new byte[1024];
        int len;
        while ((len=bis.read(bytes))!=-1){
            System.out.println(new String(bytes,0,len));
        }
        bis.close();

    }
}
