package student;
/*
    构造方法
 */
public class student {
    String name ;
    int age;
    /*
    构造方法，必须与类名相同
    如果没有构造方法，系统将提供默认
    可以有多个构造方法,方法内参数也可不同
    可重载
     */
    public student(String name,int age){
        this.name = name;
        this.age = age;
    }
    public student(String name){
        this.name = name;
    }
    public student(int age){
        this.age = age;
    }
    public void show(){
        System.out.println(name+","+age);
    }
}
