package _20210215_IO流练习;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/*
将集合字符串写入文件,每个字符串占一行
 */
public class 集合到文件 {
    public static void main(String[] args) throws IOException {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("hello");
        arrayList.add("world");
        arrayList.add("java");
        BufferedWriter bw = new BufferedWriter(new FileWriter("res\\practice.txt"));
        for (String s : arrayList) {
            bw.write(s);
            bw.newLine();
        }
        bw.close();
    }
}
