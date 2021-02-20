package _20210218_买票;

public class SellTicket implements Runnable{
    private int tickets = 100; //票数

    @Override
    public void run() {
        while (true){
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
        }

    }
}
