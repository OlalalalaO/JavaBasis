package _20210220_网络编程;

import java.io.IOException;
import java.net.*;

public class UDP发送数据 {
    public static void main(String[] args) throws IOException {
        //创建socket对象
        DatagramSocket ds = new DatagramSocket();
        //创建数据并打包
        byte[] bys = " hello，udp我来了".getBytes();  //数据
        int len = bys.length;  //数据长度
        InetAddress name = InetAddress.getByName("192.168.56.1"); //主机
        int port = 10086; //端口
        DatagramPacket dp = new DatagramPacket(bys,len,name,port);
        //调用方法发送数据
        ds.send(dp);

        //关闭发送端
        ds.close();
    }
}
