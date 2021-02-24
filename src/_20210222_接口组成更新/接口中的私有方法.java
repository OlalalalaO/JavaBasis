package _20210222_接口组成更新;

public class 接口中的私有方法 {
    public static void main(String[] args) {
        Inter1 i = new Inter1Impl();
        i.show1();
        i.show2();
        Inter1.method1();
        Inter1.method2();
    }
}
