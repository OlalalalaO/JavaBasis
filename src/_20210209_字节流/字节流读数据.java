package _20210209_字节流;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class 字节流读数据 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("res//fos.txt"); //可以直接输入文件名

        /*//第一次读取数据
        int byt = fis.read(); //读取一个字节的数据
        System.out.println(byt);
        System.out.println((char)byt);

        //第二次读取数据
        byt = fis.read(); //读取一个字节的数据
        System.out.println(byt);
        System.out.println((char)byt); //没有数据会读取-1*/


        //一次读取完
/*        int byt = fis.read();
        while (byt != -1){
            System.out.print((char)byt);
            byt = fis.read();
        }*/


        //优化
        int by;
        while ((by = fis.read())!=-1){
            System.out.print((char)by); //也可以读取换行
        }


        fis.close();//释放资源
    }
}
