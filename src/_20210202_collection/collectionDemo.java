package _20210202_collection;

import java.util.ArrayList;
import java.util.Collection;

public class collectionDemo {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<String>(); //重写了toString方法
        c.add("hello");
        c.add("world");
        c.add("java");
        System.out.println(c);
    }
}
