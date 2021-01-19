package _20210118_extend;
/*
父类
 */
public class Father {
    public int age = 10;
    public void show(){
        System.out.println("show方法被调用");
    }
    public Father(){
        System.out.println("父类中无参构造方法被调用");
    }
    public Father(int age){
        System.out.println("父中带餐构造方法被调用");
    }
}
