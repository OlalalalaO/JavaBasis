package _20210220_网络编程;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.charset.StandardCharsets;

public class TCP发送程序 {
    public static void main(String[] args) throws IOException {
        //创建对象
        //Socket s = new Socket(InetAddress.getByName("192.68.56.1"),10086);
        Socket s = new Socket("192.168.56.1",10086);

        OutputStream os = s.getOutputStream();
        os.write("hello".getBytes());
        s.close();
    }
}
