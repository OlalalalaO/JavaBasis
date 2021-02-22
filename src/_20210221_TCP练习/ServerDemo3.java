package _20210221_TCP练习;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
//接受到的数据写入文本文件
public class ServerDemo3 {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(20001);
        BufferedWriter bw = new BufferedWriter(new FileWriter("res\\TCP.txt"));
        Socket s = ss.accept();

        InputStream is = s.getInputStream(); //只有Socket才有此方法，ServerSocket并没有

        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);

        String line;
        while ((line = br.readLine())!=null){
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        ss.close();
        bw.close();//关闭文件流
    }
}
