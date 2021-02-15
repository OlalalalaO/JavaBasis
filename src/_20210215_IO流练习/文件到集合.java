package _20210215_IO流练习;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class 文件到集合 {
    public static void main(String[] args) throws IOException {
        ArrayList<String> arrayList = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader("res\\practice.txt"));
        String s ;
        while ((s = br.readLine())!=null){
            arrayList.add(s);
        }
        br.close();
        for (String s1 : arrayList) {
            System.out.println(s1);
        }
    }
}
