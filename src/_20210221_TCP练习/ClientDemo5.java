package _20210221_TCP练习;

import java.io.*;
import java.net.Socket;

public class ClientDemo5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("res\\TCP1.txt"));

        Socket s = new Socket("192.168.56.1",20002);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        InputStream is = s.getInputStream();
        String line;
        while ((line = br.readLine())!= null){
            bw.write(line);
            bw.newLine();
            bw.flush();
        }

        //自定义结束标记
        s.shutdownOutput(); //表示输出结束
        BufferedReader bwClient = new BufferedReader(new InputStreamReader(s.getInputStream()));
        System.out.println(bwClient.readLine());


        s.close();
        br.close();
        is.close();
        //bw.close(); s关闭 bw也关闭
    }
}
