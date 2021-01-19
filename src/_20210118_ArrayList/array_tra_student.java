package _20210118_ArrayList;

import This.Student;

import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

//输入学生信息，存储在arraylist中
public class array_tra_student {
    public static void main(String[] args) {
        ArrayList<student> arrayList = new ArrayList<>();
        stu(arrayList);
        stu(arrayList);
        stu(arrayList);
        for(int i = 0;i<arrayList.size();i++){
            student s = arrayList.get(i);
            System.out.println(s.getName()+""+s.getAge());
        }
    }
    public static void stu(ArrayList<student> arrayList){
        Scanner scanner = new Scanner(System.in);
        student student;
        System.out.println("请输入学生姓名");
        String name = scanner.nextLine();
        System.out.println("请输入学生年龄");
        int age = scanner.nextInt();
        student S = new student();
        S.setAge(age);
        S.setName(name);
        arrayList.add(S);
    }
}
