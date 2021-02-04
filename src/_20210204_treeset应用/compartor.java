package _20210204_treeset应用;

import java.util.Comparator;
import java.util.TreeMap;
import java.util.TreeSet;

public class compartor {
    public static void main(String[] args) {
        var ts = new TreeSet<Student>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int num = o1.getAge()-o2.getAge();
                int num2 = num==0?o1.getName().compareTo(o2.getName()):num;
                return num2;
            }
        });
        Student s1 = new Student("xishi",29);
        var s2 = new Student("wangzhaojun",30);
        var s3 = new Student("yangyuhuan",31);
        var s4 = new Student("aang",31);
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        for (Student t : ts) {
            System.out.println(t.getAge()+" "+t.getName());    /*Student cannot be cast to class java.lang.Comparable*/
        }

    }
}
