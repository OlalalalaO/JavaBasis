package _20210220_生产者消费者;
/*
奶箱
 */
public class Box {
    private int milk; //表示第几瓶牛奶
    private boolean state = false;//定义奶箱状态
    public synchronized void put(int milk) throws InterruptedException {
        if(state){ //有就等待
            wait(); //等待的过程中，t2被唤醒
        }
        //如果没有牛奶就生产
        this.milk = milk;
        System.out.println("送奶工将第"+this.milk+"瓶奶，放入奶箱"); //第一次放奶
        state = true;//生产完毕表示有奶
        notifyAll();
    }
    public synchronized void get() throws InterruptedException {
        if(!state){
            wait();
        }
        //如果有，就消费
        System.out.println("用户拿到第"+this.milk+"瓶奶"); //put等待的过程中，get唤醒，拿走奶
        state = false;
        //唤醒其他线程
        notifyAll();
    }
}
