package _20210114_string;

import java.util.Scanner;

public class _20210114_string_statistics {
    //统计各个字符个数——大写，小写,数字
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入一串字符");
        String line = sc.nextLine();

        //统计三种字符数目
        int bigCount = 0;
        int smallCount = 0;
        int numCount = 0;
        for (int i = 0; i<line.length();i++){
            char ch = line.charAt(i);

            //判断类型
            if(ch>='A' && ch<= 'Z'){
                bigCount++;
            }else if(ch>='a' && ch<='z'){
                smallCount++;
            }else  if(ch>='0' && ch<='9'){
                numCount++;
            }
        }
        System.out.println("大写字母" + bigCount + "个");
        System.out.println("小写字母" + smallCount + "个");
        System.out.println("数字" + numCount + "个");
    }

}
