package _20210202_collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
遍历集合
迭代器
 */
public class traCollection {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
        c.add("hello");
        c.add("world");
        c.add("java");
        Iterator<String> it = c.iterator();//得到迭代器
        /*System.out.println(it.next()); //得到下一个元素
        System.out.println(it.next());
        System.out.println(it.next());*/

        while (it.hasNext()){
            String s = it.next(); //防止读取时迭代
            System.out.println(s);
        }

    }
}
