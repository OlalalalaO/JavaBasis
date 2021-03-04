package _20210225_反射;

public class Student {
    private String name;
    int age;
    public String address;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private Student(String name) {
        this.name = name;
    }

    public Student() {
    }

    public Student(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public String method3(String s,int i){
        return s+i;
    }
    private void fun(){
        System.out.println("私有方法被调用");
    }

    public void method1(){
        System.out.println("此方法被调用");
    }
    public void method2(String s){
        System.out.println("method"+s);
    }
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
