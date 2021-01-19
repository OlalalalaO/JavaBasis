package This;
/*
学生类
 */
public class Student {
    private String name;
    private int age;
    public void setName(String name){
        this.name = name;  //=右边是局部变量，=左边是全局变量
        //this.name为成员变量(全局变量)，局部变量和成员变量同名的情况下
        //方法被哪个对象调用，this代表哪个对象
    }

    public String getName() {
        return name;
    }

    public void setAge(int a) {
        age = a;
    }

    public int getAge() {
        return age;
    }

    public void show() {
        System.out.println(name + "," + age);
    }
}
