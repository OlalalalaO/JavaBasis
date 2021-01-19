package _20210118_ArrayList;

import This.Student;

import java.util.ArrayList;
/*创建一个学生集合*/
public class array_student {
    public static void main(String[] args) {
        ArrayList<student> arr = new ArrayList<>();
        student s1 = new student("林青霞",30);
        student s2 = new student("张曼玉",23);
        student s3 = new student("蜘蛛侠",18);

        arr.add(s1);
        arr.add(s2);
        arr.add(s3);

        /*遍历集合*/
        for(int i = 0;i<arr.size();i++){
            student s = arr.get(i);
            System.out.println(s.getAge()+s.getName());
        }
    }

}
