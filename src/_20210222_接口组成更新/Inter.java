package _20210222_接口组成更新;

public interface Inter{
    void show();
    default void method(){
        System.out.println("Inter中的默认方法执行了");
    };
    public static void test(){  //只可以被接口调用
        System.out.println("Inter中的静态方法执行了");
    };
}
