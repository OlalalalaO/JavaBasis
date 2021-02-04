package _20210204_列表迭代器;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/*
列表特有迭代器
允许任意方向遍历
可以在遍历中修改元素
 */
public class listiterator {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("hello");
        list.add("world");
        list.add("java");

       ListIterator<String> l =  list.listIterator();
       while (l.hasNext()){
           String s = l.next();
           System.out.println(s);
       }
        System.out.println("------");
       while (l.hasPrevious()){  /**逆向遍历***/
           String s = l.previous();
           System.out.println(s);
       }
        System.out.println("-------");
       while (l.hasNext()){
           String s = l.next();
           if(s.equals("world")){
               l.add("666");  //列表迭代器不会出现并发异常
           }

       }
       System.out.println(list);
    }
}
