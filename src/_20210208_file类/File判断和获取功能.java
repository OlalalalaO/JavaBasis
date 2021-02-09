package _20210208_file类;

import java.io.File;

public class File判断和获取功能 {
    public static void main(String[] args) {
        File f = new File("myFile\\java.txt");

        System.out.println(f.isDirectory()); //判断是否是目录
        System.out.println(f.isFile()); //判断是否是文件
        System.out.println(f.exists()); //判断文件是否存在

        System.out.println(f.getAbsoluteFile());  //返回绝对路径
        System.out.println(f.getPath());  //将此路径转化为字符串
        System.out.println(f.getName());  //返回文件名称

        File f2 = new File("E:\\it");
        String[] str = f2.list();  //将该路径下的所有文件名存入数组
        for (String s : str) {
            System.out.println(s);
        }
        File[] files = f2.listFiles();
        for (File file : files) {  //打出绝对路径
            System.out.println(file.getName());
        }
    }
}
