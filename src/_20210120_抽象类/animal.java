package _20210120_抽象类;
/*
    抽象类和抽象方法必须使用abstract
 */
public abstract class animal { //抽象类，含有抽象方法的类
    /*
    抽象方法 不给出方法体
     */
    public abstract void eat(); //不是具体的，不给出方法，由子类自己定义
    public void sleep(){
        System.out.println("睡觉"); //抽象类可以有抽象方法，也可以有普通方法，也可以仅有普通方法
    }
}
