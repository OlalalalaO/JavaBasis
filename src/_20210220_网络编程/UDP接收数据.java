package _20210220_网络编程;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDP接收数据 {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket(10086);

        //创建一个数据包
        byte[] bys = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bys,bys.length); //不用设置主机地址

        ds.receive(dp);

        //解析数据包
        int len = dp.getLength();  //拿到实际接受了多少数据
        byte[] data = dp.getData();
        String dataString = new String(data,0,len);

        System.out.println("数据是"+dataString);

        ds.close();
    }
}
