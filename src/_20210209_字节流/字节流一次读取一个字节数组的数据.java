package _20210209_字节流;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLOutput;

public class 字节流一次读取一个字节数组的数据 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("res\\fos.txt");
        byte[] bys = new byte[10];
        for (byte by : bys) {
            System.out.println((char) by);  //此时是空值
        }
        int len = fis.read(bys);  //读取bys数组长度的数据，存入bys中,返回的是读取的长度，读入文件内容

        System.out.println(len);  //此时为空
        System.out.println(new String((bys))); //将字节数组转换为字符串
        System.out.println("------");
        len = fis.read(bys);  //存入bys中

        System.out.println(len);
        System.out.println(new String((bys)));

        System.out.println("------");
        len = fis.read(bys);
        System.out.println(len);
        System.out.println(new String((bys)));//会读取\r也算一个字节
        fis.close();
    }
}
