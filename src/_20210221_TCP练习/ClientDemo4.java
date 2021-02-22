package _20210221_TCP练习;

import java.io.*;
import java.net.Socket;

public class ClientDemo4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("res\\practice.txt"));

        Socket s = new Socket("192.168.56.1",19999);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        String line;
        while ((line = br.readLine())!= null){
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        s.close();
        br.close();
        //bw.close(); s关闭 bw也关闭
    }
}
