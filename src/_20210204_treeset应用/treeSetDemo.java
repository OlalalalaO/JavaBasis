package _20210204_treeset应用;

//存学生，以年龄从大到小，如果年龄相同，按字母大小

import java.util.Set;
import java.util.TreeSet;

public class treeSetDemo{
    public static void main(String[] args) {
        Student s1 = new Student("xishi",29);
        var s2 = new Student("wangzhaojun",30);
        var s3 = new Student("yangyuhuan",31);
        var s4 = new Student("aang",31);
        var ts = new TreeSet<Student>();
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        for (Student t : ts) {
            System.out.println(t.getAge()+" "+t.getName());    /*Student cannot be cast to class java.lang.Comparable*/
        }

    }
}
