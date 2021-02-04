package _20210204_set集合;

import java.util.HashSet;
import java.util.Iterator;

public class hashOnly {
    public static void main(String[] args) {
        Student s1 = new Student(10,"林青霞");
        Student s2 = new Student(11,"林青霞1");
        Student s3 = new Student(12,"林青霞2");
        Student s5 = new Student(13,"林青霞3");
        Student s6 = new Student(14,"林青霞4");
        Student s7 = new Student(14,"林青霞4");  //出现内容重复，重写hashcode和equal方法，并不是变量名重复，变量名重复不会
        HashSet<Student> hs = new HashSet<>();
        hs.add(s1);
        hs.add(s2);
        hs.add(s3);
        hs.add(s5);
        hs.add(s6);
        hs.add(s7);
        Iterator<Student> it = hs.iterator();
        while(it.hasNext()){
            Student s = it.next();
            System.out.println(s.getName()+"  "+s.getAge());
        }

    }

}
