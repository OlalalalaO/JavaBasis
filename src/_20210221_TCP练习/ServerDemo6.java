package _20210221_TCP练习;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
//每一个客户端开启一个线程
public class ServerDemo6 {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10005);
        while (true){
            Socket s = ss.accept();
            new Thread(new ServerThread(s)).start();
        }

    }

}
