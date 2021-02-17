package _20210215_标准输入输出流;

import java.io.*;

public class 复制java文件 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("src\\text.java"));
        PrintWriter pw = new PrintWriter(new FileWriter("res\\copy.java"));
        String line;
        while ((line = br.readLine())!=null){
            pw.println(line);
        }
        pw.close();
        br.close();
    }
}
