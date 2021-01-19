package API;

import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String line = scanner.nextLine();
        System.out.println("你输入的数据是："+line);
    }


}
