package _20210221_TCP练习;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
//接受到键盘输入的的数据
public class ServerDemo2 {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10001);
        Socket s = ss.accept();  //


        InputStream is = s.getInputStream(); //得到传输过来的字节流，只有此方法

        InputStreamReader isr = new InputStreamReader(is);  //读取字节流到字符流
        BufferedReader br = new BufferedReader(isr);  //读取字节流到缓存,一次读取一行

        String line;
        while ((line = br.readLine())!=null) {
            System.out.println(line);
        }
        ss.close();
    }
}
