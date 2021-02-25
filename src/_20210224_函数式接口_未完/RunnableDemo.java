package _20210224_函数式接口_未完;
//函数式接口作为方法的参数
public class RunnableDemo {
    public static void main(String[] args) {

        //匿名内部类
        startThread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"线程启动了");
            }
        });

        //lambda表达式
        startThread(()-> System.out.println(Thread.currentThread().getName()+"线程启动了"));
    }
    private static void startThread(Runnable r){  //Runnable是一个函数式接口，只有一个run
        Thread t = new Thread(r);
        t.start();
    }
}
