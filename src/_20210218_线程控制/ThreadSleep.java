package _20210218_线程控制;

public class ThreadSleep extends Thread{
    @Override
    public void run() {
        for (int i = 0;i<100;i++){
            System.out.println(getName()+" "+i);
            try {
                Thread.sleep(1000);//每输出一次后，线程休眠一秒
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
