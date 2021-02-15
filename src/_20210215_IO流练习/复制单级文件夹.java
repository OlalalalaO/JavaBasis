package _20210215_IO流练习;

import java.io.*;

public class 复制单级文件夹 {
    public static void main(String[] args) throws IOException {
        File src = new File("D:\\777"); //源文件
        String srcname = src.getName();//得到文件夹名称
        File destfolder = new File("res",srcname); //得到拷贝路径
        if(!destfolder.exists()){ //判断文件是否存在
            destfolder.mkdir(); //如果不存在，创建路径
        }
        File[] files = src.listFiles();//扫描源文件下所有文件
        for (File file : files) {
            String name = file.getName(); //获取txt文件
            File dest = new File(destfolder,name);//创建文件
            copyFile(file,dest);
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
