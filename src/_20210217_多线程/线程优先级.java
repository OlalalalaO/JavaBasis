package _20210217_多线程;
/*
线程调度模型：
    1.分时调度
    2.抢占式调度：按优先级来，相同优先级随机来
 */
public class 线程优先级 {
    public static void main(String[] args) {
        myThread my1 = new myThread("飞机");
        myThread my2 = new myThread("高铁");
        myThread my3 = new myThread("火箭");
        System.out.println(my1.getPriority()); //获取优先级：5
        System.out.println(my2.getPriority());
        System.out.println(my3.getPriority());
        my1.setPriority(5);  //最大值10，最小值1，默认5
        my2.setPriority(1);
        my3.setPriority(10);
        //线程优先级高，仅仅表示获取CPU时间片的次数高
        my1.start();
        my2.start();
        my3.start();
    }
}
