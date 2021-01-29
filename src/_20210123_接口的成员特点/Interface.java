package _20210123_接口的成员特点;

public interface Interface {
    public int num = 0; //可以有成员变量
    public final int num2 = 10;
    // 默认  public static fianl ，全是默认的常量


    // 接口没有构造方法！！
    // 所有方法访问父类默认OBJECT
    //接口里全是抽象方法,默认是抽象方法
    public abstract void method();
}