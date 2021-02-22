package _20210221_TCP练习;

import java.io.*;
import java.net.Socket;

public class ClientDemo3 {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("192.168.56.1",20001);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream())); //获取Socker的输出流
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //获取键盘输入流

        String line;
        while ((line = br.readLine())!=null){
            if (line.equals("886"))break;
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        s.close();
    }
}
