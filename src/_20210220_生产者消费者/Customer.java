package _20210220_生产者消费者;

public class Customer implements Runnable{
    private Box b;
    public Customer(Box b) {
        this.b = b;
    }

    @Override
    public void run() {
        while (true){  //获取奶箱中的奶
            try {
                b.get();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
