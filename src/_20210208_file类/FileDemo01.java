package _20210208_file类;

import java.io.File;
/*
    File 构造方法
 */
public class FileDemo01 {
    public static void main(String[] args) {
        File f = new File("E:\\text\\java.txt");
        System.out.println(f);

        File f1 = new File("E:\\text","java.txt");
        System.out.println(f1);

        File f3 = new File("E:\\text");

        File f4 = new File(f3,"java.txt");
    }


}
