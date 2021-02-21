package _20210221_TCP练习;

import java.io.*;
import java.net.Socket;

public class ClientDemo2 {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("192.168.56.1",10001);  //创建客户端对象
        //封装输出流对象
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = br.readLine())!=null){
            if("886".equals(line))break;
/*            OutputStream outputStream = s.getOutputStream();
            outputStream.write(line.getBytes());*/

            bw.write(line);
            bw.newLine();
            bw.flush();

        }
        s.close();
    }
}
