package _20210202_collection;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class collectionApplication {
    public static void main(String[] args) {
        Collection<student> c = new ArrayList<>();
        student s1 = new student("林青霞",30);
        student s2 = new student("张曼玉",32);
        student s3 = new student("王祖贤",33);
        c.add(s1);
        c.add(s2);
        c.add(s3);
        Iterator it = c.iterator();
        while(it.hasNext()){
            student s = (student) it.next(); //添加类型转换
            System.out.println(s.getName());
            System.out.println(s.getAge());
        }
    }
}
