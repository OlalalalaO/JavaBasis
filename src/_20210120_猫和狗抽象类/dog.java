package _20210120_猫和狗抽象类;

public class dog extends animal{
    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }

    public dog(String name, int age) {
        super(name, age);
    }

    public dog() {
    }
}
