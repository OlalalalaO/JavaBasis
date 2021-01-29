package _20210120_抽象类的成员特点;

public class animalDemo {
    public static void main(String[] args) {
        animal a = new cat();
        a.eat(); //cat对animal的重写
        a.show(); //animal类中的方法
    }
}
