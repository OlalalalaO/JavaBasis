package _20210221_TCP练习;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
//从文本接受数据
public class ServerDemo4 {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(19999);
        Socket s = ss.accept();
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String line;
        while ((line = br.readLine())!=null){
            System.out.println(line);
        }
        ss.close();
        br.close();
    }
}
