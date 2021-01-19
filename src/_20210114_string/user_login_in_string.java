package _20210114_string;

import java.util.Scanner;

public class user_login_in_string {
    // 用户名和代码
    public static void main(String[] args) {
        String username = "admin";
        String password = "zzx";
        for (int i = 0; i < 3; i++) {
            // 键盘输入要登录的用户名和密码
            Scanner sc = new Scanner(System.in);

            System.out.println("请输入用户名；");
            String name = sc.nextLine();

            System.out.println("请输入密码：");

            String word = sc.nextLine();

            //比较名字
            if (name.equals(username) && word.equals(password)) {
                System.out.println("登陆成功");
                break;
            } else {
                if (2-i ==0) {
                    System.out.println("你的账户被锁定");
                }else{
                    System.out.println("登录失败，你还有"+(2 - i)+"次机会");
                }
            }

        }
    }
}
