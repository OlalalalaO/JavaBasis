package _20210123_猫和狗接口版;

public class dog extends animal implements jumooing{
    @Override
    public void eat(){
        System.out.println("猫吃鱼");
    }

    @Override
    public void jump() {
        System.out.println("狗可以调高");
    }

    public dog() {
    }

    public dog(String name, int age) {
        super(name, age);
    }
}
