package _20210217_多线程;

public class 多线程的实现方式二 {
    public static void main(String[] args) {
        Myrunnable m1 = new Myrunnable();  //同一个资源，有多个线程使用


        //传递runnable线程作为参数
        Thread t1 = new Thread(m1,"1111");
        Thread t2 = new Thread(m1,"2222");



        t1.start();
        t2.start();
    }
}
