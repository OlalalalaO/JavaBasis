package _20210121_接口;

public class cat implements jumpping{ //接口和类之间用implements ，类实现接口
    @Override
    public void jump() {
        System.out.println("猫可以跳高了");
    }
}
