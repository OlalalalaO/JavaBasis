package _20210220_生产者消费者;

public class Producer implements Runnable{
    private Box b;
    public Producer(Box b) {
        this.b = b;
    }

    @Override
    public void run() {
        for (int i = 1;i<=5;i++){ //生产了5瓶牛奶
            try {
                b.put(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
