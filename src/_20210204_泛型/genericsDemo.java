package _20210204_泛型;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
将变量的类型变量化
 */
public class genericsDemo {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<String>();

        c.add("hello");
        c.add("world");
        c.add("java");
        //c.add(1000);
        Iterator<String> it = c.iterator();
        while (it.hasNext()){
           /* Object obj = it.next();
            System.out.println(obj);*/
            String s = it.next();
            System.out.println(s);
        }
    }
}
