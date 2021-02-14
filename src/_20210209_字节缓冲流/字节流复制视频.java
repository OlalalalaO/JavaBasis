package _20210209_字节缓冲流;

import java.io.*;

public class 字节流复制视频 {
    public static void main(String[] args) throws IOException {
        //复制视频
        long startTime = System.currentTimeMillis();
        method1(); //10635ms
        long endTime = System.currentTimeMillis();
        System.out.println("共耗时"+(endTime - startTime));



        long startTime1 = System.currentTimeMillis();
        method2();//14ms
        long endTime1 = System.currentTimeMillis();
        System.out.println("共耗时"+(endTime1 - startTime1));


        long startTime2 = System.currentTimeMillis();
        method3();//85ms
        long endTime2 = System.currentTimeMillis();
        System.out.println("共耗时"+(endTime2 - startTime2));


        long startTime3 = System.currentTimeMillis();
        method4();//87ms  建议这种
        long endTime3 = System.currentTimeMillis();
        System.out.println("共耗时"+(endTime3 - startTime3));
    }
    //一次读写一个字节
    public static void method1() throws IOException {
        FileInputStream fis = new FileInputStream("d:\\1.mp4");
        FileOutputStream fos = new FileOutputStream("res\\video.mp4");
        int by;
        while ((by = fis.read()) != -1){
            fos.write(by);
        }
        fis.close();;
        fos.close();
    }
    //一次读写一个字节数组
    public static void method2() throws IOException {
        FileInputStream fis = new FileInputStream("d:\\1.mp4");
        FileOutputStream fos = new FileOutputStream("res\\video1.mp4");
        byte[] bys = new byte[1024];
        int len;
        while ((len = fis.read(bys)) != -1){
            fos.write(bys,0,len);
        }
        fis.close();;
        fos.close();
    }
    public static void method3() throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("d:\\1.mp4"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("res\\video2.mp4"));
        int by;
        while ((by=bis.read())!=-1){
            bos.write(by);
        }
        bis.close();
        bos.close();
    }
    public static void method4() throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("d:\\1.mp4"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("res\\video3.mp4"));
        int len;
        byte[] bys = new byte[1024];
        while ((len=bis.read())!=-1){
            bos.write(len);
        }
        bis.close();
        bos.close();
    }
}
