package _20210222_λ表达式;

public class lambdaDemo {
    public static void main(String[] args) {
/*        MyRunnable my = new MyRunnable();
        Thread t = new Thread(my);
        t.start();*/
        /*
        //匿名内部类
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("多线程程序启动了");
            }
        }).start();*/


        //lambda表达式
        new Thread(()->{
            System.out.println("多线程启动了");
        }).start();
    }
}
