package _20210224_函数式接口_未完;

public class MyInterfaceDemo {
    public static void main(String[] args) {
        MyInterface my = ()-> System.out.println("函数式接口");
        my.show();
    }
}
