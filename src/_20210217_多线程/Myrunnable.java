package _20210217_多线程;

public class Myrunnable implements Runnable{ //可以有自己的父类
    //避免了java的单继承，可以把线程和程序的代码有效分离
    @Override
    public void run() {
        for (int i = 0;i<100;i++){
            System.out.println(Thread.currentThread().getName()+" "+i);
        }
    }
}
