package _20210209_字节缓冲流;

import java.io.*;

/*在 FileInputStream 中 read() 方法读取一个文件，每读取一个字节就要访问一次硬盘，

        这种读取的方式效率是很低的。即便使用 read(byte b[])方法一次读取多个字节，

        当读取的文件较大时，也会频繁的对磁盘操作。

        为了减少访问磁盘的次数，提高文件读取性能，Java 提供了 BufferedInputStream 类。

        BufferedInputStream的思想就是为其它输入流提供缓冲功能。

        创建BufferedInputStream时我们会通过它的构造函数指定某个输入流为参数，

        BufferedInputStream会将该输入流数据分批读取，每次读取一部分到缓冲区中，

        操作完缓冲区中的数据后，再次从输入流中读取下一部分的数据。

        在创建BufferedInputStream时，会创建一个内部缓冲区数组，默认缓存数组大小为8k。

        在读取流中的字节时，可根据需要从包含的输入流再次填充该内部缓冲区，一次填充多个字节。

        也就是说，Buffered类初始化时会创建一个较大的byte数组，一次性从底层输入流中

        读取多个字节来填充byte数组，当程序读取一个或多个字节时，可直接从缓存区byte数组中获取，

        当内存中的byte读取完后，会再次用底层输入流填充缓冲区数组。

        这种从直接内存中读取数据的方式要比每次都访问磁盘的效率高很多。*/
public class 字节缓冲流 {
    public static void main(String[] args) throws IOException {
        /*BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("res\\bos.txt"));

        bos.write("hello\r\n".getBytes());
        bos.write("world\r\n".getBytes());*/

        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("res\\bos.txt"));
/*
        int by;
        while ((by = bis.read()) != -1){
            System.out.print((char)by);
        }*/
        byte[] bytes = new byte[1024];
        int len;
        while ((len=bis.read(bytes))!=-1){
            System.out.println(new String(bytes,0,len));
        }
        bis.close();

    }
}
