package _20210215_集合到文件排序版;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class 集合排序到文件 {
    public static void main(String[] args) throws IOException {
        TreeSet<Student> ts = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {//调用的对象是compare方法的第一个参数,集合中的对象是compare方法的第二个参数
                int num = s2.getSum() - s1.getSum(); //主要条件,自然排序，s1-s2，从小到大
                int num2 = num == 0?s2.getLanguage() - s1.getLanguage():num;
                int num3 = num2 ==0?s2.getMath()-s2.getMath():num2;
                //次要条件
                return num3;
            }
        });
        for (int i = 0; i < 5; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入第"+(i+1)+"个学生信息");
            System.out.println("姓名");
            String name = sc.next();
            System.out.println("数学");
            int math = sc.nextInt();
            System.out.println("语文");
            int lan = sc.nextInt();

            Student student = new Student(name,math,lan);
            ts.add(student);
        }
        BufferedWriter bw = new BufferedWriter(new FileWriter("res\\stu.txt"));

        for (Student t : ts) {
            StringBuilder sb = new StringBuilder();
            sb.append(t.getName()).append(",").append(t.getLanguage()).append(",").append(t.getMath()).append(",").append(t.getSum());
            bw.write(sb.toString());
            bw.newLine();
            bw.flush();
        }
        bw.close();
    }
}
