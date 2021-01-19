package _20210118_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class arrayList_tra_string {
    public static void main(String[] args) {
        /*接受字符并存，然后遍历输出*/
        System.out.println("请输入字符：");
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> arr = new ArrayList<>();
        for(int i = 0;i<3;i++){
            String str = scanner.nextLine();
            arr.add(str);
        }
        for(int i = 0;i<arr.size();i++){
            System.out.println(arr.get(i));
        }
    }
}
