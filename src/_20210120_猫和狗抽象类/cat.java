package _20210120_猫和狗抽象类;

public class cat extends animal {


    public cat() {
    }

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    public cat(String name, int age) {
        super(name, age);
    }
}
