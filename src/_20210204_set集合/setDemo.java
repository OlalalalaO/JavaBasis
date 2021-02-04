package _20210204_set集合;

import java.sql.SQLOutput;
import java.util.HashSet;
import java.util.Set;

/*
set集合，不重复
没有索引
 */
public class setDemo {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("hello");
        set.add("world");
        set.add("java");
        set.add("world");  //不包含重复元素
        for (String s:set){
            System.out.println(s);  //hash 对迭代顺序不保证，会乱序
        }
    }
}
