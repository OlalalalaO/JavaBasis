package _20210208_file类;

import java.io.File;
import java.io.IOException;

public class File类的删除功能 {
    public static void main(String[] args) throws IOException {
        File f1 = new File("res\\java.txt"); //不写完整的路径，则会创建为项目目录下,相对路径
        System.out.println(f1.createNewFile());  //创建文件

        System.out.println(f1.delete()); //删除文件

        System.out.println("---------");
        File f2 = new File("res\\learnJava");
        System.out.println(f2.mkdir()); // 创建目录
        System.out.println(f2.delete()); //删除目录

        File f3 = new File("res\\learnJava");
        //System.out.println(f3.mkdir());
        File f4 = new File("res\\learnJava\\java.txt"); //创建文件时，必须有上级目录
        //System.out.println(f4.createNewFile());
        System.out.println(f4.delete());
        System.out.println(f3.delete()); //如果删除目录的下面有文件，则删不了

    }
}
