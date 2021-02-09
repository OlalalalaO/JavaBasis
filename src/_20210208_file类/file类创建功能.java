package _20210208_file类;

import java.io.File;
import java.io.IOException;

public class file类创建功能 {
    public static void main(String[] args) throws IOException {
        File f1 = new File("E:\\test\\java.txt");
        System.out.println(f1.createNewFile()); //创建文件，如果文件不存在，创建文件，返回true,如果存在返回Fasle

        File f2 = new File("E:\\test\\JAVA");
        System.out.println(f2.mkdir()); //创建目录

        File f3 = new File("E:\\it\\html");
        System.out.println(f3.mkdirs()); //创建多级目录

        File f4 = new File("E:\\test\\javase.txt");
        System.out.println(f4.createNewFile());
    }
}
