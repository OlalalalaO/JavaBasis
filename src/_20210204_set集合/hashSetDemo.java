package _20210204_set集合;

import java.util.HashMap;
import java.util.HashSet;

public class hashSetDemo {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        hs.add("1111");
        hs.add("2222");
        hs.add("3333");
        hs.add("5555");
        hs.add("5555");
        for (String s : hs) {
            System.out.println(s);  //不保证序列，不包含重复元素
        }
    }
}
