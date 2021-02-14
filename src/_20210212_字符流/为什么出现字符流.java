package _20210212_字符流;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
//gbk编码占用两个字节，utf8占用三个字节，按字节输出不了汉字，字符流 = 字节流 + 编码表
public class 为什么出现字符流 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("res\\bos.txt");
        int by;
        while ((by = fis.read())!=-1){
            System.out.print((char)by);
        }
        fis.close();
    }
}
