package _20210209_字节流;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class 字节输出流 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("res\\fos.txt"); //可以直接创建对象，调用系统功能，创建文件
        //FileOutputStream fos = new FileOutputStream(File file);    //也可以
        /*fos.write(97);  //ascii码，写入一个字节的数据
        fos.write(98);  //ascii码，写入一个字节的数据
        fos.write(99);  //ascii码，写入一个字节的数据
*/
        byte[] bys = {100,101,102,103,104};
        byte[] b = "qwertyu".getBytes(); //根据字符串得到字符数组
        fos.write(b);
        fos.write(b,0,3);  //写入指定的数组内的数据
        fos.close();  //最后都要释放资源，关闭输出流，释放系统资源
    }
}
