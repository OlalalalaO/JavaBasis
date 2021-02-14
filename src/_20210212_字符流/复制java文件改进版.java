package _20210212_字符流;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class 复制java文件改进版 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("src\\text.java");//简写
        FileWriter fw = new FileWriter("res\\2.java");

        int ch;
        while ((ch = fr.read())!=-1){
            fw.write(ch);
        }
       /* char[] chs = new char[1024];
        int len;
        while ((len=fr.read(chs))!=-1){
            fw.write(chs,0,len);
        }*/
        fr.close();
        fw.close();
    }
}
