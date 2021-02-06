package _20210206_可变参数的使用;

import java.util.Set;

public class Demo2 {
    public static void main(String[] args) {
        Set<String> set = Set.of("123","123213"); //不可有重复元素,不可变
        set.add("Java");
        System.out.println(set);

    }


}
