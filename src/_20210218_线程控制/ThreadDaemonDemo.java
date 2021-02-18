package _20210218_线程控制;

public class ThreadDaemonDemo {
    public static void main(String[] args) {
        ThreadJoin my1 = new ThreadJoin();
        ThreadJoin my2 = new ThreadJoin();


        my1.setName("关羽");
        my2.setName("张飞");

        //设置主线程
        Thread.currentThread().setName("刘备");  //设置主线程
        //设置守护线程,当主线程结束后，其他线程挣扎着死亡
        my1.setDaemon(true);
        my1.setDaemon(true);
        my1.start();
        my2.start();
        for(int i = 0;i<10;i++){
            System.out.println(Thread.currentThread().getName()+" "+i);
        }
    }
}
