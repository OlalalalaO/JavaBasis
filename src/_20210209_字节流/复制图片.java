package _20210209_字节流;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class 复制图片 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("d:\\1.jpg");
        FileOutputStream fos = new FileOutputStream("res\\1.jpg");

        byte[] byt = new byte[1024];
        int len;
        while ((len = fis.read(byt)) != -1){  //读取到文件末尾返回 -1
            fos.write(byt,0,len);
        }
        fos.close();
        fis.close();
    }
}
