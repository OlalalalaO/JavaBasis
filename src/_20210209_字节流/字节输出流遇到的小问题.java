package _20210209_字节流;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class 字节输出流遇到的小问题 {
    public static void main(String[] args) throws IOException {
        /*FileOutputStream f = new FileOutputStream("res\\byte.txt");*/
        FileOutputStream f = new FileOutputStream("res\\byte.txt",true); //追加写入
        for (int i = 0; i < 10; i++) {
            f.write("hello".getBytes());
            f.write("\r\n".getBytes());  //在记事本中打开是不换行的,在windows中换行是\r\n
        }
        f.close();

    }
}
