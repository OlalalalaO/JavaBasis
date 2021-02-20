package _20210218_买票;
/*
可能出现的问题
是否是多线程操作

是否共享数据

是否对共享数据进行操作  ：将数据锁起来，任意时刻只可有一个线程进行操作   ---同步代码块
 */
public class SellTicket implements Runnable{
    private int tickets = 100; //票数
    private  Object obj = new Object();  //多个线程共用一把锁
    @Override
    public void run() {
        while (true){
            //t1休息时t2抢到了执行权，也进不去
            synchronized (obj){  //上锁，同步代码块
                //在锁内，别的线程进不来
                //但当多个线程时，每个线程都要判断锁，耗费资源
                if(tickets>0){
                    try {
                        Thread.sleep(100);  //出现相同的票数和-1
                    /*
                    假设t1开始休眠时，t2开始执行
                    t2开始执行时，也休息100ms
                    t3开始执行

                     */
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    //假设线程按照顺序醒过来
                    //t1醒过来，在控制台窗口输出100张
                    System.out.println(Thread.currentThread().getName()+"正在出售第"+tickets+"张票"); //拿到窗口名称
                    //假设此时t2也醒来，在控制台输出100张
                    //t3同理
                    tickets--;
                    //如果在此时醒来，执行了3次--操作，最终票数变成了97
            }
            //同步方法的锁的对象为this
            //静态方法的锁对象是 - 类名.class

            }
        }

    }
}
