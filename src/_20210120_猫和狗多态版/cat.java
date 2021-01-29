package _20210120_猫和狗多态版;

public class cat extends animal{
    public cat() {

    }

    public cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
}
