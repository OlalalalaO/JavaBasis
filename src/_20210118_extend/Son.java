package _20210118_extend;
/*
子类
 */
/*
子类可以有父类的内容，子类可以有自己特有的内容
 */
public class Son extends Father{ //子类继承父类，子类便可调用父类方法
    public int height = 175;
    public int age = 20;
    public void methodofboy(){
        int age = 30;
       /* System.out.println(age); //访问方法中的成员变量
        System.out.println(this.age);   //访问类中的变量
        System.out.println(super.age);  //访问父类的变量
        System.out.println(height);*/
        System.out.println("method方法被调用");
    }
        public Son(){
       // super(20); //父类中无参构造方法被删去，用子类创建对象时，默认访问无参构造方法，此时报错，加上super(),使得子类创建对象是被引导至带参构造方法
        System.out.println("子类中无参构造方法被调用");
    }
    public Son(int age){
        //super(20);
        System.out.println("子中带餐构造方法被调用");
    }
}
