package _20210221_TCP练习;

import java.io.*;
import java.net.Socket;
//发送键盘录入
public class ClientDemo2 {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("192.168.56.1",10001);  //创建客户端对象
        //封装输出流对象
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));  //得到输出流
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  //读取键盘
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
