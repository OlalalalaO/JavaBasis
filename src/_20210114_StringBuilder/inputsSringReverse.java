package _20210114_StringBuilder;

import java.util.Scanner;

public class inputsSringReverse {
    public static void main(String[] args) {
        //键盘输入abc,输出结果cba
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        System.out.println(sb);
    }
}
