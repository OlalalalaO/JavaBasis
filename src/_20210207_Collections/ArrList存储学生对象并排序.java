package _20210207_Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class ArrList存储学生对象并排序 {
    public static void main(String[] args) {
        ArrayList<Student> arrayList = new ArrayList<>();
        Student s1 = new Student(45,"sui");
        Student s2 = new Student(86,"duty");
        Student s3 = new Student(98,"er");
        Student s4 = new Student(21,"sad");

        arrayList.add(s1);
        arrayList.add(s2);
        arrayList.add(s3);
        arrayList.add(s4);

        Collections.sort(arrayList, new Comparator<Student>() {
            @Override
            public int compare(Student ss1, Student ss2) {
                int num = ss1.getAge()-ss2.getAge();
                int num2 = num == 0?ss1.getName().compareTo(ss2.getName()):num;
                return num2;
            }
        });
        for (Student student : arrayList) {
            System.out.println(student.getAge()+" "+student.getName());
        }


    }



}
