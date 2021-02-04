package _20210201_异常;

import java.util.Scanner;

public class defineExceptionDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入分数：");
        int score = sc.nextInt();
        useDefineException u = new useDefineException();
        try {
            u.checkScore(score);
        } catch (defineException e) {
            e.printStackTrace();
        }
    }
}
