package _20210225_反射;

public class RefletDemo {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<Student> c1 = Student.class;  //获取class对象,最方便
        System.out.println(c1);
        Class<Student> c2 = Student.class;  //字节码对象相同
        System.out.println(c2);

        Student s = new Student();
        Class<? extends Student> c3 = s.getClass();
        System.out.println(c3);

        Class<?> c4 = Class.forName("_20210225_反射.Student");  //最灵活
        System.out.println(c4);


    }
}
