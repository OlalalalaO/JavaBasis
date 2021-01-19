package _20210118_ArrayList;
 /*创建一个学生类*/
public class student {
    private String name;
    private int age;
    public student(String name,int age){
        this.age = age;
        this.name = name;
    }

     public student() {

     }

     public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getName(){
        return name;
    }

    public int getAge() {
        return age;
    }
}
