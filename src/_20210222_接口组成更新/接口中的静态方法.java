package _20210222_接口组成更新;

public class 接口中的静态方法 {
    public static void main(String[] args) {
        Inter i = new InterImpl();
        i.show();
        i.method();
        Inter.test();
        Flyable.test();

    }
}
