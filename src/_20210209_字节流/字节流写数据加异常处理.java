package _20210209_字节流;

import javax.imageio.IIOException;
import java.io.FileOutputStream;
import java.io.IOException;

public class 字节流写数据加异常处理 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("res\\error.txt"); //可以直接创建对象，调用系统功能，创建文件
            fos.write("hello".getBytes());
        }catch (IOException e){
            e.printStackTrace();
        }finally {  //最后的最后
            if(fos!= null){ //盘符不存在的话，fos为null
                fos.close();
            }

        }

    }
}
