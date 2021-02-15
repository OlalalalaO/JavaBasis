package _20210215_IO流练习;

import java.io.*;

public class 复制多级文件 {
    public static void main(String[] args) throws IOException {
        File srcFile = new File("d:\\888");//源文件
        String srcFileName = srcFile.getName();  //得到文件名称
        File desFile = new File("e:\\");//目的地
        copyFolder(srcFile,desFile); //alt+enter自动创建方法

    }

    private static void copyFolder(File srcFile, File desFile) throws IOException {
        if(srcFile.isDirectory()) {//判断scrFile是否是目录
            String fileName = srcFile.getName(); //得到当前目录的名称
            File newFolder = new File(desFile/*目的目录*/,fileName/*源目录下的名称*/);//获取源目录下的文件，并拷贝到目的路径下
            if(!newFolder.exists()){ //判断目的目录下是否已经有了此文件
                newFolder.mkdir(); //如果没有则创建此文件
            }
            File[] files = srcFile.listFiles(); //获取当前目录下的所有文件名称，存入数组
            for (File file : files) { //一次访问当前的目录下的文件
                //递归调用
                copyFolder(file,newFolder); //递归？？？？？
            }
        }else { //说明是文件，直接复制
            File newFile = new File(desFile,srcFile.getName());
            copyFile(srcFile,newFile);
        }

    }
    private static void copyFile(File files, File dest) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(files)); //读取源文件
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(dest)); //拷贝到目的文件
        byte[] bys = new byte[1024];
        int len;
        while ((len = bis.read(bys))!=-1){
            bos.write(bys,0,len);
        }
        bos.close();
        bis.close();
    }
}
