package _20210119_final;

public class Final {
    public static void main(String[] args) {
        final int age = 20; //final修饰基本类型，基本类型中的数据不可改变
        System.out.println(age);
        final student s = new student(); //final 修饰引用类型可变，内容可变，地址不可变
        System.out.println(s.age);
        s.age = 100;
        System.out.println(s.age);
        //s = new student();  //不可变,不可将s指向新的地址
    }
}
