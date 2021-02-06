package _20210206_map;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class 统计字符串中每个字符出现的次数 {
    public static void main(String[] args) {
        HashMap<Character,Integer> hm = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] c = s.toCharArray();
        for (int i = 0; i < c.length; i++) {
            Integer times = 1;
            if(hm.get(c[i]) == null){
                hm.put(c[i],times);
            }else {

                times = hm.get(c[i])+1;
                hm.put(c[i],times);
            }
        }
        Set<Character> ss = hm.keySet();
        for (Character character : ss) {
            System.out.println(character+" "+hm.get(character));
        }
    }
}
