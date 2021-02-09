package _20210209_字节流;

import java.io.*;

public class 复制文本文件 {
    //读取一个文件，并将数据写入另一个文件
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("d:\\copy.txt");
        FileOutputStream fos = new FileOutputStream("res\\copy.txt");
        int byt;
        while ((byt = fis.read()) != -1)
        {
            fos.write(byt);
        }
        fos.close();
    }
}
