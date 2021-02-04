package _20210204_linkedHashSet;

import java.util.LinkedHashSet;
/*
链表表示顺序
hashset表示唯一，不可重复
 */
public class LinkedHashSetDemo {
    public static void main(String[] args) {
        var linkedHashSet = new LinkedHashSet<String>();

        linkedHashSet.add("hello");
        linkedHashSet.add("world");
        linkedHashSet.add("java");
        for (String s : linkedHashSet) {
            System.out.println(s);
        }
    }
}
