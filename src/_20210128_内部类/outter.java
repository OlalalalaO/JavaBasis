package _20210128_内部类;
/*
局部内部类
 */
public class outter {
    private int num = 20;

    public void show() {
        int num2 = 30;
        class inner { //局部内部类，在成员方法中的类
            public void method() {
                System.out.println(num);
                System.out.println(num2); //可以访问方法内的局部变量
            }



        }
        inner i = new inner(); //创建一个局部内部类，调用方法
        i.method();
    }
}
