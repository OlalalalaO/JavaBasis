package _20210221_TCP练习;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientDemo1 {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("192.168.56.1",10086);

        OutputStream os = s.getOutputStream();
        os.write("hello,我来了".getBytes());
        //接受反馈
        InputStream is = s.getInputStream();
        byte[] bys = new byte[1024];
        int len = is.read(bys);
        String data = new String(bys,0,len);
        System.out.println(data);

        s.close();

    }
}
