package _20210222_接口组成更新;

public class MyinterfaceImpl1 implements Myinterface{  //重写接口中的所有抽象方法
    @Override
    public void show1() {
        System.out.println("show1");
    }

    @Override
    public void show2() {
        System.out.println("show2");
    }

    @Override
    public void show3() {
        System.out.println("啦啦啦啦");
    }
}
