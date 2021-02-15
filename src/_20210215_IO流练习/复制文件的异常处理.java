package _20210215_IO流练习;

import java.io.*;

public class 复制文件的异常处理 {
    public static void main(String[] args) {

    }
    /**********
     * 复杂版本
     */
    /*public static void method(){
        FileReader fr = null;
        FileWriter fw = null;
        try {
            fr = new FileReader("fr.txt");
            fw = new FileWriter("fw.txt");
            char[] chs = new char[1024];
            int len;
            if((len = fr.read(chs))!=-1) {
                fw.write(chs);
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            if(fw!=null){
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(fr!=null){
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }

    }*/
    /**
     * jdk7之后的简化
     */
    public static void method2(){//jdk7之后自动释放资源
        try(FileReader fr = new FileReader("fr.txt");
            FileWriter fw = new FileWriter("fw.txt");) {

            char[] chs = new char[1024];
            int len;
            if((len = fr.read(chs))!=-1) {
                fw.write(chs);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    /**
     * jdk9之后
     * @throws IOException
     */
    public static void method3() throws IOException {
        FileReader fr = new FileReader("fr.txt");
        FileWriter fw = new FileWriter("fw.txt");
        try(fr;fw) {

            char[] chs = new char[1024];
            int len;
            if((len = fr.read(chs))!=-1) {
                fw.write(chs);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }

}
