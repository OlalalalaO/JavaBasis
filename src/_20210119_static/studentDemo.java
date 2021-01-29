package _20210119_static;

public class studentDemo {
    public static void main(String[] args) {
        /*
        非静态的成员方法：能访问静态的和非 静态的
        静态的成员方法：能访问静态的，非静态的不可访问



         */
        student s = new student();
        s.age = 10;
        s.university = "w";   //被所有人共享
        s.name = "1";
        s.show();
        student s1 = new student();
        s1.name = "1";
        s1.age = 9;
        s1.show();
        System.out.println(student.university); //被静态修饰的对象可以通过类名访问
    }
}
