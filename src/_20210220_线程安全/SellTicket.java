package _20210220_线程安全;

import java.util.concurrent.locks.ReentrantLock;

/*
可能出现的问题
是否是多线程操作

是否共享数据

是否对共享数据进行操作  ：将数据锁起来，任意时刻只可有一个线程进行操作   ---同步代码块
 */
public class SellTicket implements Runnable{
    private int tickets = 100; //票数
    private ReentrantLock lock = new ReentrantLock(); // 创建一个锁
    private  Object obj = new Object();  //多个线程共用一把锁
    @Override
    public void run() {
        while (true){
            try {
                lock.lock(); //枷锁
                if(tickets>0){
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println(Thread.currentThread().getName()+"正在出售第"+tickets+"张票"); //拿到窗口名称
                    tickets--;
            }

            }finally {
                lock.unlock();  //释放锁
            }

        }

    }
}
