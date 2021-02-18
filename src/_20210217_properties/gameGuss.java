package _20210217_properties;

import java.util.Random;
import java.util.Scanner;

public class gameGuss {
    public gameGuss() {
    }
    public static void start(){
        Random r = new Random();
        int number = r.nextInt(100)+1;
        while (true){
            Scanner sc = new Scanner(System.in);
            System.out.println("输入你要的数字");
            int guess = sc.nextInt();
            if ((guess>number)) System.out.println("大了");
            else if((guess<number)) System.out.println("小了");
            else if(guess == number){
                System.out.println("对了");
                break;
            }
        }
    }
}
