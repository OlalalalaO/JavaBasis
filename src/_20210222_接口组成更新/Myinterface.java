package _20210222_接口组成更新;

public interface Myinterface {
    void show1();
    void show2();

    /*void show3();*/
    default void show3() {  //默认方法,可以不被重写
        System.out.println("show3");
    }
}
