package _20210220_网络编程;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class inetAddrressDemo {
    public static void main(String[] args) throws UnknownHostException {
        //InetAddress address = InetAddress.getByName("DESKTOP-422UJSF");
        InetAddress address = InetAddress.getByName("192.168.56.1");//得到对象,主机名可以是ip地址，也可以是主机名，推荐这种

        String name = address.getHostName(); //拿到主机名

        String ip = address.getHostAddress();

        System.out.println(name+"  "+ip);
    }
}
