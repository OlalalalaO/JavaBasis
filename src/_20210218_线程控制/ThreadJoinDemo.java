package _20210218_线程控制;

public class ThreadJoinDemo {
    public static void main(String[] args) throws InterruptedException {
        ThreadJoin my1 = new ThreadJoin();
        ThreadJoin my2 = new ThreadJoin();
        ThreadJoin my3 = new ThreadJoin();


        my1.setName("康熙");
        my2.setName("四阿哥");
        my3.setName("八阿哥");

        my1.start();
        my1.join(); //my1执行完毕后，其他才执行，join等待这个线程结束
        my2.start();
        my3.start();
    }
}
