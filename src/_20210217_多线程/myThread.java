package _20210217_多线程;
/*
    创建一个线程
    1.将类继承了thread 类
    2.重写run()方法
    3.创建对象
    4.start启动线程
    注：直接调用run只是简单调用
    多线程调用用start
 */
/*
    setname()设置线程名称


    getname()得到线程名称,默认为thread - num(num默认从0开始)
 */
public class myThread extends Thread{
    //带参构造方法

    public myThread() {
    }

    public myThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0;i<100;i++){
            System.out.println(getName()+" "+i);
        }
    }
}
