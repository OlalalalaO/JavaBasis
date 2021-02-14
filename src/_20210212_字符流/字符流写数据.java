package _20210212_字符流;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class 字符流写数据 {
    public static void main(String[] args) throws IOException {
        OutputStreamWriter sw = new OutputStreamWriter(new FileOutputStream("res\\os.txt"));
        sw.write(98);
        sw.flush();//刷新
        sw.write(99);

        char[] chs = {'a','c','s'};
        sw.write(chs);//写入字符数组
        sw.write(chs,0,2);//写入字符数组的指定长度
        sw.write("12321赵自信心");//写字符串
        sw.write("zhaozixuan",0,3);
        sw.close();//先刷新，在关闭流、

    }
}
