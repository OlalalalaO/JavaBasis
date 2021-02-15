package _20210214_字符缓冲流;

import java.io.*;

public class 字符缓冲流的特有功能 {
    public static void main(String[] args) throws IOException {
/*        BufferedWriter bw = new BufferedWriter(new FileWriter("res\\q.txt"));
        for (int i = 0; i < 10; i++) {
             bw.write("hello"+i);
             bw.newLine(); //换行写
            bw.flush();
        }
        bw.close();*/
        BufferedReader br = new BufferedReader(new FileReader("res\\q.txt"));
        /*String s = br.readLine(); 只读内容，不包括换行
        System.out.println(s);
        String s2 = br.readLine();
        System.out.println(s2);  //没有数据会返回null*/
        String line;
        while ((line = br.readLine())!=null){
            System.out.println(line);
        }
        br.close();
    }
}
