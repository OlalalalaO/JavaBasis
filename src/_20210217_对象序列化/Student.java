package _20210217_对象序列化;

import java.io.Serializable;

public class Student implements Serializable {
    private static final long serialVersionUID = 100;//设置自己的id
    private String name;

    private transient int age; //被此关键字修饰的对象不参与序列化，不会改变

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
