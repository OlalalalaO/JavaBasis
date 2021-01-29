package _20210128_System;

public class system {
    public static void main(String[] args) {
        System.out.println("开始");
        //System.exit(0); //结束虚拟机
        System.out.println("结束");
        System.out.println(System.currentTimeMillis()); //返回当前时间和1970年之间的毫秒值
        System.out.println(System.currentTimeMillis() * 1.0 / 1000 / 60 / 60 / 24 / 365);  //计算当前和1970年有多少年

        long time1 = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            System.out.println(i);
        }
        long time2 = System.currentTimeMillis();
        System.out.println(time2-time1);
    }
}
