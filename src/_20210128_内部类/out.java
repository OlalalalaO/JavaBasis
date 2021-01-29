package _20210128_内部类;
/*
匿名内部类,继承了该类或实现了接口的子类的匿名对象
 */
public class out {
    public void method(){
        new inter(){
            @Override
            public void show() {
                System.out.println("匿名内部类");
            }
        }.show();//对象调用show()方法
        new inter(){
            @Override
            public void show() {
                System.out.println("匿名内部类");
            }
        }.show();//对象调用show()方法   调用两次
        /*
        多次调用
         */
        inter i = new inter(){
            @Override
            public void show() {
                System.out.println("匿名内部类");
            }
        };//对象调用show()方法
        i.show();
    }
}
