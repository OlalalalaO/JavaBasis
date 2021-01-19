package student_standard;

public class studentDemo {
    public static void main(String[] args) {
        // 采用无参构造方法创建对象
        student s1 = new student();
        s1.setName("林青霞");
        s1.setAge(18);
        s1.show();
        //  采用带多个参数创建带有属性值的对象
        student s2 = new student("张曼玉",18);
        s2.show();
    }

}
