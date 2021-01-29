package _20210120_抽象类的成员特点;

public abstract class animal {
    private int age = 20;
    private final String city = "北京";
    private final StringBuilder loc = new StringBuilder("中国");
    public void show(){
        age = 20;  //不报错
        System.out.println(age);
        //city = "上海"; 报错   final 不可以指向新的空间，string类型,是改变指向的地址
        System.out.println(city);
        //loc = "riben";
    }
    public abstract void eat();
    public animal(){ //抽象类不能实例化，但是可以通过多态的方式进行实例化，所以有构造方法

    }

    public animal(int age) { //用于子类方法父类数据的初始化
        this.age = age;
    }
}
