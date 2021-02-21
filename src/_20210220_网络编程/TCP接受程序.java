package _20210220_网络编程;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

//服务器端
public class TCP接受程序 {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10086);


        //监听客户端连接,返回一个对应的socket对象
        Socket s = ss.accept();
        InputStream is = s.getInputStream();
        byte[] bys = new byte[1024];
        int len = is.read(bys);

        String data = new String(bys,0,len);

        System.out.println(data);
        s.close();
        ss.close();

    }
}
