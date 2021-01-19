package _20210114_string;

import java.util.Scanner;

public class _20210114_traString {
    //遍历字符串
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String line = sc.nextLine();

        //遍历字符串
        System.out.println(line.charAt(0)); //将字符串理解为字符数组
        System.out.println(line.charAt(1));
        System.out.println(line.charAt(2));

        //for循环
        for(int i = 0;i<line.length();i++){ //length获取字符串长度
            System.out.println(line.charAt(i));
        }
    }
}