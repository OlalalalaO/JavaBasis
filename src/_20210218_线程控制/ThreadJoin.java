package _20210218_线程控制;
/*
线程死亡
 */
public class ThreadJoin extends Thread{
    @Override
    public void run() {
        for (int i = 0;i<100;i++){
            System.out.println(getName()+" "+i);
            }
        }
    }

