package This;

import private_use.student;
public class StudentDemo {
    public static void main(String[] args) {
        student s = new student();
        s.setName("林青霞");
        s.setAge(30);
//调用show
        s.show();
    }
}
