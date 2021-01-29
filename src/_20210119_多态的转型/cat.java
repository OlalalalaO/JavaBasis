package _20210119_多态的转型;

public class cat extends animal {
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
    public void playGame(){
        System.out.println("玩捉迷藏");
    }
}
