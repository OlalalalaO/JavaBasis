package _20210222_接口组成更新;

public interface Inter1 {
    default void show1(){
        System.out.println("show1程序开始执行");
        show();
        System.out.println("show1程序结束执行");
    }

    default void show2(){
        System.out.println("show2程序开始执行");
        show();
        System.out.println("show2程序结束执行");
    }

    static void method1(){
        System.out.println("method1程序开始执行");
        //在method1里调用show必须是show方法static化
        method();
        System.out.println("method1程序结束执行");
    }

    static void method2(){
        System.out.println("method2程序开始执行");
        method();
        System.out.println("method2程序结束执行");
    }
    private  void show(){
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
    }
    private static void method(){
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
    }
}
