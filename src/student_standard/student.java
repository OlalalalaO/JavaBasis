package student_standard;

import java.sql.SQLOutput;

/*
标准类的制作
    成员变量：用private
    构造方法：无参
            有参
    成员方法：get/set方法用于获取，修改成员变量
            包含一个现实对象信息的show()方法
 */
// 构造方法
public class student {
    private String name;
    private int age;
    public student(String name,int age){
        this.name = name;
        this.age = age;
    }
    // 手动添加无参
    public student() {

    }

    // 成员方法
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public void show(){
        System.out.println(name+","+age);
    }
}
