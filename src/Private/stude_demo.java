package Private;

public class stude_demo {
    public static void main(String[] args) {
       student s = new student();
       s.name = "林青霞";
       //s.age = 30;
//        s.age = 31; //通过外界可以直接访问成员变量，存在安全隐患
       // s.name = 21; //name被加上private,不可被访问
        System.out.println(s.get_age());
        s.set_age(90);
        System.out.println(s.get_age());
       s.show();
    }
}
