package _20210217_多线程;
/*
thread 一个线程类
 */
public class 多线程的实现方式 extends Thread{


    public static void main(String[] args) {
        System.out.println(currentThread().getName());  //返回当前的线程，即main所在线程
        /*      带参构造方法
                提供带参构造方法
         */
        myThread my1 = new myThread("飞机");
        myThread my2 = new myThread("高铁");

/*      无参构造方法
        myThread my1 = new myThread();
        myThread my2 = new myThread();
        my1.setName("高铁");
        my2.setName("飞机");*/
/*      这样并不会启动线程
        my1.run();
        my2.run();*/

        //用start同时进行
        my1.start();
        my2.start();
    }
}
