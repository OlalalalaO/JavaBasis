package _20210114_string;

import java.sql.SQLOutput;
import java.util.Scanner;

public class reversString {
    //字符串翻转  输入CBA,输出ABC
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入一个字符串");
        String line = sc.nextLine();


        String reverse = reverse(line);
        System.out.println("s:"+reverse);
    }


    //定义方法
    public static String reverse(String s){
        String ss = "";
        for (int i = s.length()-1; i>=0;i--){
            ss += s.charAt(i);
        }
        return ss;
    }
}
