package _20210212_字符流;

import java.io.*;

public class 字符流中的编码和解码 {
    public static void main(String[] args) throws IOException {
/*        FileOutputStream fos = new FileOutputStream("res\\bos.txt");
        OutputStreamWriter osw = new OutputStreamWriter(fos);
        osw.write("中国");
        osw.close();*/
        OutputStreamWriter osw1 = new OutputStreamWriter(new FileOutputStream("res\\bos.txt"),"GBK");
        osw1.write("牛");
        osw1.close();
        InputStreamReader isr = new InputStreamReader(new FileInputStream("res\\bos.txt"),"GBK");
        int ch;
        while ((ch = isr.read())!=-1){
            System.out.println((char) ch);
        }

        isr.close();


    }
}
