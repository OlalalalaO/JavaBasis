package _20210119_多态;
/*
变量在不同的时刻表现不同的状态
 */
/*
多态的前提
    有继承
    有重写
    有父类引用子类
 */
public class Polymorphism {
    public static void main(String[] args) {
//      成员变量 编译看左边，执行看左边
        animal a = new cat(); //父类引用子类对象 ，定义了一个animal 的对象
        System.out.println( a.age); //访问的是animal中的
        System.out.println(((cat) a).age); //访问的是cat中的，    animal中有的可以直接加.
        //父类中没有，子类中有的必须加（）
        //成员方法，编译看左边，运行看右边
         a.say();
         a.eat(); //默认子类
         ((cat) a).playGame();
    }
}
