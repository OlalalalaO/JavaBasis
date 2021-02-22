package _20210221_TCP练习;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
//从读取文本文件的数据发送，服务器给出反馈，接收到后写入
public class ServerDemo5 {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(20002);
        BufferedWriter bw = new BufferedWriter(new FileWriter("res\\ReceiveAndWrite1.txt"));
        Socket s = ss.accept();

        InputStream is = s.getInputStream(); //只有Socket才有此方法，ServerSocket并没有

        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);

        String line;
        while ((line = br.readLine())!=null){  //服务器端一直在等待读取数据，客户端一直在等待服务器端的响应，也在等着读取数据
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        BufferedWriter bwServer = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        bwServer.write("已经收到数据");
        bwServer.newLine();
        bwServer.flush();
        bw.close();
        ss.close();
        bw.close();//关闭文件流
    }

}
