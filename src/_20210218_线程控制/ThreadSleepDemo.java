package _20210218_线程控制;

public class ThreadSleepDemo {
    public static void main(String[] args) {
        ThreadSleep my1 = new ThreadSleep();
        ThreadSleep my2 = new ThreadSleep();
        ThreadSleep my3 = new ThreadSleep();

        my1.setName("曹操");
        my2.setName("刘备");
        my3.setName("孙权");


        my1.start();
        my2.start();
        my3.start();

    }
}
